package com.buybuy.project.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "products")
@ToString
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long productId;

    @Size(min = 6, message = "Product description must contain at least 3 characters")
    private String description;

    @NotBlank
    @Size(min = 3, message = "Product name must contain at least 3 characters")
    private String productName;
    private String image;
    private Integer quantity;
    private double price;
    private double discount;
    private double specialPrice;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    @ManyToOne
    @JoinColumn(name = "seller_id") //Name for seller (user) -> foreign key to User table
    private User user;

    @OneToMany(mappedBy = "product", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
    private List<CartItem> cartItems = new ArrayList<>();

}
