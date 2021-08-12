package strings;

import java.util.Scanner;
public class String2 {
/*
 * input: i am good boy
 * output:i an gooe boz
 * 
 * 1.take an input string from user
 * 2.create a temp string with no value
 * 3.if each character is not vowel or vowel, if it is not vowel then check whether the previous character is vowel or not(here i>0)
 * 		if it is vowel ,check non-vowel character is consonant or not,if it is consonant ,just increase the character to 1 and store inside temp
 * 		else store actual character inside temp   
 * 4.else store actual character inside temp
 * 5.finally print temp string
 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string : ");
		String input=sc.nextLine();
		String temp="";
		System.out.println("given string : "+input);
		for(int i=0;i<input.length();i++) {
			if(input.charAt(i)!='a'&&input.charAt(i)!='e' && input.charAt(i)!='i'&&input.charAt(i)!='o'&&input.charAt(i)!='u'&&input.charAt(i)!='A'&&input.charAt(i)!='I'&&input.charAt(i)!='E'&&input.charAt(i)!='O'&&input.charAt(i)!='U'&&input.charAt(i)!=' ')
			{
				if(i>0 && (input.charAt(i-1)=='a'||input.charAt(i-1)=='e'||input.charAt(i-1)=='i'||input.charAt(i-1)=='o'||input.charAt(i-1)=='u'||input.charAt(i-1)=='A'||input.charAt(i-1)=='I'||input.charAt(i-1)=='E'||input.charAt(i-1)=='O'||input.charAt(i-1)=='U'))
				{
					if(input.charAt(i)=='z')
						temp=temp+'a';
					else if(input.charAt(i)=='Z')
						temp=temp+'A';
					else if(input.charAt(i)>=65&&input.charAt(i)<=90||input.charAt(i)>=97&&input.charAt(i)<=122)
						temp=temp+(char)(input.charAt(i)+1);
				}else //if(i>0&& input.charAt(i-1)==' ')
					temp=temp+input.charAt(i);			
			}else
				temp=temp+input.charAt(i);	
		}
		System.out.println("output string : "+temp);
	}	}
