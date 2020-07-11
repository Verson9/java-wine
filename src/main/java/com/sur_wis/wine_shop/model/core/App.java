package com.sur_wis.wine_shop.model.core;

import com.sur_wis.wine_shop.model.controller.ProductController;
import com.sur_wis.wine_shop.model.dto.ProductDto;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Component
public class App {
    ProductController productController = new ProductController();

    List<ProductDto> productList = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void app() {
        System.out.println("----------Witamy w WineShopie----------");
        System.out.println("Co chcesz zrobić?\n" +
                "1.Dodaj produkt\n" +
                "2.Wyświetl produkty\n" +
                "3.Usuń produkt");
        switch (Integer.parseInt(sc.nextLine())) {
            case 1:
                addProduct();
                break;
            case 2:
                displayProduct();
                break;
            case 3:
                deleteProduct();
                break;
            default:
                System.out.println("----------Błąd wprowadzenia----------");
                app();
                break;
        }
    }

    private void addProduct() {
        System.out.println("Podaj nazwę produktu");
        String productName = sc.nextLine();
        ProductDto newProduct = new ProductDto(productName);
        productList.add(newProduct);
//        productController.create(productName);
        app();
    }

    private void deleteProduct() {
        int j = 1;
        System.out.println("----------Wyświetlanie produktów----------");
        for (ProductDto product : productList) {
            System.out.println(j++ + ". " + product.toString());
        }
        System.out.print("Wprowadź numer produktu który chcesz usunąć");
        int productToDelete = Integer.parseInt(sc.nextLine());
        productList.remove(productToDelete - 1);
//        productController.delete(String.valueOf(productToDelete-1));
        displayProduct();
    }

    private void displayProduct() {
        int j = 1;
        System.out.println("----------Wyświetlanie produktów----------");
        for (ProductDto product : productList) {
            System.out.println(j++ + ". " + product.toString());
        }
        int z = 1;
//        List<ProductDto> dtoList = ProductMapper.INSTANCE.listedEntityToDto(productController.index());
//        System.out.println("----------Wyświetlanie produktów----------");
//        for (ProductDto product : productList) {
//            System.out.println(z++ + ". " + dtoList.toString());
//        }
        app();
    }
}
