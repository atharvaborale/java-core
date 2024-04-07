package com.ps8;

import java.util.Date;
import java.util.Objects;
import java.util.TreeSet;

public class Book3 implements Comparable<Book3>{
	 private int bookId;
	    private String title;
	    private double price;
	    private String author;
	    private Date publicationDate;

	    public Book3(int bookId, String title, double price, String author, Date publicationDate) {
	        this.bookId = bookId;
	        this.title = title;
	        this.price = price;
	        this.author = author;
	        this.publicationDate = publicationDate;
	    }

	    @Override
	    public String toString() {
	        return bookId + " " + title + " " + price + " " + author + " " + publicationDate;
	    }

	    @Override
	    public int hashCode() {
	        return Objects.hash(bookId, title, price, author, publicationDate);
	    }

	    @Override
	    public boolean equals(Object obj) {
	        if (this == obj)
	            return true;
	        if (obj == null || getClass() != obj.getClass())
	            return false;
	        Book3 book = (Book3) obj;
	        return bookId == book.bookId &&
	                Double.compare(book.price, price) == 0 &&
	                Objects.equals(title, book.title) &&
	                Objects.equals(author, book.author) &&
	                Objects.equals(publicationDate, book.publicationDate);
	    }

	    @Override
	    public int compareTo(Book3 other) {
	        return Integer.compare(this.bookId, other.bookId);
	    }
	
	
	    public static void main(String[] args) {
	        // Predefined book details
	        Book3 book1 = new Book3(1001, "Python Learning", 715.0, "Martic C. Brown", new Date(2020,02,02));
	        Book3 book2 = new Book3(1002, "Modern Mainframe", 295.0, "Sharad", new Date(1997,05,19));
	        Book3 book3 = new Book3(1003, "Java Programming", 523.0, "Gilad Bracha", new Date(1984,11,23));
	        Book3 book4 = new Book3(1004, "Hemy Harvin", 295.0, "Hemy Harvin", new Date(1984,11, 19));
	        Book3 book5 = new Book3(1005, ".Net Platform", 3497.0, "Mark J. Price", new Date(1984,3, 6));

	        // Create a TreeSet to store book details
	        TreeSet<Book3> bookSet = new TreeSet<>();

	        // Add books to the TreeSet
	        bookSet.add(book1);
	        bookSet.add(book2);
	        bookSet.add(book3);
	        bookSet.add(book4);
	        bookSet.add(book5);

	        // Print all the book details
	        System.out.println("Book Details:");
	        for (Book3 book : bookSet) {
	            System.out.println(book);
	        
	    }
}
}
