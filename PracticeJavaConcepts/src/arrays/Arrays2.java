package arrays;

import java.util.Scanner;
/*
 * 1.create an array with given length
 * 2.perform insertion sort on the array and print it
 * 3.create prime array--->first create primearray with length 0
 * 					   --->find out the prime numbers in the initial array
 * 					   --->if found create temp array with size of primearray.length+1 and copy primearray into temp array
 * 					   --->at the last position in the temp array store current prime value of initial array
 * 					   --->finally replace primearray with temp array
 * 					   --->write these steps in the for loop with condition (i<array.length).
 * 4.print primearray 
 */

public class Arrays2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of the array : ");
		int length = sc.nextInt();
		int arr[] = new int[length];
		System.out.println("enter array elements : ");
		for (int i = 0; i < length; i++) {
			arr[i] = sc.nextInt();
		}
		insertionSort(arr);
		createPrimeArray(arr);
	}

	static void insertionSort(int[] arr) {
		int j = 0;
		for (int i = 0; i < arr.length; i++) {
			int key = arr[i];
			for (j = i - 1; j >= 0 && key < arr[j]; j--) {
				arr[j + 1] = arr[j];
			}
			arr[j + 1] = key;
		}
		printArray(arr);
	}

	static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	static void createPrimeArray(int[] arr) {
		int primeArray[] = new int[0];
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			for (int j = 2; j <= arr[i]; j++) {
				if (arr[i] % j == 0)
					count++;
			}
			if (count == 1)
			{
				int temp[]=new int[primeArray.length+1];
				copyPrimeArrayIntoTempArray(primeArray,temp);
				temp[temp.length-1]=arr[i];
				primeArray=temp;
			}
		}
		printArray(primeArray);	
		
	}
	static void copyPrimeArrayIntoTempArray(int primeArray[],int temp[])
	{
		for(int i=0;i<primeArray.length;i++)
		{
			temp[i]=primeArray[i];
		}
	}

	/*static void copyPrimeValuesToPrimeArray(int[] arr, int[] primeArray) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			int count1 = 0;
			for (int j = 2; j <= arr[i]; j++) {
				if (arr[i] % j == 0)
					count1++;
			}
			if (count1 == 1) {
				primeArray[count] = arr[i];
				count++;
			}
		}
		printArray(primeArray);
	}*/

}

