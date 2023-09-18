package br.com.primeirapi.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;
@Entity
@Table(name="tb_user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false,length = 200,unique = true)
    private String name;
    @Column(nullable = false,length = 100,unique = true)
    private String email;
    @OneToMany(mappedBy = "user")
    @JsonManagedReference
    private List<Product> products;

    public User() {
    }

    public User(String name, String email) {
        this.name = name;
        this.email = email;
        products=new ArrayList<>();
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
