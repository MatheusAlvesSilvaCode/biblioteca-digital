package pt.openup.book_service.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import pt.openup.book_service.model.Review;
import java.util.List;
public interface ReviewRepository extends MongoRepository<Review, String> {
    List<Review> findByBookId(Long bookId);
}