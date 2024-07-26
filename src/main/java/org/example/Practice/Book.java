package org.example.Practice;

public class Book {
    private String title ;
    private Author authorName;
    private int dateOfManuFacture;

    public Book(String title, Author authorName, int dateOfManuFacture) {
        this.title = title;
        this.authorName = authorName;
        this.dateOfManuFacture = dateOfManuFacture;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthorName() {
        return authorName;
    }

    public int getYear() {
        return dateOfManuFacture;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthorName(Author authorName) {
        this.authorName = authorName;
    }

    public void setYear(int dateOfManuFacture) {
        this.dateOfManuFacture = dateOfManuFacture;
    }

    public String getBookInfo(){
        return "Title: <title>, Author: <author name>, Year: <year>";
    }

    public String toString(){
        return "[Название книги: " + title + ", год выпуска: " + dateOfManuFacture + ",автор книги: " + authorName + "]";
    }
}
