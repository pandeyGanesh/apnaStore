package com.pandeyXYZ.apnaStore.Services;

import com.pandeyXYZ.apnaStore.Models.Products;
import com.pandeyXYZ.apnaStore.Repository.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductsService {

    @Autowired
    ProductsRepository productsRepository;

    /**
     * Function to save entity in Database
     * @param product the product object
     */
    public void save(Products product){
        productsRepository.save(product);
    }

    /**
     * Fetches and returns the product
     * @param id the Id to search for in Database
     * @return the object, if found in database.
     */
    public Products getProduct(Long id){
        Optional<Products> product = productsRepository.findById(id);
        return product.get();
    }

    public List<Products> getAll(){
        return (List<Products>) productsRepository.findAll();
    }
}
