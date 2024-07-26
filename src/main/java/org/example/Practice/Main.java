package org.example.Practice;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("война и мир", new Author("Mkdjfhs", 1965), 1867 );
        Book book2 = new Book("Журавль", new Author("Пушкин", 1254), 1867 );
        Book book3 = new Book("война и мир", new Author("KLGJdfh", 1254), 1867 );


        Library library = new Library();
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.getAllBooks();
        System.out.println("--------------------------------------");
        library.getBookByAuthor("Пушкин");
    }
}
