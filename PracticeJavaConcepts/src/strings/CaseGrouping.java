package strings;
/*
 * input : Mindtree WebTech
 * output: Mindtree WTebech
 * 
 * psedo code:
 * 
 * 1.take user input of a sentence
 * 2.pass each word to group cases method and that method should group all capital alphabets together
 * 		later should group lower case letters together
 * 3.newly formed word should retun to changewords method
 * 4.that returned word should be added to temp string.
 * 5.like this, process will continue
 * 6.finally modified string should be displayed   
 */
import java.util.Scanner;
public class CaseGrouping {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string of line:");
		String input=sc.nextLine();
		System.out.println(changeWords(input));
	}
	static String changeWords(String input)
	{
		int start=0;
		String temp="";
		for(int i=0;i<input.length();i++)
		{
			if(start==0&& input.charAt(i)==' ')
			{
				temp=temp+groupCases(input,start,i)+" ";
				start=i;
			}
			else if(start!=0&&input.charAt(i)==' ')
			{
				temp=temp+groupCases(input,start,i)+" ";
				start=i;
			}
			else if(i==input.length()-1)
			{
				temp=temp+groupCases(input,start,i+1);
			}
				
		}
		return temp;
	}
	static String groupCases(String input,int start,int end)
	{
		String temp="";
		for(int i=start;i<end;i++)
		{
			if(input.charAt(i)>=65&&input.charAt(i)<=90)
			{
				temp=temp+input.charAt(i);
			}
		}
		for(int j=start;j<end;j++)
		{
			if(input.charAt(j)>=97&&input.charAt(j)<=122)
			{
				temp=temp+input.charAt(j);
			}
		}
		return temp;
	}

}
