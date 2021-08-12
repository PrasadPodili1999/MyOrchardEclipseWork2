package assetmanagement;

import java.util.Scanner;
/*
 * Pseudo Code:
 * 
 * 1.create an entity class(asset) thst should have given properties
 * 2.create Implementation class(assetallocationapp) that should have methods such as main,menu as well as
 * 		i.	create asset array with size 0 and create a temporary asset array with size (assets.length+user given length)
 * 			copy previous asset array into temp array and insert newly generated data into temp array itself.
 * 			display temp array
 * 		    replace assets array with temp array. while inserting validate the data.
 * 		ii. take user input of month
 * 			create temp array with size 0 
 * 			search for given month and if found create temp1 array with size as count value
 * 			copy temp into temp1 array and in the last position store searched asset
 * 			replace temp array with updated temp1 array 
 * 			sort temp array based on model using bubble sort algorithm
 * 		iii.take user input as model 
 * 			search for given model if found add quantity
 * 			display total quantity
 * 		iv. take user input as model and quantity
 * 			search for given model if found update quantity with given quantity using setter method
 * 			display updated asset every time
 * 		v.  take asset number from the user 
 *   		search for given number if found from that asset element to last asset element just left shift by one position
 *   		and copy updated asset array into temp array except last element return temp array 
 *   		finally replace asset array with returned temp array
 */

public class AssetAllocationApp {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Asset assets[] = new Asset[0];
		int loopVar = 1;
		do {
			displayDemo();
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("enter how many assets do you want to add : ");
				int length = sc.nextInt();
				assets = addAssets(assets, length);
				break;
			case 2:
				searchAssetByGivenMonth(assets);
				break;
			case 3:
				System.out.println("enter model : ");
				String model = sc.next();
				if (isValidModel(model))
					System.out.println(displayTotalQuantityByGivenModel(assets, model));
				else
					System.out.println("given model is invalid!!!");
				break;
			case 4:
				updateQuantityByGivenModel(assets);
				break;
			case 5:
				assets = deleteAssetByGivenAssetNumber(assets);
				System.out.println("asset deleted successfully");
				break;
			case 6:
				loopVar++;
				break;
			default:
				System.out.println("invalid input and please choose options from above list only.....");
			}
		} while (loopVar == 1);
	}

	static void displayDemo() {
		System.out.println("======================MENU===========================\n");
		System.out.println("1.add assets and display");
		System.out.println("2.search assets for given month and sort data by model ");
		System.out.println("3.display total quantity allotted for given model");
		System.out.println("4.update quantity for given model and display updated details ");
		System.out.println("5.delete assets for given serial number");
		System.out.println("6.exit");
		System.out.println("======================================================");
	}

	static Asset[] addAssets(Asset[] assets, int length) {
		Asset[] temp = new Asset[assets.length + length];
		copyAssetsIntoTempArray(assets, temp);
		for (int i = 0; i < length; i++) {
			System.out.println("enter serial number : ");
			int sNo = sc.nextInt();
			System.out.println("enter model name : ");
			String model = sc.next();
			System.out.println("enter allotted month : ");
			String month = sc.next();
			System.out.println("enter quantity : ");
			int qty = sc.nextInt();
			if (isValidModel(model) && isValidAllottedMonth(month)) {
				temp[assets.length + i] = new Asset(sNo, model, month, qty);
			} else {
				System.err.println("you are not entering valid inputs, please enter appropriate inputs!!");
			}
		}
		displayAllAssets(temp);
		return temp;
	}

	static void copyAssetsIntoTempArray(Asset[] assets, Asset[] temp) {
		for (int i = 0; i < assets.length; i++) {
			temp[i] = assets[i];
		}
	}

	static void displayAllAssets(Asset[] assets) {
		for (int i = 0; i < assets.length; i++) {
			displayAsset(assets[i]);
		}
	}

	static void displayAsset(Asset asset) {
		System.out.println("*************************");
		System.out.println("asset no : " + asset.getsNo());
		System.out.println("asset model : " + asset.getModel());
		System.out.println("asset allotted month : " + asset.getAllottedMonth());
		System.out.println("asset quantity : " + asset.getQuantity());
	}

	static void searchAssetByGivenMonth(Asset[] assets) {
		System.out.println("enter month to be searched : ");
		String month = sc.next();
		int count = 0, index = 0;
		Asset[] temp = new Asset[0];
		if (isValidAllottedMonth(month)) {
			for (int i = 0; i < assets.length; i++) {
				if (assets[i].getAllottedMonth().equals(month)) {
					count++;
					Asset[] temp1 = new Asset[count];
					copyAssetsIntoTempArray(temp, temp1);
					temp1[index++] = assets[i];
					temp = temp1;
				}
			}
			sortAssetsByModel(temp);
		} else
			System.err.println("given month is invalid!!!");
	}

//	static void sortAssetsByModel(Asset[] assets) {
//		Asset[] temp = new Asset[assets.length];
//		copyAssetsIntoTempArray(assets, temp);
//		for (int i = 0; i < temp.length - 1; i++) {
//			for (int j = 0; j < temp.length - 1 - i; j++) {
//				if (temp[j].getModel().compareTo(temp[j + 1].getModel()) > 0) {
//					Asset temp1 = temp[j];
//					temp[j] = temp[j + 1];
//					temp[j + 1] = temp1;
//				}
//			}
//		}
//		displayAllAssets(temp);
//	}
	
	static void sortAssetsByModel(Asset []assets)
	{
		Asset[] temp = new Asset[assets.length];
		copyAssetsIntoTempArray(assets, temp); 
		int j=0;
		for(int i=1;i<temp.length;i++)
		{
			Asset asset=temp[i];
			for(j=i-1;j>=0&&asset.getModel().compareTo(temp[j].getModel())<0;j--)
			{
				temp[j+1]=temp[j];
			}
			temp[j+1]=asset;
		}
		displayAllAssets(temp);
	}

	static int displayTotalQuantityByGivenModel(Asset[] assets, String model) {
		int sum = 0;
		for (int i = 0; i < assets.length; i++) {
			if (assets[i].getModel().equals(model)) {
				sum += assets[i].getQuantity();
			}
		}
		return sum;
	}

	static void updateQuantityByGivenModel(Asset[] assets) {
		System.out.println("enter model : ");
		String model = sc.next();
		System.out.println("enter quantity to be updated : ");
		int qty = sc.nextInt();
		if (isValidModel(model)) {
			for (int i = 0; i < assets.length; i++) {
				if (assets[i].getModel().equals(model)) {
					assets[i].setQuantity(qty);
					displayAsset(assets[i]);
				}
			}
		} else
			System.out.println("given model is invalid!!!");
	}

	static Asset[] deleteAssetByGivenAssetNumber(Asset[] assets) {
		System.out.println("enter asset number : ");
		int number = sc.nextInt();
		Asset[] temp = new Asset[assets.length - 1];
		for (int i = 0; i < assets.length; i++) {
			if (assets[i].getsNo() == number) {
				for (int j = i + 1; j < assets.length; j++) {
					assets[j - 1] = assets[j];
				}
			}
		}
		copyAssetsIntoTempArray(assets, temp);
		return temp;
	}

	static boolean isValidModel(String model) {
		if (model.equals("hp") || model.equals("lenovo") || model.equals("dell")) {
			return true;
		}
		return false;
	}

	static boolean isValidAllottedMonth(String month) {
		if (month.length() == 3) {
			return true;
		}
		return false;
	}

}
