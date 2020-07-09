package com.sur_wis.wine_shop.model.service;

import com.sur_wis.wine_shop.model.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    @Autowired
    private ProductRepository repository;


}
