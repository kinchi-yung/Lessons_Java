import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Book[] books = { new Book("The Great Gatsby", "F. Scott Fitzgerald", "978-0743273565"),
                new Book("To Kill a Mockingbird", "Harper Lee", "978-0446310789"),
                new Book("1984", "George Orwell", "978-0451524935") };
        Library library = new Library(books);
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите название книги: ");
        String title = sc.nextLine();

        Book book = library.searchByTitle(title);
        if (book != null) {
            System.out.println("Title: " + book.name);
            System.out.println("Author: " + book.author);
            System.out.println("ISBN: " + book.ISBN);
        } else {
            System.out.println("Такой книги нет в библиотеке.");
        }
    }
}