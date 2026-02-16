package org.example;

public class Book {

    private String title;
    private String description;
    private String isbn;
    private String writer;
    private double price;

    public Book(String title, String description, String isbn, String writer, double price) {
        this.title = title;
        this.description = description;
        this.isbn = isbn;
        this.writer = writer;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
