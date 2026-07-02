package com.library.service;

import com.library.repository.BookRepository;

public class BookService {

    private BookRepository bookRepository;

    // Setter Injection
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void addBook() {

        System.out.println("Adding a new book...");

        bookRepository.saveBook();

        System.out.println("Book added successfully.");
    }
}