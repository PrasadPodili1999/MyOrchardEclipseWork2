package services;

import model.Book;
import java.util.Scanner;
public class AddBooks {

	public static Book[] addBooks(Book[] books, int length) {
		
		Scanner sc=new Scanner(System.in);
		Book[] temp = new Book[books.length + length];
		CopyBooks.copyBooksIntoTempArray(books, temp);
		for (int i = 0; i < length; i++) {
			System.out.println("enter id: ");
			int id = sc.nextInt();
			System.out.println("enter name : ");
			String name = sc.next();
			System.out.println("enter publishers : ");
			int pub = sc.nextInt();
			System.out.println("enter author name : ");
			String aName = sc.next();
			System.out.println("enter no of copies: ");
			int noOfCopies = sc.nextInt();

			temp[books.length + i] = new Book(id,name,pub,aName,noOfCopies);
		}
		DisplayBooks.displayAllBooks(temp);
		return temp;
	}
	
}
