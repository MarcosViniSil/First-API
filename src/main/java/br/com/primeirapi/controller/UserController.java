package br.com.primeirapi.controller;

import br.com.primeirapi.model.Product;
import br.com.primeirapi.model.User;
import br.com.primeirapi.repository.ProductRepository;
import br.com.primeirapi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private ProductRepository productRepository;

    @PostMapping("/users")
    public void saveUser(@RequestBody User user){
        User savedUser=userRepository.save(user);
        for(Product prod:user.getProducts()){
            prod.setUser(savedUser);
            productRepository.save(prod);
        }

    }

}
