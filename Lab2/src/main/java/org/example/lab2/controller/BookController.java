package org.example.lab2.controller;

import org.example.lab2.model.Book;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {
@GetMapping
    public ResponseEntity<?> getBooks() {
        List<Book> books = new LinkedList<>();
        Book book = new Book("Book1", "ISBN1", 100, 1);
        Book book2 = new Book("Book2", "ISBN2", 200, 2);
        Book book3 = new Book("Book3", "ISBN3", 300, 3);
        Book book4 = new Book("Book4", "ISBN4", 400, 4);
        return ResponseEntity.ok(books);
    }


    private List<Book> books = new ArrayList<>(Arrays.asList(
            new Book("1", "Spring Boot Basics", 12344, 1),
            new Book("2", "Java in Depth", 343434, 2)
    ));

    // 1. GET /books
    @GetMapping
    public List<Book> getAllBooks() {
        return books;
    }

    // 2. GET /books/{id}
    @GetMapping("/{id}")
    public ResponseEntity<Book> getBookById(@PathVariable int id) {
        return books.stream().filter(book -> book.getId() == id)
                .findFirst().map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
    // 3. POST /books
    @PostMapping
    public Book addBook(@RequestBody Book newBook) {
        books.add(newBook);
        return newBook;
    }
    // 4. PUT /books/{id}
    @PutMapping("/{id}")
    public ResponseEntity<Book> updateBook(@PathVariable int id, @RequestBody Book updatedBook) {
        return books.stream().filter(book -> book.getId() == id)
                .findFirst()
                .map(existingBook -> {
                    existingBook.setTitle(updatedBook.getTitle());
                    existingBook.setIsbn(updatedBook.getIsbn());
                    existingBook.setPrice(updatedBook.getPrice());
                    return ResponseEntity.ok(existingBook);
                }).orElse(ResponseEntity.notFound().build());
    }

    // 5. DELETE /books/{id}
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBook(@PathVariable int id) {
        boolean removed = books.removeIf(book -> book.getId() == id);
        return removed ? ResponseEntity.noContent().build() : ResponseEntity.notFound().build();
    }
    @GetMapping(value = "/{id}", produces = "application/cs.miu.edu-v2+json")
    public ResponseEntity<Book> getBookByIdV2(@PathVariable int id) {
        return getBookById(id);
    }
    @GetMapping(headers = "X-API-VERSION=2")
    public List<Book> getAllBooksV2() {
        return getAllBooks();
    }
    @RestController
    @RequestMapping("/v1/books")
    public class BookControllerV1 {

    }
    @GetMapping(params = "version=1")
    public List<Book> getAllBooksByVersionParam() {
        return getAllBooks();
    }

}
