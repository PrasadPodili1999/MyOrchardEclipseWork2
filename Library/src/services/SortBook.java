package services;

import model.Book;

public class SortBook {

	public static void sortBooksByAuthor(Book[] books) {
		Book[] temp = new Book[books.length];
		CopyBooks.copyBooksIntoTempArray(books, temp);
		for (int i = 0; i < temp.length - 1; i++) {
			for (int j = 0; j < temp.length - 1 - i; j++) {
				if (temp[j].getAuthor().compareTo(temp[j + 1].getAuthor()) > 0) {
					Book temp1 = temp[j];
					temp[j] = temp[j + 1];
					temp[j + 1] = temp1;
				}
			}
		}
		DisplayBooks.displayAllBooks(temp);
	}
}
