package kr.pe.karsei.bookstore.batch.infrastructure;

import kr.pe.karsei.bookstore.batch.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookJpaRepository extends JpaRepository<Book, Long> {
}
