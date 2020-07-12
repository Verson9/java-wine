package com.sur_wis.wine_shop.controller;

import com.sur_wis.wine_shop.model.dto.ProductDto;
import com.sur_wis.wine_shop.model.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping( "/showProducts" )
    public String showProducts() {
        List<ProductDto> products = productService.getProductList();
        StringBuilder resp = new StringBuilder();
        for (ProductDto p : products) {
            resp.append(p.toString()).append(";\n");
        }
        return resp.toString();
    }

    @GetMapping( "/showProducts/{id}" )
    public void showProductsById(@PathVariable Long id) {
        ProductDto product = productService.getOneProduct(id);

    }

    @PostMapping( "/addProduct" )
    public String create(@RequestParam String name) {
        ProductDto newProduct = new ProductDto();
        newProduct.setName(name);
        productService.saveProduct(newProduct);
        return "addProduct";
    }

    @PutMapping( "/showProducts/{id}" )
    public String update(@PathVariable String id, @RequestParam String name) {
        Long productId = Long.parseLong(id);
        ProductDto product = productService.updateProduct(productId, name);
        return "showProduct";
    }

    @DeleteMapping( "/showProducts/{id}" )
    public String delete(@PathVariable String id) {
        long productId = Long.parseLong(id);
        productService.deleteProduct(productId);
        return "showProduct";
    }
}
