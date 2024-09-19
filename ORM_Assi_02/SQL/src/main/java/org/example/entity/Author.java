package org.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
//Inverse End
public class Author {

    @Id
    private int id;

    private String name;

    private int yrsOfExp;

    @OneToMany (mappedBy = "author")
    private List<Book> book;


    public Author() {
    }

    public Author(int id, String name, int yrsOfExp, List<Book> book) {
        this.id = id;
        this.name = name;
        this.yrsOfExp = yrsOfExp;
        this.book = book;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYrsOfExp() {
        return yrsOfExp;
    }

    public void setYrsOfExp(int yrsOfExp) {
        this.yrsOfExp = yrsOfExp;
    }

    public List<Book> getBook() {
        return book;
    }

    public void setBook(List<Book> book) {
        this.book = book;
    }
}