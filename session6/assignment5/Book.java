package session6.assignment5;

// Define the Book class with fields title, author, and pages
class Book {
    // Fields for the book's title, author, and number of pages
    String title;
    String author;
    int pages;

    // Constructor to initialize a Book object
    Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    // Method to return the book's information
    String getBookInfo() {
        // Return the book's information as a string
        return "Title: " + title + ", Author: " + author + ", Pages: " + pages;
    }
}