package arrays;

import java.util.Scanner;
public class FindHighestNum {

	/*
	 * Write a program to find the number just higher than the user input from an array of integers.
	 *  
	 * Example :
	 *  Input		: 	arr[] = {84, 56, 33, 98, 196}
	 *  user input 	:	45
	 *  Output		:   56
	 *  
	 *  
	 *  Pseudo code:
	 *  
	 *  1.create an array of input values
	 *  2.take a value from the user
	 *  3.find maximum value from given array and store value in a min variable
	 *  4.check if number greater than array element and array element less than min variable
	 *  	4.1.if true assign min variable to array element
	 *  5 repeat step4 upto array length
	 *  6.finally print min variable
	 */
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		 int arr[] = {84, 56, 33, 98, 196};
		 System.out.println("enter a number");
		 int num=sc.nextInt();
		 int min=findMax(arr);
		 for(int i=0;i<arr.length;i++)
		 {
			 if(num<arr[i]&&arr[i]<min)
			 {
				min=arr[i]; 
			 }
		 }
		System.out.println(min);
	}
	static int findMax(int arr[])
	{
		int max=0;
		 for(int i=0;i<arr.length;i++)
		 {
			 if(arr[i]>max)
			 {
				 max=arr[i];
			 }
		 }
		 return max;
	}

}
