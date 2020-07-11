package com.sur_wis.wine_shop.model.controller;

import com.sur_wis.wine_shop.model.entity.Product;
import com.sur_wis.wine_shop.model.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping( "/products" )
public class ProductController {
    @Autowired
    ProductRepository productRepository;

    @GetMapping( "/product" )
    public List<Product> index() {
        return productRepository.findAll();
    }

    @GetMapping( "/product1" )
    public String index1() {
        List<Product> products = productRepository.findAll();
        for (Product p : products) {
            System.out.println(p.toString());
        }
        return "product";
    }

    @GetMapping( "/product/{id}" )
    public Product show(@PathVariable String id) {
        int productId = Integer.parseInt(id);
        return productRepository.getById(productId);
    }

    @PostMapping( "/addProduct" )
    public Product create(@RequestParam String name) {
        Product newProduct = new Product();
        newProduct.setName(name);
        return productRepository.save(newProduct);
    }

    @PutMapping( "/product/{id}" )
    public Product update(@PathVariable String id, @RequestParam String name) {
        int productId = Integer.parseInt(id);
        Product product = productRepository.getById(productId);
        product.setName(name);
        return productRepository.save(product);
    }

    @DeleteMapping( "product/{id}" )
    public boolean delete(@PathVariable String id) {
        int productId = Integer.parseInt(id);
        productRepository.deleteById(productId);
        return true;
    }
}
