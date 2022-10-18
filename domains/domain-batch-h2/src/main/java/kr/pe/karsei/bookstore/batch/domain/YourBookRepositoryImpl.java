package kr.pe.karsei.bookstore.batch.domain;

import kr.pe.karsei.bookstore.batch.infrastructure.BookJpaRepository;
import kr.pe.karsei.bookstore.batch.infrastructure.YourBookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class YourBookRepositoryImpl implements YourBookRepository {
    private final BookJpaRepository bookJpaRepository;

    @Override
    public Optional<Book> findById(Long id) {
        return bookJpaRepository.findById(id);
    }
}
