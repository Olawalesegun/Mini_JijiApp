package africa.semicolon.jijiMiniApp.data.repositories;

import africa.semicolon.jijiMiniApp.data.models.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;


import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.jupiter.api.Assertions.*;
@DataMongoTest
class ProductRepositoryTest {
    @Autowired
    private ProductRepository productRepository;

    @Test
    void saveTest(){
        Product newProduct = new Product();
        Product savedProduct = productRepository.save(newProduct);
        assertThat(productRepository.count(), is(1L));
        assertEquals(1, productRepository.count());
        assertNotNull(savedProduct.getId());
    }

}