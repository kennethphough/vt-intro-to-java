package session6.assignment5;

// Define the Library class that "has a" Book using composition
class Library {
    // An array or list to store multiple Book objects
    private Book[] books;
    private int bookCount;

    // Constructor to initialize the Library
    Library(int size) {
        books = new Book[size];
        bookCount = 0;
    }

    // Method to add a Book to the Library
    void addBook(Book book) {
        // Add the book to the array and increment the count
        if (bookCount < books.length) {
            books[bookCount++] = book;
        } else {
            System.out.println("Library is full.");
        }
    }

    // Method to display all the books in the Library
    void displayLibraryBooks() {
        // Loop through the array and display information for each book
        for (int i = 0; i < bookCount; i++) {
            System.out.println(books[i].getBookInfo());
        }
    }
}
