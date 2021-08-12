package client;

import java.util.Scanner;

import model.Book;
import services.AddBooks;
import services.DisplayBooks;
import services.SearchBooks;
import services.SortBook;
import services.UpdateBook;

public class LibraryManagementApp {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		Book books[] = new Book[0];
		int loopVar = 1;
		do {
			displayDemo();
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("enter how many books do you want to add : ");
				int length = sc.nextInt();
				books =AddBooks.addBooks(books, length);
				break;
			case 2:
				System.out.println("enter book name : ");
				String name=sc.next();
				SearchBooks.searchBook(books, name);
				break;
			case 3:
				DisplayBooks.displayAllBooks(books);
				break;
			case 4:
				SortBook.sortBooksByAuthor(books);
				break;
			case 5:
				System.out.println("enter id : ");
				int id=sc.nextInt();
				System.out.println("enter no of books");
				int noOfBooks=sc.nextInt();
				books=UpdateBook.updateNoOfBooksByGivenId(books, id, noOfBooks);
				break;
			case 6:
				loopVar++;
				break;
			default:
				System.out.println("invalid input and please choose options from above list only.....");
			}
		} while (loopVar == 1);
	}

	static void displayDemo() {
		System.out.println("======================MENU===========================\n");
		System.out.println("1.add books and display");
		System.out.println("2.search assets for given book name and display book name as per given requirement ");
		System.out.println("3.display all books");
		System.out.println("4.sort books by given author name");
		System.out.println("5.update no of copies by given id");
		System.out.println("6.exit");
		System.out.println("======================================================");
	}


}
