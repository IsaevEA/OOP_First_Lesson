package org.example.Practice;

public class Library {
    private Book[] books = new Book[10];
    private int length = 0;

    public Library(){}


    public void addBook(Book book){
        if (length <books.length){
            books[length] = book;
            length++;
        }else {
            System.out.println("Массив переполнен");
        }
    }

    public void getBookByAuthor(String name){

        for (int i = 0; i < books.length; i++) {
            if (books[i] != null){
                if (books[i].getAuthorName().getName() == name){
                    System.out.println(books[i].getTitle());
                }
            }
        }

    }

    public void getAllBooks(){
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null){
                System.out.println(books[i].toString());
            }
        }
    }
}
