package com.sur_wis.wine_shop.controller;

import com.sur_wis.wine_shop.model.dto.ProductDto;
import com.sur_wis.wine_shop.model.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping( "/showProducts" )
    public String showProducts(Model model) {
        List<ProductDto> products = productService.getProductList();
        model.addAttribute("showProducts", products);
        return "webapp/WEB-INF/showProduct.jsp";
    }

    @GetMapping( "/showProducts/{id}" )
    public String showProductsById(@PathVariable Long id, Model model) {
        ProductDto product = productService.getOneProduct(id);
        model.addAttribute("showProducts", product);
        return "showProducts1";
    }

    @PostMapping( "/addProduct" )
    public String create(@RequestParam String name) {
        ProductDto newProduct = new ProductDto();
        newProduct.setName(name);
        productService.saveProduct(newProduct);
        return "addProduct1";
    }

    @PutMapping( "/updateProduct/{id}" )
    public String update(@PathVariable String id, @RequestParam String name) {
        Long productId = Long.parseLong(id);
        ProductDto product = productService.updateProduct(productId, name);
        return "showProducts1";
    }

    @DeleteMapping( "/deleteProduct/{id}" )
    public String delete(@PathVariable String id) {
        long productId = Long.parseLong(id);
        productService.deleteProduct(productId);
        return "showProducts1";
    }
}
