package br.com.primeirapi.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false, unique = true)
    private Long code;
    @Column(nullable = false, precision = 2)
    private Double price;
    @Column(nullable = false, unique = true, length = 200)
    private String name;

    @ManyToOne
    @JsonBackReference
    private User user;

    public Product() {
    }

    public Product(Long code, Double price, String name, User user) {
        this.code = code;
        this.price = price;
        this.name = name;
        this.user = user;
    }

    public Integer getId() {
        return id;
    }

    public Long getCode() {
        return code;
    }

    public void setCode(Long code) {
        this.code = code;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
