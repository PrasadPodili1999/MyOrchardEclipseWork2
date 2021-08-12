package services;


import model.Book;

public class UpdateBook {

	public static Book[] updateNoOfBooksByGivenId(Book[] books,int id,int noOfBooks) {
		
			for (int i = 0; i < books.length; i++) {
				if(books[i].getId()==id)
				{
					books[i].setNoOfCopies(noOfBooks);
					DisplayBooks.displayBook(books[i]);
				}
			}
			return books;
	}
}
