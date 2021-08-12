package codereview;
import java.util.Scanner;
/*
 * Pseudo Code :
 * 
 * 1.take size and 2D array elements from the user
 * 2.create one method to sort matrix column elements
 * 3.to access column elements, row indices should be incremented and column index should be same for each column
 * 4.take nested for loop here 
 * 5.1st for loop is for column ,2nd for loop is for row, 3rd for loop is to sort
 * 6.here 2nd and 3rd for loops are used to sort column elements in bubble sort algorithm
 */
public class TwoDArraySort {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of the matrix : ");
		int size=sc.nextInt();
		int arr[][]=new int[size][size];
		System.out.println("enter matrix elements : ");
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("\nbefore sorting : \n");
		printArray(arr, size);
		sortColumns(arr,size);
		System.out.println("\nafter sorting : \n");
		printArray(arr, size);

	}
	static void sortColumns(int arr[][],int size)
	{
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size-1;j++)
			{
				for(int k=0;k<size-1-j;k++)
				{
					if(arr[k][i]>arr[k+1][i])
					{
						int temp=arr[k][i];
						arr[k][i]=arr[k+1][i];
						arr[k+1][i]=temp;
					}
				}
			}
		}
	}
	static void printArray(int[][] arr,int size)
	{
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
