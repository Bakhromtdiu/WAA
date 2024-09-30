package org.example.lab1.controller;

import org.example.lab1.model.Book;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedList;
import java.util.List;

@RestController
public class BookController {
    @GetMapping("/book")
    public List<Book> getBooks() {
        Book book = new Book("Java", "ISBN1", 1);
        Book book1 = new Book("Java2", "ISBN2", 2);
        Book book2 = new Book("Java3", "ISBN3", 3);
        Book book3 = new Book("Java4", "ISBN4", 4);
        List<Book> books = new LinkedList<>();
        books.add(book);
        books.add(book1);
        books.add(book2);
        books.add(book3);
        return books;
    }
}
