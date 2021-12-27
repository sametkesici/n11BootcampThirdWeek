package com.bahadirmemis.springboot.mongodb.entity;

import java.math.BigDecimal;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "product")
@Getter
@Setter
public class Product {

    @Id
    private String id;

    private String name;
    private BigDecimal price;
    private String createDate;
    private String categoryId;

}
