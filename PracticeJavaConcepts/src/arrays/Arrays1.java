package arrays;

import java.util.Scanner;

public class Arrays1 {
	/*
	 * input1 : 1 2 3
	 * input2 : 4 1 6
	 * 
	 * output1 : -3 1 -3
	 * output2 : -3 -3
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of the arrays : ");
		int length=sc.nextInt();
		
		//creating 3 arrays with same length
		int arr1[] = new int[length];
		int arr2[] = new int[length];
		int resultantArray[] = new int[length];
		System.out.println("enter 1st array elements : ");
		for (int i = 0; i < length; i++) {
			arr1[i] = sc.nextInt();
		}
		System.out.println("enter 2nd array elements : ");
		for (int i = 0; i < length; i++) {
			arr2[i] = sc.nextInt();
		}
		subtractInputArrays(arr1, arr2, resultantArray);
		createArrayWithNegativeNumbers(resultantArray);
	}
	
	
	//subtract each element of array1 with array2 and store the result in resultant array
	static void subtractInputArrays(int[] arr1, int[] arr2, int[] resultantArray) {
		for (int i = 0; i < resultantArray.length; i++) {
			resultantArray[i] = arr1[i] - arr2[i];
		}
		printArray(resultantArray);
	}

	//print the resultant array
	static void printArray(int[] resultantArray) {
		for (int i = 0; i < resultantArray.length; i++) {
			System.out.print(resultantArray[i] + " ");
		}
		System.out.println();
	}

	
	//create an array with all the negative numbers in the resultant array and print it
	static void createArrayWithNegativeNumbers(int[] resultantArray) {
		int count1 = 0, count2 = 0;
		for (int i = 0; i < resultantArray.length; i++) {
			if (resultantArray[i] < 0)
				count1++;
		}
		int arrayWithNegativeNum[] = new int[count1];
		for (int i = 0; i < resultantArray.length; i++) {
			if (resultantArray[i] < 0) {
				arrayWithNegativeNum[count2] = resultantArray[i];
				count2++;
			}
		}
		printArray(arrayWithNegativeNum);
	}

}