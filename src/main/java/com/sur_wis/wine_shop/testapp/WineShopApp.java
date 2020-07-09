package com.sur_wis.wine_shop.testapp;

import com.sur_wis.wine_shop.model.dto.ProductDto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class WineShopApp {

    List<ProductDto> productList = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public WineShopApp() {
    }

    public void app(){
        System.out.println("----------Witamy w WineShopie----------");
        System.out.println("Co chcesz zrobić?\n" +
                "1.Dodaj produkt\n" +
                "2.Wyświetl produkty\n" +
                "3.Usuń produkt");
        switch (Integer.parseInt(sc.nextLine())){
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

    }

    private void deleteProduct() {
        int j = 1;
        System.out.println("----------Wyświetlanie produktów----------");
        for (ProductDto wine : productList) {
            System.out.println(j++ + ". " + wine.toString());
        }
        System.out.print("Wprowadź numer produktu który chcesz usunąć");
        int productToDelete = Integer.parseInt(sc.nextLine());
        productList.remove(productToDelete - 1);
        displayProduct();
    }

    private void displayProduct(){
        int j = 1;
        System.out.println("----------Wyświetlanie produktów----------");
        for (ProductDto wine:productList) {
            System.out.println(j++ + ". " + wine.toString());
        }
        app();
    }
}
