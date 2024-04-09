package com.ps8;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;
import java.util.TreeSet;

public class Book4 implements Comparable<Book4>{

	
	    String bookId;
	    String title;
	    double price;
	    String dateOfPublication;
	    String author;

	    public Book4(String bookId, String title, double price, String dateOfPublication, String author) {
	        this.bookId = bookId;
	        this.title = title;
	        this.price = price;
	        this.dateOfPublication = dateOfPublication;
	        this.author = author;
	    }

	    @Override
	    public String toString() { 
	        return bookId + "  " + title + "  " + price + "  " + author + "  " + dateOfPublication;
	    }

	    @Override 
	    public int hashCode() {
	        return bookId.hashCode() + title.hashCode() + author.hashCode();
	    }

	    @Override
	    public boolean equals(Object obj) {
	        if (this == obj)
	            return true;
	        if (obj == null || getClass() != obj.getClass())
	            return false;
	        Book4 book = (Book4) obj;
	        return bookId.equals(book.bookId) && title.equals(book.title) && author.equals(book.author);
	    }

	    @Override
	    public int compareTo(Book4 other) {
	        return this.author.compareTo(other.author);
	    }
	
	    public static void main(String[] args) {
	        TreeSet<Book4> books = new TreeSet<>();
	        books.add(new Book4("1002", "Modern Mainframe", 295.0, "19/5/19973", "Sharad"));
	        books.add(new Book4("1001", "Python Learning", 715.0, "2/2/2020", "Martic C. Brown"));
	        books.add(new Book4("1004", "Read C++", 3497.0, "6/3/1984", "Henry Harvin"));
	        books.add(new Book4("1005", ".Net Platform", 295.0, "19/11/1984", "Mark J. Price"));
	        books.add(new Book4("1003", "Java Programming", 523.0, "23/11/1984", "Gilad Bracha"));
	        
	        for (Book4 book : books) {
	            System.out.println(book);
	        }
	    }
	}

