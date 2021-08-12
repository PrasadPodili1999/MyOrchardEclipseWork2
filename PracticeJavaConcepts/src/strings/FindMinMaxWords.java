package strings;

import java.util.Scanner;
/*
 * Pseudo Code :
 * 
 *  1.take a line of string as user input 
 *  2.create a method called findminElement with string return type 
 *  		create minword string as empty
 *  		initialize start index with 0
 *  		if character at start not equals to space and character at end equal to space -->store that string into minword
 *  		if end is less than length of string and character at start equals to space and character at end+1 equal to space
 *  			and character at start equals to space and end equal to string length-1				
 *  							-->if length of word less than minword length
 *  										==>store that string into minword 
 *  		iterate above 2 steps untill end is less than length of the string 
 *  
 *   3.create a method called findmaxElement with string return type 
 *  		create maxword string as empty
 *  		initialize start index with 0
 *  		if character at start not equals to space and character at end equal to space -->store that string into maxword
 *  		if end is less than length of string and character at start equals to space and character at end+1 equal to space
 *  			and character at start equals to space and end equal to string length-1
 *  							-->if length of word greater than maxword length
 *  										==>store that string into maxword 
 *  		iterate above 2 steps untill end is less than length of the string 
 */						

public class FindMinMaxWords {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		System.out.println(findMinWord(input));
		System.out.println(findMaxWord(input));
	}

	static String findMinWord(String input) {
		int i = 0;
		String minWord = "";
		for (int j = 0; j < input.length(); j++) {
			if (input.charAt(i) != ' ' && input.charAt(j) == ' ') {
				minWord = copyString(input, i, j);
				i = j;
			}
			if ((j < input.length() - 1 && input.charAt(i) == ' ' && input.charAt(j + 1) == ' ')
					|| (input.charAt(i) == ' ' && j == input.length() - 1 && input.charAt(j) != ' ')) {
				if ((j - i - 1) < minWord.length()) {
					minWord = copyString(input, i + 1, j + 1);
					i = j + 1;
				} else
					i = j + 1;
			}
		}
		return minWord;
	}

	static String findMaxWord(String input) {
		int i = 0;
		String maxWord = "";
		for (int j = 0; j < input.length(); j++) {
			if (input.charAt(i) != ' ' && input.charAt(j) == ' ') {
				maxWord = copyString(input, i, j);
				i = j;
			}
			if ((j < input.length() - 1 && input.charAt(i) == ' ' && input.charAt(j + 1) == ' ')
					|| (input.charAt(i) == ' ' && j == input.length() - 1)) {
				if ((j - i - 1) > maxWord.length()) {
					maxWord = copyString(input, i + 1, j + 1);
					i = j + 1;
				} else
					i = j + 1;
			}
		}
		return maxWord;
	}

	static String copyString(String input, int i, int j) {
		String temp = "";
		for (int k = i; k < j; k++) {
			temp = temp + input.charAt(k);
		}
		return temp;
	}
	
}

