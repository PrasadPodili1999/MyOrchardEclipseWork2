package twodimensionalarrays;

import java.util.Scanner;

public class Transpose {

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
		
		displayMatrix(arr, rows, cols);
		displayMatrix(transpose(arr, rows, cols), rows, cols);
		//printArray(findMinMax(arr, rows, cols), rows, cols);

	}
	public static void displayMatrix(int [][]arr,int rows,int cols)
	{
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println("\n");
		}
	}
	public static int[][] transpose(int [][]arr,int rows,int cols)
	{
		int temp[][]=new int[rows][cols];
		for(int i=0;i<cols;i++)
		{
			for(int j=0;j<rows;j++)
			{
				temp[i][j]=arr[j][i];
			}
		}
		return temp;
	}

}
