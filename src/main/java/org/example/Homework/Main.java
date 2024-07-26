package org.example.Homework;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Война и мир", "Толстой", 1596);
        Book book2 = new Book("Смерть поэта", "Михаил Лермонтов", 1596);
        Book book3 = new Book("Капитанская дочка", "Пушкин", 1596);
        Library library = new Library();
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.getAllBooks();

        System.out.println(library.getBookByAuthor("Толстой"));
    }
}
