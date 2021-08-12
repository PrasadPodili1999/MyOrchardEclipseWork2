package strings;
/*
 * Write a program to read sentence with two words as an user input 
 * and swap both the words ignoring the letters which are common in both the words. 
 *  Return an error message if sentence contains more than 2 words
Example:
Input:  “Hello World”
Output: Wrd He



Pseudo code :

1.take user input of two words as a string
2.chaek it is two worded or not
3.if yes , first remove duplicates from the given string
4.after that reverse ecah word of the string obtained by removeduplicate()
5.finally reverse whole string obtained  by reverseeachword() and print it
 */
import java.util.Scanner;
public class CodingChallenge {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string of two words");
		String input=sc.nextLine();
		String temp="";
		if(isTwoWords(input))
		{
			System.out.println(reverseWords(removeDuplicate(input)));
			
		}
		else
		{
			System.err.println("plesase enter only two words");
		}
	}
	static boolean isTwoWords(String input)
	{
		int count=0;
		for(int i=0;i<input.length();i++)
		{
			if(input.charAt(i)==' ')
			{
				count++;
			}
		}
		if(count==1)
		{
			return true;
		}
		return false;
	}
	static String removeDuplicate(String input)
	{
		String temp="";
		for(int i=0;i<input.length();i++)
		{
			int count=0;
			for(int j=0;j<input.length();j++)
			{
				if(j!=i&&input.charAt(i)==input.charAt(j))
				{
					count++;
				}
			}
			if(count==0)
			temp=temp+input.charAt(i);
		}
		return temp;
	}
	static String reverseWords(String input)
	{
		int start=0;
		String temp="";
		for(int i=0;i<input.length();i++)
		{
			if(start==0&&input.charAt(i)==' ')
			{
				temp=temp+reverse(input,start,i)+" ";
				start=i+1;
			}
			if(i==input.length()-1)
			{
				temp=temp+reverse(input,start,i+1);
			}
		}
		temp=reverse(temp,0,temp.length());
		return temp;
	}
	static String reverse(String input,int start,int end)
	{
		String temp="";
		for(int i=end-1;i>=start;i--)
		{
			temp=temp+input.charAt(i);
		}
		return temp;
	}

}
