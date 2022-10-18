package kr.pe.karsei.bookstore.api.infrastructure;

import kr.pe.karsei.bookstore.api.domain.Book;

import java.util.Optional;

public interface MyBookRepository {
    Optional<Book> findById(Long id);
    Book addBook(String name);
}