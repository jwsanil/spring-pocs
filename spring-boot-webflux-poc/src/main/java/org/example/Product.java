package org.example;


import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collation = "products")
public class Product {
    @Id
    private String id;
    private String name;
    private String price;
}
