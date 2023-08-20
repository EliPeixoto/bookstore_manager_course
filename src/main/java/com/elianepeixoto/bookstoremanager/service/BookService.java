package com.elianepeixoto.bookstoremanager.service;

import com.elianepeixoto.bookstoremanager.dto.MessageResponseDTO;
import com.elianepeixoto.bookstoremanager.entity.BookEntity;
import com.elianepeixoto.bookstoremanager.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    private BookRepository bookRepository;

    @Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public MessageResponseDTO create( BookEntity bookEntity) {

        BookEntity savedBook = bookRepository.save(bookEntity);
        return MessageResponseDTO.builder()
                .message("book created with ID" + savedBook.getId())
                .build();
    }

}
