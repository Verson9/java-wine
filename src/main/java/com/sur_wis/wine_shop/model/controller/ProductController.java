package com.sur_wis.wine_shop.model.controller;

import com.sur_wis.wine_shop.model.entity.Product;
import com.sur_wis.wine_shop.model.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Controller
public class ProductController {
    @Autowired
    ProductRepository productRepository;

    @GetMapping( "/product" )
    public List<Product> index() {
        return productRepository.findAll();
    }

    @GetMapping( "/product/{id}" )
    public Product show(@PathVariable String id) {
        int productId = Integer.parseInt(id);
        return productRepository.findOne(productId).ifPresent(s -> s.getClass(Product));
    }

    @PostMapping( "/product" )
    public Product create(@RequestBody String name) {
        Product newProduct = new Product();
        newProduct.setName(name);
        return productRepository.save(newProduct);
    }

    @PutMapping( "/product/{id}" )
    public Product update(@PathVariable String id, @RequestBody Map<String, String> body) {
        int blogId = Integer.parseInt(id);
        Product product = productRepository.findOne(blogId);
        product.setTitle(body.get("title"));
        blog.setContent(body.get("content"));
        return blogRespository.save(blog);
    }

    @DeleteMapping( "product/{id}" )
    public boolean delete(@PathVariable String id) {
        int productId = Integer.parseInt(id);
        productRepository.delete(productId);
        return true;
    }
}
