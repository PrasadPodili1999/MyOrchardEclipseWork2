package policymanagement;

import java.util.Scanner;


/*
 * Pseudo Code:
 * 
 * 1.create an entity class(policy) thst should have given properties
 * 2.create Implementation class(policymanagementapp) that should have methods such as main,menu as well as
 * 		i.	create policy array with size 0 and create a temporary policy array with size (policies.length+user given length)
 * 			copy previous policy array into temp array and insert newly generated data into temp array itself.
 * 			finally replace policies array with temp array. while inserting validate the data.
 * 		ii. take user inputs as premium fee and premium mode
 * 			search for policy where premium fee is less than or equal to given premium fee and mode equal to given mode
 * 			display the selected policy
 * 		iii.create temp array with size of length value and store policy array into temp array
 *   		sort temp array using bubble sort algorithm  based on serial number
 *   		display temp array 
 *   	iv. take user inputs as premiumfee and serial number
 *   		search for given serial number
 *   		if found update premiumfee of that policy using setter method
 *   	v.  take serial number from the user 
 *   		search for given number if found from that policy element to last policy element just left shift by one position
 *   		and copy updated policy array into temp array except last element return temp array 
 *   		finally replace policy array with returned temp array
 */

public class PolicyManagementApp {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Policy policies[] = new Policy[0];
		int loopVar = 1;
		do {
			displayDemo();
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("enter how many policies do you want to add : ");
				int length = sc.nextInt();
				policies = addPolicies(policies, length);
				break;
			case 2:
				displayPolicyByGivenPremiumFeeAndMode(policies);
				break;
			case 3:
				Policy[] temp=sortPoliciesByNumber(policies);
				displayAllPolicies(temp);
				break;
			case 4:
				updatePremiumFeeByGivenPolicyNumber(policies);
				break;
			case 5:
				displayAllPolicies(policies);
				break;
			case 6:
				policies = deletePolicyByPolicyNumber(policies);
				System.out.println("policy deleted successfully");
				break;
			case 7:
				loopVar++;
				break;
			default:
				System.out.println("invalid input and please choose options from above list only.....");
			}
		} while (loopVar == 1);
	}

	static void displayDemo() {
		System.out.println("========================MENU==========================\n");
		System.out.println("1.add policies and display");
		System.out.println("2.display policy whose premium fee is less than or equal to given amount for given mode ");
		System.out.println("3.sort policy based on policy number and display policies");
		System.out.println("4.update premiumfee for particular policy based on given policy number ");
		System.out.println("5.display all policies in the system");
		System.out.println("6.delete movie for given movie id");
		System.out.println("7.exit");
		System.out.println("=======================================================");
	}

	static Policy[] addPolicies(Policy[] policies, int length) {

		Policy temp[] = new Policy[policies.length + length];
		copyPolicyDetailsIntoTempArray(policies, temp,policies.length);
		for (int i = 0; i < length; i++) {
			System.out.println("enter policy id : (pxxxxx)");
			String pid = sc.next();
			System.out.println("enter policy number : ");
			int pnumber = sc.nextInt();
			System.out.println("enter policy type : ");
			String type = sc.next();
			System.out.println("enter premium fee : ");
			double fee = sc.nextDouble();
			System.out.println("enter premium mode : ");
			String mode = sc.next();
			if (/*isValidMode(mode) && */isValidId(pid)) {
				temp[policies.length + i] = new Policy(pid, pnumber, type, fee, mode);
			} else {
				System.err.println("you are not entering valid inputs, please enter appropriate inputs!!");
			}
		}
		return temp;
	}

	static void copyPolicyDetailsIntoTempArray(Policy[] policies, Policy[] temp,int length) {
		for (int i = 0; i <length; i++) {
			temp[i] = policies[i];
		}
	}

	static void displayAllPolicies(Policy[] policies) {
		for (int i = 0; i < policies.length; i++) {
			displayPolicy(policies[i]);
		}
	}

	static boolean isValidMode(String mode) {
		if (mode.equals("quarterly") || mode.equals("halfyearly") || mode.equals("yearly")) {
			return true;
		}
		return false;
	}

	static boolean isValidId(String pid) {
		if (pid.charAt(0) == 'p') {
			return true;
		}
		return false;
	}

	static void displayPolicyByGivenPremiumFeeAndMode(Policy[] policies) {
		System.out.println("enter amount to be compared : ");
		double amount = sc.nextDouble();
		System.out.println("enter mode to be compared : ");
		String mode = sc.next();
		for (int i = 0; i < policies.length; i++) {
			if (policies[i].getPremiumFee() <= amount && policies[i].getPremiumMode().equals(mode)) {
				displayPolicy(policies[i]);
			}
		}
	}

	static void displayPolicy(Policy policy) {
		System.out.println("============================");
		System.out.println("policy id 	  : " + policy.getId());
		System.out.println("policy number : " + policy.getNumber());
		System.out.println("policy type   : " + policy.getType());
		System.out.println("premium fee   : " + policy.getPremiumFee());
		System.out.println("premium mode  : " + policy.getPremiumMode());
	}

	static Policy[] sortPoliciesByNumber(Policy[] policies) {
		Policy[] temp = new Policy[policies.length];
		copyPolicyDetailsIntoTempArray(policies, temp,policies.length);
		for (int i = 0; i < temp.length - 1; i++) {
			for (int j = 0; j < temp.length - 1 - i; j++) {
				if (temp[j].getNumber() < temp[j + 1].getNumber()) {
					Policy temp1 = temp[j];
					temp[j] = temp[j + 1];
					temp[j + 1] = temp1;
				}
			}
		}
		return temp;
	}
	
	

	static void updatePremiumFeeByGivenPolicyNumber(Policy[] policies) {
		System.out.println("enter policy number : ");
		int number = sc.nextInt();
		System.out.println("enter premium fee to be updated : ");
		double fee = sc.nextDouble();
		for (int i = 0; i < policies.length; i++) {
			if (policies[i].getNumber() == number) {
				policies[i].setPremiumFee(fee);
				displayPolicy(policies[i]);
			}
		}
	}

	static Policy[] deletePolicyByPolicyNumber(Policy[] policies) {
		System.out.println("enter policy number : ");
		int number = sc.nextInt();
		Policy[] temp = new Policy[policies.length - 1];
		for (int i = 0; i < policies.length; i++) {
			if (policies[i].getNumber() == number) {
				for (int j = i + 1; j < policies.length; j++) {
					policies[j - 1] = policies[j];
				}
			}
		}
		copyPolicyDetailsIntoTempArray(policies, temp,temp.length);
		return temp;
	}

}
