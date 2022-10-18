package kr.pe.karsei.bookstore.api.service;

import kr.pe.karsei.bookstore.api.domain.Book;

public interface ManagableBookService {
    Book findBook(Long id);
}
