package africa.semicolon.jijiMiniApp.data.models;


import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Data
@Document("Products")
public class Product {
    @Id
    private String id;
    private String productName;
    private String description;
    @CreatedDate
    private LocalDateTime datePosted;
}
