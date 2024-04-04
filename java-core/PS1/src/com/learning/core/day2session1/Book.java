package com.learning.core.day2session1;


	class Book {
	   
	    private double bookprice;
		private String bookTitle;
	 
	    public String getBookTitle() {
	        return bookTitle;
	    }
	 
	    public void setBookTitle(String bookTitle) {
	        this.bookTitle = bookTitle;
	    }
	 
	    public double getBookPrice() {
	        return bookprice;
	    }
	 
	    public void setBookPrice(double bookPrice) {
	        this.bookprice = bookPrice;
	    }
	 
	    public static void createBooks(String title, double price) {
	        Book book = new Book();
	        book.setBookTitle(title);
	        book.setBookPrice(price);
	        showBooks(book);
	    }
	 
	    public static void showBooks(Book book) {
	        System.out.println("Book Title: " + book.getBookTitle() + " and Price: " + book.getBookPrice());
	    }
	 
	    public static void main(String[] args) {
	         createBooks("Java Programming", 350.00);
	      
	    }
	}

