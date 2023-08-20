package com.elianepeixoto.bookstoremanager.controller;

import com.elianepeixoto.bookstoremanager.dto.MessageResponseDTO;
import com.elianepeixoto.bookstoremanager.entity.BookEntity;
import com.elianepeixoto.bookstoremanager.repository.BookRepository;
import com.elianepeixoto.bookstoremanager.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/books")
public class BookController {

    private BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @PostMapping
    public MessageResponseDTO create(@RequestBody BookEntity bookEntity) {
        return bookService.create(bookEntity);
    }
}
