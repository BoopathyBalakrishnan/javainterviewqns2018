package oops.composition;

import java.util.ArrayList;
import java.util.List;

public class Composition {

	public static void main(String[] args) {
		Book book1 = new Book("java", "java author");
		Book book2 = new Book("j2ee", "j2ee author");
		List<Book> books = new ArrayList<Book>();
		books.add(book1);
		books.add(book2);

		Library library = new Library(books);
		List<Book> bookDetails = library.getBooks();

		System.out.println("Total books: " + bookDetails.size());

	}

}
