package session6.assignment5;

public class LibraryTest {
    public static void main(String[] args) {
        // Create a Library object
        Library library = new Library(3);  // A library that can hold 3 books

        // Create Book objects and add them to the Library
        Book book1 = new Book("1984", "George Orwell", 328);
        Book book2 = new Book("The Hobbit", "J.R.R. Tolkien", 310);
        Book book3 = new Book("To Kill a Mockingbird", "Harper Lee", 281);

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        // Call the method to display all books in the Library
        library.displayLibraryBooks();
    }
}
