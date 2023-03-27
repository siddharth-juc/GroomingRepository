package me.grooming.GroomingRepository.POJOWorks;

import java.util.Objects;

public class Book {

	public String subjectOrGenre;
	public String bookTitle;
	public String bookISBN;
	
	public Book(String subjectOrGenre, String bookTitle, String bookISBN) {
		this.subjectOrGenre = subjectOrGenre;
		this.bookTitle = bookTitle;
		this.bookISBN = bookISBN;
	}

	@Override
	public int hashCode() {
		
		return Objects.hash(bookISBN, bookTitle, subjectOrGenre);
		
	}

	@Override
	public boolean equals(Object givenBook) {
		if (this == givenBook)
			return true;
		
		if ((givenBook == null) || (this.getClass() != givenBook.getClass()))
			return false;
		
		Book givenBookToCheck = (Book) givenBook;
		return Objects.equals(bookISBN, givenBookToCheck.bookISBN) && 
				Objects.equals(bookTitle, givenBookToCheck.bookTitle) && 
				Objects.equals(subjectOrGenre, givenBookToCheck.subjectOrGenre);
		
	}

	@Override
	public String toString() {
		return "Book \n["
				+ "\n \t  subjectOrGenre=" + subjectOrGenre 
				+ "\n \t  bookTitle=" + bookTitle 
				+ "\n \t  bookISBN=" + bookISBN 
				+ "\n]\n";
	}
	
	
		
}
