package kr.pe.karsei.bookstore.batch.service;

import kr.pe.karsei.bookstore.batch.domain.Book;
import kr.pe.karsei.bookstore.batch.infrastructure.YourBookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class YourBookService implements ManagableBookService {
    private final YourBookRepository yourBookRepository;

    public void findBook(Long id) {
        Optional<Book> book = yourBookRepository.findById(id);
    }
}
