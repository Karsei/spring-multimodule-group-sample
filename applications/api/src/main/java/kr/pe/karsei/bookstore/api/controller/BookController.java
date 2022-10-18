package kr.pe.karsei.bookstore.api.controller;

import kr.pe.karsei.bookstore.api.domain.Book;
import kr.pe.karsei.bookstore.api.service.MyBookService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping
public class BookController {
    private final MyBookService myBookService;

    @GetMapping("/{id}/name")
    public String findBookName(@PathVariable Long id) {
        Book book = myBookService.findBook(id);
        return book.getName();
    }

    @PostMapping
    public Book addBook(String name) {
        return myBookService.addBook(name);
    }
}
