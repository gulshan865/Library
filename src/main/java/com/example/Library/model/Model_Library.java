package com.example.Library.model;

import javax.persistence.*;

@Entity
@Table(name = "Library")
public class Model_Library {
        @Id
        @GeneratedValue
    private int id;
    private String book_name;
    private String book_pages;
    private String writer;
    private String price;

    public Model_Library() {

    }
    public Model_Library(int id, String book_name, String book_pages, String writer, String price) {
        this.id = id;
        this.book_name = book_name;
        this.book_pages = book_pages;
        this.writer = writer;
        this.price = price;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBook_name() {
        return book_name;
    }

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }

    public String getBook_pages() {
        return book_pages;
    }

    public void setBook_pages(String book_pages) {
        this.book_pages = book_pages;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
