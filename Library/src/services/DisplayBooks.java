package services;

import model.Book;

public class DisplayBooks {

	public static void displayAllBooks(Book[] books)
	{
		for(int i=0;i<books.length;i++)
		{
			displayBook(books[i]);
		}
	}
	public static void displayBook(Book book)
	{
		System.out.println("***************\n");
		System.out.println("book id : "+book.getId());
		System.out.println("book name : "+nameChange(book.getName()));
		System.out.println("book publishers : "+book.getPublishers());
		System.out.println("book author : "+book.getAuthor());
		System.out.println("no of books : "+book.getNoOfCopies()+"\n");
		System.out.println("***************\n");
	}
	static String nameChange(String name)
	{
		String temp="";
		for(int i=0;i<name.length();i++)
		{
			if(i%2==1)
			{
				if(name.charAt(i)>=65&&name.charAt(i)<=90)
					temp=temp+(char)(name.charAt(i)+1);
				else if(name.charAt(i)>=97&&name.charAt(i)<=122)
					temp=temp+(char)(name.charAt(i)-31);
			}
			else
			{
				temp=temp+name.charAt(i);
			}
		}
		return temp;
	}
}
