package kr.pe.karsei.bookstore.api.domain;

import kr.pe.karsei.bookstore.api.infrastructure.MyBookRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.data.jpa.mapping.JpaMetamodelMappingContext;

import javax.persistence.EntityManager;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class MyBookRepositoryImplTest {
    @Autowired
    private EntityManager entityManager;
    @Autowired
    private MyBookRepository myBookRepository;

//    @BeforeEach
//    void setupBook() {
//        entityManager.clear();
//    }

    @Test
    void add() {
        // given
        String name = "바람";

        // when
        Book book = myBookRepository.addBook(name);

        // then
        assertNotNull(book);
        assertEquals("바람", book.getName());
    }
}