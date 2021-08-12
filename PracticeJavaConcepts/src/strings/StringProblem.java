package strings;
import java.util.Scanner;

public class StringProblem {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter line of string : ");
		String input=sc.nextLine();
		System.out.println(input);
		int start=0,count=1;
		String result="";
		for(int i=0;i<=input.length();i++)
		{
			if(i==0&&input.charAt(i)==' ')
			{
				start=i+1;
				result=result+" ";
			}
			
				
			else if(i==input.length()||input.charAt(i)==' ')
			{
				if(count%2==1)
				{
					result=result+wordIncreseToNextChar(input,start,i)+" ";
					start=i+1;
				}
				else
				{
					result=result+wordReverse(input,start,i)+" ";
					start=i+1;
				}
				count++;
			}
		}
		System.out.println(result);

	}
	static String wordIncreseToNextChar(String input,int start,int i)
	{
		String temp="";
		for(int j=start;j<i;j++)
		{
			temp=temp+(char)(input.charAt(j)+1);
		}
		return temp;
	}
	static String wordReverse(String input,int start,int i)
	{
		String temp="";
		for(int j=i-1;j>=start;j--)
		{
			if(input.charAt(j)>=97&&input.charAt(j)<=122)
			{
				temp=temp+(char)(input.charAt(j)-32);
			}
			else
			temp=temp+input.charAt(j);
		}
		return temp;
	}

}
