package com.exam.shoppingcard;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Builder
@Data
@Table(name = "Product")
@AllArgsConstructor
@NoArgsConstructor


public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "product_image", columnDefinition = "Text")
    private String prodImg;
    @Column(name = "product_name")
    private String prodName;
    @Column(name = "product_short_description", columnDefinition = "Text")
    private String short_description;
    @Column(name = "product_long_description", columnDefinition = "Text")
    private String longDescription;
    @Column(name = "product_price")
    private Double prodPrice;

}