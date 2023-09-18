package br.com.primeirapi.controller;

import br.com.primeirapi.handler.AppilcationException;
import br.com.primeirapi.model.Product;
import br.com.primeirapi.model.User;
import br.com.primeirapi.repository.ProductRepository;
import br.com.primeirapi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UserController {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private ProductRepository productRepository;

    @PostMapping("/users")
    public void saveUser(@RequestBody User user) {
        if(user.getName()==null||user.getEmail()==null){
            throw new AppilcationException("usuario ou produto nulo");
        }
        User savedUser = userRepository.save(user);
        for (Product prod : user.getProducts()) {
            prod.setUser(savedUser);
            productRepository.save(prod);
        }

    }

    @GetMapping("/users")
    public List<User> findUsers() {
        return userRepository.findAll();
    }

    @GetMapping("/users/{id}")
    public Optional<User> findUser(@PathVariable("id") Integer id) {
        return userRepository.findById(id);
    }

    @DeleteMapping("/users/{id}")
    public void deleterUser(@PathVariable("id") Integer id) {
        userRepository.deleteById(id);
    }

    @PutMapping("/users")
    public void putUser(@RequestBody User user) {
        if(user.getName()==null||user.getEmail()==null){
            throw new AppilcationException("usuario ou produto nulo");
        }
        Optional<User> existingUser = userRepository.findById(user.getId());
        if (existingUser.isPresent()) {

            User savedUser = userRepository.save(user);

            for (Product prod : user.getProducts()) {
                prod.setUser(savedUser);
                productRepository.save(prod);
            }

        }

    }
    }
