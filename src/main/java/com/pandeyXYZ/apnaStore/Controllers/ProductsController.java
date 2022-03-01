package com.pandeyXYZ.apnaStore.Controllers;

import com.pandeyXYZ.apnaStore.Models.Products;
import com.pandeyXYZ.apnaStore.Services.ProductsService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping(value = "/products")
public class ProductsController {
    private ProductsService productsService;

    public ProductsController(ProductsService productsService) {
        this.productsService =  productsService;
    }

    @PostMapping
    public String saveProduct(@RequestBody Products product){
        productsService.save(product);
        return "SUCCESS";
    }

    @GetMapping()
    public List<Products> getAllProducts(){
        return productsService.getAll();
    }

    @GetMapping(path = "/{id}")
    public Products getProductWithId(@PathVariable Long id){
        return productsService.getProduct(id);
    }
}
