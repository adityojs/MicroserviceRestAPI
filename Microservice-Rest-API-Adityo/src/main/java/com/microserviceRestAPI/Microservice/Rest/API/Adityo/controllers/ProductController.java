package com.microserviceRestAPI.Microservice.Rest.API.Adityo.controllers;

import com.microserviceRestAPI.Microservice.Rest.API.Adityo.model.entities.Product;
import com.microserviceRestAPI.Microservice.Rest.API.Adityo.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class ProductController {
    @Autowired
    private ProductService productService;
    @PostMapping
    public Product create(@RequestBody Product product){
        return productService.save(product);
    }
    @GetMapping
    public Iterable<Product> findAll(){
        return productService.findAll();
    }
    @GetMapping("/{id}")
    public Product findOne(@PathVariable("id") Long id){
        return productService.findOne(id);
    }
    @PutMapping
    public Product update(@RequestBody Product product){
        return productService.save(product);
    }

    @DeleteMapping ("/{id}")
    public void removeOne(@PathVariable("id") Long id){
        productService.removeOne(id);
    }
}
