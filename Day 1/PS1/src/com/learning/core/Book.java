package com.learning.core;

public class Book {
	 private String bookTitle;
	    private double bookPrice;

	    // Getter and Setter methods for bookTitle
	    public String getBookTitle() {
	        return bookTitle;
	    }

	    public void setBookTitle(String bookTitle) {
	        this.bookTitle = bookTitle;
	    }

	    // Getter and Setter methods for bookPrice
	    public double getBookPrice() {
	        return bookPrice;
	    }

	    public void setBookPrice(double bookPrice) {
	        this.bookPrice = bookPrice;
	    }
	}

     class Main {

	    // Method to create a Book object
	    public static Book createBook(String title, double price) {
	        Book book = new Book();
	        book.setBookTitle(title);
	        book.setBookPrice(price);
	        return book;
	    }

	    // Method to display Book details
	    public static void showBook(Book book) {
	        System.out.println("Book Title: " + book.getBookTitle() + " and Price: " + book.getBookPrice());
	    }

	    public static void main(String[] args) {
	        // Input
	        String title = "Java Programming";
	        double price = 350.00;

	        // Creating and displaying the book
	        Book book = createBook(title, price);
	        showBook(book);
	    }
	}
