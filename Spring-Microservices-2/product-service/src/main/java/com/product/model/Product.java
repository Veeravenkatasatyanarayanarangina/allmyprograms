package com.product.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Product {

    @Id
    @GenericGenerator(name = "idgenerator", strategy = "com.product.model.IdGenerator")
    @GeneratedValue(generator = "idgenerator")
    private String id;
    private String name;
    private String description;
    private BigDecimal price;

}
