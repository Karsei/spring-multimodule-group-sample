package kr.pe.karsei.bookstore.batch.infrastructure;

import kr.pe.karsei.bookstore.batch.domain.Book;

import java.util.Optional;

public interface YourBookRepository {
    Optional<Book> findById(Long id);
}
