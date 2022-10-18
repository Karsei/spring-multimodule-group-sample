package kr.pe.karsei.bookstore.api.domain;

import kr.pe.karsei.bookstore.api.infrastructure.BookJpaRepository;
import kr.pe.karsei.bookstore.api.infrastructure.MyBookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class MyBookRepositoryImpl implements MyBookRepository {
    private final BookJpaRepository bookJpaRepository;

    @Override
    @Transactional(readOnly = true)
    public Optional<Book> findById(Long id) {
        return bookJpaRepository.findById(id);
    }

    @Override
    @Transactional
    public Book addBook(String name) {
        Book book = new Book(null, name);
        return bookJpaRepository.save(book);
    }
}
