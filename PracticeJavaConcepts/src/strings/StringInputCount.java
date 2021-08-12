package strings;

import java.util.Scanner;

public class StringInputCount {
	/*
	 * input 1 : today is sunday and yesterday is saturday
	 * input 2 : day
	 * output  : 4
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a line of string : ");
		String line = sc.nextLine();
		line = toLowerCase(line);
		System.out.println("enter a string : ");
		String input = sc.next();
		input = toLowerCase(input);
		int resultCount = 0;
		
		//compare input with the given line of string if found increase the resultcount
		for (int i = 0; i <= line.length() - input.length(); i++) {
			int count = 0;
			boolean c = true;
			for (int j = 0; j < input.length(); j++) {
				if (c == true && line.charAt(i + count) == input.charAt(j))
					count++;
				else
					c = false;
			}
			if (count == input.length())
				resultCount++;
		}
		
		//print the output
		System.out.println(resultCount);
	}
	
	//convert all the characters of the string to lowercase

	static String toLowerCase(String str) {
		String temp = "";
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 65 && str.charAt(i) <= 90)
				temp = temp + (char)(str.charAt(i) + 32);
			else
				temp = temp + str.charAt(i);
		}
		return temp;
	}
}