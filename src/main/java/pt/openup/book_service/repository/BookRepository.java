package pt.openup.book_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pt.openup.book_service.model.Book;
import java.util.List;
public interface BookRepository extends JpaRepository<Book, Long> {
    List<Book> findByTitleContainingIgnoreCase(String title);
    List<Book> findByAuthorContainingIgnoreCase(String author);
}