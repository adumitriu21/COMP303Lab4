package com.comp303lab4.book.service.service;

import com.comp303lab4.book.service.entity.Book;
import com.comp303lab4.book.service.repository.BookRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class BookService {
    @Autowired
    private BookRepository bookRepository;

    public Book saveBook(Book book) {
        log.info("inside save method in the BookService");
        return bookRepository.save(book);
    }

    public Book findBookById(Long bookId) {
        log.info("inside save method in the BookService");
        return bookRepository.findByBookId(bookId);
    }
}
