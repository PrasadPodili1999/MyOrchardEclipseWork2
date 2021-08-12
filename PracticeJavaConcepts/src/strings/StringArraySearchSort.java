package strings;

import java.util.Scanner;
public class StringArraySearchSort {
/*
 * 1.first take user inputs as fruits as string array and a fruit name to be searched
 * 2.sort given input fruit array using bubble sort
 * 3.validate the given fruit name to be searched
 * 		i.if it is valid then search fruit in the fruits array using binary search
 * 			and binary search method should return the index at which the given fruit is present
 * 				if the binary search method returns index as non-negative number then print that index
 * 				else return fruit not found
 * 		  else print given input is invalid.
 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of the array : ");
		int size=sc.nextInt();
		String[] fruits=new String[size];
		System.out.println("enter fruits : ");
		for(int i=0;i<size;i++)
		{
			fruits[i]=sc.next();
		}
		sortFruits(fruits);
		System.out.println("enter a fruit name to search : ");
		String input=sc.next();
		if(isValid(input))
		{
			int result=searchFruit(fruits,input);
			if(result>=0)
			{
				System.out.println("fruit found at index : "+result);
			}
			else
			{
				System.err.println("fruit not found!!!");
			}
		}
		else
		{
			System.err.println("entered input is invalid!!!");
		}
	}
	//validating the given string input
	static boolean isValid(String input)
	{
		for(int i=0;i<input.length();i++)
		{
			if(input.charAt(i)<97||input.charAt(i)>122)
			{
				return false;
			}
		}
		return true;
	}
	//binary search
	static int searchFruit(String[] fruits,String input)
	{
		int low=0,high=fruits.length-1,searchedIndex=-1;
		
		while(low<=high)
		{
			int mid=(low+high)/2;
			int comparedValue=input.compareTo(fruits[mid]);
			if(comparedValue==0)
			{
				searchedIndex=mid;
				break;
			}
			else if(comparedValue>0)
			{
				low=mid+1;
			}
			else
			{
				high=mid-1;
			}	
		}
		return searchedIndex;
	}
	//bubble sort
	static void sortFruits(String []fruits)
	{
		String temp=null;
		for(int i=0;i<fruits.length-1;i++)
		{
			for(int j=0;j<fruits.length-1-i;j++)
			{
				if(fruits[j].compareTo(fruits[j+1])>0)
				{
					temp=fruits[j];
					fruits[j]=fruits[j+1];
					fruits[j+1]=temp;
				}
			}
		}
	}

}
