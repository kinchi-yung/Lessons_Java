public class Library {
    Book[] books;


    public Library(Book[] books) {
        this.books = books;
    }
    public void addBook(Book book, int index) {
        books[index] = book;
    }

    public Book searchByTitle(String title){
        for (Book book : books){
            if (book.name.equalsIgnoreCase(title)){
                return book;
            }
        }
        return null;
    }
}
