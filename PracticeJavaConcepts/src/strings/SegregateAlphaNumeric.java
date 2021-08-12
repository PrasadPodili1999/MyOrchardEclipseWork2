package strings;
import java.util.Scanner;
public class SegregateAlphaNumeric {

	/*
	 * input :1. welcome123   2. load234
	 * output:1. welcomad	  2.1234
	 */

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		//take two input strings from the user
		System.out.println("enter 1st string : ");
		String input1=sc.nextLine();
		System.out.println("enter 2nd string : ");
		String input2=sc.nextLine();
		String string1="",string2="";
		string1=makeAlphabaticString(input1,string1);
		string1=makeAlphabaticString(input2,string1);
		string2=makeNumericString(input1,string2);
		string2=makeNumericString(input2,string2);
		System.out.println("string1 : "+string1);
		System.out.println("string2 : "+string2);
	}
	
	//store all the unique characters into string1
	static String makeAlphabaticString(String str,String string1)
	{
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)>=65&&str.charAt(i)<=90||str.charAt(i)>=97&&str.charAt(i)<=122)
			{
				if(!isDuplicate(string1, str.charAt(i)))
				{
					string1=string1+str.charAt(i);
				}
			}
		}
		return string1;
	}
	
	//store all the numeric unique values into string2
	static String makeNumericString(String str,String string2)
	{
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)>=48&&str.charAt(i)<=57)
			{
				if(!isDuplicate(string2, str.charAt(i)))
				{
					string2=string2+str.charAt(i);
				}
			}
		}
		return string2;
	}
	
	//check whether the given character is already present in the string or not  
	static boolean isDuplicate(String str,char ch)
	{
		for(int i=0;i<str.length();i++)
		{
			if(ch==str.charAt(i))
			{
				return true;
			}
		}
		return false;
	}

}
