package kr.pe.karsei.bookstore.api.infrastructure;

import kr.pe.karsei.bookstore.api.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookJpaRepository extends JpaRepository<Book, Long> {
}