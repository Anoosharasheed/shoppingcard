package com.exam.shoppingcard;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin
@RestController
@RequestMapping("/cart")
public class Cartcontroller {

    @Autowired
    private CartRepository cartRepository;

    @PostMapping("/add")
    public Cart saveCart(@RequestBody Cart cart){
        return cartRepository.save(cart);
    }

    @GetMapping("/all")
    public List<Cart> getCart(){
        return cartRepository.findAll();
    }

    @GetMapping({"/id"})
    public Cart getById(@PathVariable Long id){
        return cartRepository.findById(id).get();
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        cartRepository.deleteById(id);
    }

    @DeleteMapping("/all")
    public void deleteall(){
        cartRepository.deleteAll();
    }





    
}
