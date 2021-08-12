package services;

import model.Book;

public class CopyBooks {

	public static void copyBooksIntoTempArray(Book[] books,Book[] temp)
	{
		for (int i = 0; i < books.length; i++) {
			temp[i] = books[i];
		}
	}
}
