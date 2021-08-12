package services;

import model.Book;

public class SearchBooks {

	public static void searchBook(Book[] books,String name)
	{
		for(int i=0;i<books.length;i++)
		{
			if(books[i].getName().equals(name))
			{
				DisplayBooks.displayBook(books[i]);
			}
		}
	}
}
