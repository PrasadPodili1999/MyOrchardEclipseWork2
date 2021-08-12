package strings;
import java.util.Scanner;

/*
 * pseudo code:
 * 
 * 1.take userinput of a string
 * 2.declare a count variable initialized with 0
 * 3.take one character and check for same char in given string from next character and
 * 		 no of char in b/w them is greater than count or not
 * 4.whereever found then change count to j-i-1 
 * 		and find substring b/w those equal characters
 * 		and assign i with j
 * 5.finally print longest substring
 */
public class LongestSubString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string : ");
		String input=sc.next();
		int count=0;
		String temp="";
		for(int i=0;i<input.length();i++)
		{
			for(int j=i+1;j<input.length();j++)
			{
				if(input.charAt(i)==input.charAt(j)&&j-i-1>count)
				{
					count=j-i-1;
					temp=subString(input, i+1, j);
					i=j;
				}
			}
		}
		System.out.println(temp);
		
	}
	static String subString(String s,int start,int end)
	{
		String temp="";
		for(int i=start;i<end;i++)
		{
			temp=temp+s.charAt(i);
		}
		return temp;
	}
	
}
