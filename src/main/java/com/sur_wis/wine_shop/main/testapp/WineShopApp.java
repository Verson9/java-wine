package com.sur_wis.wine_shop.main.testapp;

import com.sur_wis.wine_shop.controller.WineController;
import com.sur_wis.wine_shop.model.dto.AccessoryDto;
import com.sur_wis.wine_shop.model.dto.ProductDto;
import com.sur_wis.wine_shop.model.dto.WineDto;
import com.sur_wis.wine_shop.model.mapper.WineMapper;
import com.sur_wis.wine_shop.model.service.WineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.management.Query;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class WineShopApp {
    @Autowired
    WineController wineController;

    List<ProductDto> productList = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    Integer accessoryId = 1;
    Integer wineId = 1;

    public WineShopApp() {
    }

    public void app(){
        System.out.println("----------Witamy w WineShopie----------");
        System.out.println("Co chcesz zrobić?\n" +
                "1.Dodaj wino\n" +
                "2.Dodaj akcesoria\n" +
                "3.Wyświetl wina\n" +
                "4.Wyświetl akcesoria\n" +
                "5.Wyświetl produkty\n" +
                "6.Usuń produkt");
        switch (Integer.parseInt(sc.nextLine())){
            case 1:
                createWine();
                break;
            case 2:
                createAccessory();
                break;
            case 3:
                displayWine();
                break;
            case 4:
                displayAccessory();
                break;
            case 5:
                displayProduct();
                break;
            case 6:
                deleteProduct();
                break;
            default:
                System.out.println("----------Błąd wprowadzenia----------");
                app();
                break;
        }
    }

    private void deleteProduct() {
        int j = 1;
        System.out.println("----------Wyświetlanie produktów----------");
        for (ProductDto wine:productList) {
            System.out.println(j++ + ". " + wine.toString());
        }
        System.out.print("Wprowadź numer produktu który chcesz usunąć");
        int productToDelete = Integer.parseInt(sc.nextLine());
        productList.remove(productToDelete-1);
        displayProduct();
    }

    private void createAccessory() {
        System.out.println("----------Dodawanie akcesoriów----------");
        System.out.println("Podaj nazwę produktu");
        String accessoryName = sc.nextLine();
        System.out.println("Opisz produkt");
        String accessoryDescription = sc.nextLine();
        System.out.println("Podaj cenę");
        Integer accessoryPrice = Integer.parseInt(sc.nextLine());
        System.out.println("Podaj podtyp");
        String accessorySubType = sc.nextLine();
//        AccessoryDto newAccessory =  new AccessoryDto(accessoryId++, accessoryName, accessoryDescription, accessoryPrice, accessorySubType);
//        productList.add(newAccessory);
        app();
    }

    private void createWine(){
        System.out.println("----------Dodawanie wina----------");
        System.out.println("Podaj nazwę produktu");
        String wineName = sc.nextLine();
        System.out.println("Opisz produkt");
        String wineDescription = sc.nextLine();
        System.out.println("Podaj cenę");
        Integer winePrice = Integer.parseInt(sc.nextLine());
        System.out.println("Podaj kolor wina");
        String wineColor = sc.nextLine();
        System.out.println("Podaj kraj pochodzenia");
        String wineCountry = sc.nextLine();
        System.out.println("Podaj region");
        String wineRegion = sc.nextLine();
        System.out.println("Podaj typ smaku");
        String wineTaste = sc.nextLine();
        System.out.println("Podaj rok produkcji");
        int wineYear = Integer.parseInt(sc.nextLine());
        WineDto newWine = new WineDto(wineName, wineDescription, winePrice, wineColor, wineCountry,wineRegion,wineTaste, wineYear);
        productList.add(newWine);
        wineController.addWine(newWine);
        app();
    }

    private void displayWine(){
        int j = 1;
        System.out.println("----------Wyświetlanie win----------");
        for (ProductDto wine:productList) {
            if (wine instanceof WineDto)
                System.out.println(j++ + ". " + wine.toString());
        }
        System.out.println("\n" +
                "----------Wyświetlanie win z bazy danych----------");
        List<WineDto> wines = WineMapper.INSTANCE.entityToDtoList(wineController.getAllWines());
        for (WineDto wine:wines) {
            System.out.println(wine.toString());
        }
        app();
    }

    private void displayAccessory(){
        int j = 1;
        System.out.println("----------Dodawanie akcesoriów----------");
        for (ProductDto wine:productList) {
            if (wine instanceof AccessoryDto)
                System.out.println(j++ + ". " + wine.toString());
        }
        app();
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
