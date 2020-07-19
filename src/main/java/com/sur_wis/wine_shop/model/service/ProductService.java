package com.sur_wis.wine_shop.model.service;

import com.sur_wis.wine_shop.model.dto.ProductDto;
import com.sur_wis.wine_shop.model.entity.Product;
import com.sur_wis.wine_shop.model.mapper.ProducerMapper;
import com.sur_wis.wine_shop.model.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@EnableJpaRepositories
public class ProductService {

    @Autowired
    private ProductRepository productRepository;


    public ProductDto getOneProduct(Long id) {
        Optional<Product> product = productRepository.findById(id);
        ProductDto productDto;
        if (product.isPresent()) {
            productDto = ProducerMapper.INSTANCE.entityToDto(product.get());
        } else {
            return null;
        }
        return productDto;
    }

    public List<ProductDto> getProductList() {
        List<Product> products = productRepository.findAll();
        List<ProductDto> productDtos = ProducerMapper.INSTANCE.listedEntityToDto(products);
        return productDtos;
    }

    public boolean saveProduct(ProductDto productDto) {
        Product newProduct = ProducerMapper.INSTANCE.dtoToEntity(productDto);
        productRepository.save(newProduct);
        return true;
    }

    public ProductDto updateProduct(Long id, String name) {
        ProductDto productDto = getOneProduct(id);
        productDto.setName(name);
        saveProduct(productDto);
        return productDto;
    }

    public void deleteProduct(long productId) {
        productRepository.deleteById(productId);
    }
}
