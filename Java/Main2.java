import java.util.ArrayList;

class Book {
    private String title;
    private String author;
    private String isbn;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public String getISBN() {
        return isbn;
    }

    public void displayBook() {
        System.out.println("Title: " + title + ", Author: " + author + ", ISBN: " + isbn);
    }
}

class Library {
    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added.");
    }

    public void removeBook(String isbn) {
        for (Book b : books) {
            if (b.getISBN().equals(isbn)) {
                books.remove(b);
                System.out.println("Book removed.");
                return;
            }
        }
        System.out.println("Book not found.");
    }

    public void displayBooks() {
        for (Book b : books) {
            b.displayBook();
        }
    }
}

public class Main2 {
    public static void main(String[] args) {
        Library lib = new Library();

        lib.addBook(new Book("Java", "Author A", "101"));
        lib.addBook(new Book("OOP", "Author B", "102"));

        lib.displayBooks();

        lib.removeBook("101");

        lib.displayBooks();
    }
}