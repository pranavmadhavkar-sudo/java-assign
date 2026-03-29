class Book {
    String title;
    String author;
    double price;

    // Constructor
    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Method to display details
    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: ₹" + price);
        System.out.println("----------------------");
    }
}

// Main class
public class Main19 {
    public static void main(String[] args) {

        // Array of objects
        Book[] books = new Book[3];

        books[0] = new Book("Java Basics", "James Gosling", 500);
        books[1] = new Book("Python Guide", "Guido van Rossum", 450);
        books[2] = new Book("C Programming", "Dennis Ritchie", 400);

        // Display all books
        for (Book b : books) {
            b.display();
        }
    }
}