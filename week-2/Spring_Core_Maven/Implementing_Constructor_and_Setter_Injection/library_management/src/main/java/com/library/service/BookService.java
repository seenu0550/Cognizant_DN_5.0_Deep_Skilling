package com.library.service;

import com.library.repository.BookRepository;

public class BookService {

    private String libraryName;
    private BookRepository bookRepository;

    // Constructor Injection
    public BookService(String libraryName) {
        this.libraryName = libraryName;
        System.out.println("BookService Bean Created");
    }

    // Setter Injection
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void issueBook() {
        System.out.println("Library Name : " + libraryName);
        System.out.println("Book Service: Issuing Book...");
        bookRepository.displayBook();
    }
}