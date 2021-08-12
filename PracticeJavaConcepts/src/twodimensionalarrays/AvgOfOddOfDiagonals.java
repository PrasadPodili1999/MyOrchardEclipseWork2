package twodimensionalarrays;

import java.util.Scanner;

public class AvgOfOddOfDiagonals {
	/*
	 * 1.take a matrix of 3*3
	 * 2.find the average of odd elements of first diagonal of input matrix and print
	 * 3.find the average of odd elements of second diagonal of input matrix and print
	 */

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int matrix[][]=new int[3][3];
		int sum1=0,count1=0,sum2=0,count2=0;
		System.out.println("enter matrix elements : ");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				matrix[i][j]=sc.nextInt();
			}
		}
		System.out.println("first diagonal odd elements average : "+firstDiagonalAverage(matrix,sum1,count1));
		System.out.println("second diagonal odd elements average : "+secondDiagonalAverage(matrix,sum2,count2));
	}
	static int firstDiagonalAverage(int[][] matrix,int sum1,int count1)
	{
		for(int i=0;i<3;i++)
		{
			//finding odd elements of 1st diagonal
			if(matrix[i][i]%2==1)
			{
				sum1=sum1+matrix[i][i];
				count1++;
			}
		}
		return sum1/count1;		//average
	}
	static int secondDiagonalAverage(int[][] matrix,int sum2,int count2)
	{
		for(int i=0,j=2;i<3&&j>=0;i++,j--)
		{
			//finding odd elements of 2nd diagonal
				if(matrix[i][j]%2==1)
				{
					sum2=sum2+matrix[i][j];
					count2++;
				}	
		}
		return sum2/count2;		//average
	}

}

