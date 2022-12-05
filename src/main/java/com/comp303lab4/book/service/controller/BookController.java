package com.comp303lab4.book.service.controller;

import com.comp303lab4.book.service.entity.Book;
import com.comp303lab4.book.service.service.BookService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/books")
@Slf4j
public class BookController {

    @Autowired
    private BookService bookService;
    @PostMapping("/")
    public Book saveBook(@RequestBody Book book){
        log.info("inside saveBook method in the BookController");
        return bookService.saveBook(book);
    }
    @GetMapping("/{id}")
    public Book findBookById(@PathVariable("id")  Long bookId){
        log.info("inside finBookById method in the BookController");
        return bookService.findBookById(bookId);
    }
}
