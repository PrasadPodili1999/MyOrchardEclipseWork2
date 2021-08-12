package strings;

/*
 * Write a program to take a sentence as an input and swap 1st word and last word and reverse the characters of these words.
Traverse remaining words and change the vowels to next character and change its case.
Note: Splitting of words should be based on unser input(special characters).



Example1 :
input
welcome_to_java_programming
Split char: _
After Splitting:
welcome
to
java
programming
output
gnimmargorp tP jBvB emoclew


Example 2 :
input
tommorrow,will,bE,holiday
Split char: ,
After Splitting:
tommorrow
will
be
holiday
output
yadiloh wJll bf worrommot
 */
import java.util.Scanner;
public class Practice {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		char splitChar=sc.next().charAt(0);
		int start=0;
		String last="",first="",middle="";
		for(int i=0;i<input.length();i++)
		{
			if(input.charAt(i)==(splitChar)&& start==0)
			{
				
				last=last+reverse(input,start,i);
				start=i+1;
			}
			else if(i==input.length()-1)
			{
				first=first+reverse(input,start,i+1);
			}
			else if(start!=0&&i!=input.length()&&input.charAt(i)==splitChar)
			{
				middle=middle+change(input,start,i)+" ";
				start=i+1;
			}
		}
		String result=first+" "+middle+last;
		System.out.println(result);

	}
	public static String reverse(String input,int start,int end)
	{
		String temp="";
		for(int i=end-1;i>=start;i--)
		{
			temp=temp+input.charAt(i);
		}
		return temp;
	}
	public static String change(String input,int start,int end)
	{
		String temp="";
		for(int i=start;i<end;i++)
		{
			if(input.charAt(i)=='a'||input.charAt(i)=='e'||input.charAt(i)=='i'||input.charAt(i)=='o'||input.charAt(i)=='u')
			{
				temp=temp+(char)(input.charAt(i)-31);
			}
			else if(input.charAt(i)=='A'||input.charAt(i)=='E'||input.charAt(i)=='I'||input.charAt(i)=='O'||input.charAt(i)=='U')
			{
				temp=temp+(char)(input.charAt(i)+33);
			}
			else
			{
				temp=temp+input.charAt(i);
			}
		}
		return temp;
	}

}
