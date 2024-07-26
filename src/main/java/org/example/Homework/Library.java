package org.example.Homework;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Library {
    private Book [] books = new Book[10];
    private int count = 0;

    public void addBook(Book book){
        if (count< books.length){
            books[count] = book;
            count++;
        }else {
            System.out.println("Массив переполнен");
        }
    }

    public Book getBookByAuthor(String author){
        for (int i = 0; i < books.length; i++) {
            if (books[i].getAuthor() == author){
                return books[i];
            }

        }
        return null;
    }
     public void getAllBooks(){
         for (int i = 0; i < books.length; i++) {
             if (books[i] != null){
                 System.out.println(books[i].toString());
             }
         }
     }
}
