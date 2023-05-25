package com.microserviceRestAPI.Microservice.Rest.API.Adityo.model.repos;

import com.microserviceRestAPI.Microservice.Rest.API.Adityo.model.entities.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductRepo extends CrudRepository<Product, Long> {

    List<Product> findByNameContains(String name);
}
