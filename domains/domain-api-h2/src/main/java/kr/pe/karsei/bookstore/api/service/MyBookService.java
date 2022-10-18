package kr.pe.karsei.bookstore.api.service;

import kr.pe.karsei.bookstore.api.domain.Book;
import kr.pe.karsei.bookstore.api.infrastructure.MyBookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MyBookService implements ManagableBookService {
    private final MyBookRepository myBookRepository;

    public Book findBook(Long id) {
        return myBookRepository
                .findById(id)
                .orElseThrow(() -> new IllegalStateException("책을 찾을 수 없습니다."));
    }

    public Book addBook(String name) {
        return myBookRepository.addBook(name);
    }
}
