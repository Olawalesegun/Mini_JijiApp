package africa.semicolon.jijiMiniApp.data.repositories;

import africa.semicolon.jijiMiniApp.data.models.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}
