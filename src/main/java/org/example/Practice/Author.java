package org.example.Practice;

public class Author {
    private String name;
    private int birthYear;

    public Author(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }

    public String getName() {
        return name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }
    public String getAuthorInfo(){
        return "Name: <name>, Birth Year: <birthYear>";
    }


    public String toString(){
        return "[name: " + name + ", birthYear: " + birthYear + "]";
    }
}
