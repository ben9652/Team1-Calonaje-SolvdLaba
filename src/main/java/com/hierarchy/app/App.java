package com.hierarchy.app;

import com.hierarchy.app.Classes.DAO.*;
import com.hierarchy.app.Classes.Model.*;
import com.hierarchy.app.Classes.Service.BreadService;
import com.hierarchy.app.Classes.Service.ChocolateService;
import com.hierarchy.app.Classes.Service.DairyService;
import com.hierarchy.app.Classes.Service.FruitService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;


public class App {
    public static void main(String[] args) throws IOException {

//        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder()
//                .build(Resources.getResourceAsStream("mybatis-config.xml"));
//
//        ProductDAO productDAO = new ProductDAO(sqlSessionFactory);
//        MeatDAO meatDAO = new MeatDAO(sqlSessionFactory);
//        VegetableDAO vegetableDAO = new VegetableDAO(sqlSessionFactory);
//        FruitDAO fruitDAO = new FruitDAO(sqlSessionFactory);
//        BreadDAO breadDAO = new BreadDAO(sqlSessionFactory);
//        ChocolateDAO chocolateDAO = new ChocolateDAO(sqlSessionFactory);
//        DairyDAO dairyDAO = new DairyDAO(sqlSessionFactory);
//
//
//        FruitService fruitService = new FruitService(fruitDAO);


//        // Usage example
//        Product product = productDAO.findById(1);
//        System.out.println(product.getName());
//        Meat meat = meatDAO.findById(1);
//        System.out.println(meat.getName());
//        Vegetables veg = vegetableDAO.findById(1);
//        System.out.println(veg.getName());
//
//        Fruit fruit = fruitDAO.findById(1);
//        System.out.println("Fruit Name: " + fruit.getFruitName());
//        Bread bread = breadDAO.findById(1);
//        System.out.println("Bread Name: " + bread.getBreadName());
//
//        // Chocolate example
//        Chocolate chocolate = chocolateDAO.findById(1);
//        System.out.println(chocolate.getName());
//
//        // Dairy example
//        Dairy dairy = dairyDAO.findById(1);
//        System.out.println(dairy.getName());


        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder()
                .build(Resources.getResourceAsStream("mybatis-config.xml"));


        ProductDAO productDAO = new ProductDAO(sqlSessionFactory);
        BreadDAO breadDAO = new BreadDAO(sqlSessionFactory);
        BreadService breadService = new BreadService(breadDAO);
        FruitDAO fruitDAO = new FruitDAO(sqlSessionFactory);
        FruitService fruitService = new FruitService(fruitDAO);
        ChocolateDAO chocolateDAO = new ChocolateDAO(sqlSessionFactory);
        ChocolateService chocolateService = new ChocolateService(chocolateDAO);
        DairyDAO dairyDAO = new DairyDAO(sqlSessionFactory);
        DairyService dairyService = new DairyService(dairyDAO);

        // Breads test
        int breadProductId = 6;
        Product breadProduct = productDAO.findById(breadProductId);
        if (breadProduct == null) {
            breadProduct = new Product(breadProductId, "Whole Wheat Bread", 50);
            productDAO.insert(breadProduct);
            System.out.println("Added product with ID: " + breadProductId);
        }

        Bread bread = new Bread(breadProductId, "Whole Wheat Bread", 50, 126, "Whole Wheat", "Brand B");
        breadService.addBread(bread);
        System.out.println("Added bread: " + bread.getBreadName());


        Bread foundBread = breadService.findBreadById(1);
        if (foundBread != null) {
            System.out.println("Found bread: " + foundBread.getBreadName() + ", Brand: " + foundBread.getBrand());
        }


        foundBread.setBreadName("Multi-Grain Bread");
        breadService.updateBread(foundBread);
        System.out.println("Updated bread: " + foundBread.getBreadName());


        breadService.deleteBread(140);
        System.out.println("Deleted bread with ID: 1");

        // Fruits test
        int fruitProductId = 136;
        Product fruitProduct = productDAO.findById(fruitProductId);
        if (fruitProduct == null) {
            fruitProduct = new Product(fruitProductId, "Generic Product", 100);
            productDAO.insert(fruitProduct);
            System.out.println("Added product with ID: " + fruitProductId);
        }


        Fruit apple = new Fruit(fruitProductId, "Apple", 10, 157, "Red Apple", "Brand A");
        fruitService.addFruit(apple);
        System.out.println("Added fruit: " + apple.getFruitName());


        Fruit foundFruit = fruitService.getFruitById(154);
        if (foundFruit != null) {
            System.out.println("Found fruit: " + foundFruit.getFruitName() + ", Brand: " + foundFruit.getBrand());
        }


        foundFruit.setFruitName("Green Apple");
        fruitService.updateFruit(foundFruit);
        System.out.println("Updated fruit: " + foundFruit.getFruitName());


        fruitService.deleteFruit(154);
        System.out.println("Deleted fruit with ID: 154");

        // Chocolates test
        int chocolateProductId = 3;
        Product chocolateProduct = chocolateDAO.findById(chocolateProductId);
        if(chocolateProduct == null) {
            chocolateProduct = new Product(chocolateProductId, "Hazelnut chocolate", 1500);
            productDAO.insert(chocolateProduct);
            System.out.println("Added product with ID: " + chocolateProductId);
        }

        Chocolate chocolate = new Chocolate(chocolateProductId, "Golden pleasure", "Ferrero Rocher");
        chocolateService.addChocolate(chocolate);
        System.out.println("Added chocolate: " + chocolate.getChocoName());

        Chocolate foundChocolate = chocolateService.getChocolateById(2);
        if(foundChocolate != null) {
            System.out.println("Found chocolate: " + foundChocolate.getChocoName() + ", Brand: " + foundChocolate.getBrand());
        }

        foundChocolate.setChocoName("Chocolate bar");
        chocolateService.updateChocolate(foundChocolate);
        System.out.println("Updated chocolate: " + foundChocolate.getChocoName());

        chocolateService.deleteChocolate(2);
        System.out.println("Deleted chocolate with ID: 154");

        // Dairy test
        int dairyProductId = 3;
        Product dairyProduct = chocolateDAO.findById(dairyProductId);
        if(dairyProduct == null) {
            dairyProduct = new Product(dairyProductId, "Cheese", 800);
            productDAO.insert(dairyProduct);
            System.out.println("Added product with ID: " + dairyProductId);
        }

        Dairy dairy = new Dairy(dairyProductId, "Cremon cheese", "Ilolay");
        dairyService.addDairy(dairy);
        System.out.println("Added dairy: " + chocolate.getChocoName());

        Dairy foundDairy = dairyService.getDairyById(2);
        if(foundDairy != null) {
            System.out.println("Found dairy: " + foundDairy.getDairyName() + ", Brand: " + foundDairy.getBrand());
        }

        foundDairy.setDairyName("Dairy bar");
        dairyService.updateDairy(foundDairy);
        System.out.println("Updated dairy: " + foundDairy.getDairyName());

        dairyService.deleteDairy(2);
        System.out.println("Deleted dairy with ID: 154");
    }
}
