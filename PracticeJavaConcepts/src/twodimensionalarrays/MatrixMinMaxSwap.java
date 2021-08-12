package twodimensionalarrays;

import java.util.Scanner;

public class MatrixMinMaxSwap {
	/*
	 * input: 1 2 3
	 * 		  4 5 6
	 * 		  7 8 9
	 * 
	 * output:9 2 3
	 * 		  4 5 6
	 * 		  7 8 1
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the rows of the array : ");
		int rows = sc.nextInt();
		System.out.println("enter the columns of the array : ");
		int cols = sc.nextInt();
		int arr[][] = new int[rows][cols];
		System.out.println("enter array elements : ");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println("********before swapping**********");
		printArray(arr, rows, cols);
		System.out.println("********after swapping***********");
		printArray(findMinMax(arr, rows, cols), rows, cols);
	}

	static int[][] findMinMax(int[][] arr, int rows, int cols) {
		int minRowIndex = 0, minColIndex = 0, maxRowIndex = 0, maxColIndex = 0;
		
		// find the minimum and maximum row as well as column indexes
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if (arr[i][j] < arr[minRowIndex][minColIndex]) {
					minRowIndex = i;
					minColIndex = j;
				}
				if (arr[i][j] > arr[maxRowIndex][maxColIndex]) {
					maxRowIndex = i;
					maxColIndex = j;
				}
			}
		}
		return swapMinMaxElements(arr, minRowIndex, minColIndex, maxRowIndex, maxColIndex);

	}
	
	//swapping minimum element and maximum element in the matrix
	static int[][] swapMinMaxElements(int[][] arr, int minRow, int minCol, int maxRow, int maxCol) {
		int temp = arr[minRow][minCol];
		arr[minRow][minCol] = arr[maxRow][maxCol];
		arr[maxRow][maxCol] = temp;
		return arr;
	}

	//print the matrix elements
	static void printArray(int arr[][], int rows, int cols) {
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}

