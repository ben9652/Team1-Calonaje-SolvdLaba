package com.hierarchy.app;

import com.hierarchy.app.Classes.MVC.BreadController;
import com.hierarchy.app.Classes.MVC.BreadView;
import com.hierarchy.app.Classes.Proxy.BreadDAOProxy;
import com.hierarchy.app.Classes.DAO.*;
import com.hierarchy.app.Classes.Decorators.ChocolateDecorator;
import com.hierarchy.app.Classes.Decorators.DiscountDecorator;
import com.hierarchy.app.Classes.Facade.ChocolateFacade;
import com.hierarchy.app.Classes.Strategy.FullUpdateStrategy;
import com.hierarchy.app.Classes.Model.*;
import com.hierarchy.app.Classes.Strategy.QuickUpdateStrategy;
import com.hierarchy.app.Classes.Service.BreadService;
import com.hierarchy.app.Classes.Service.ProductService;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.logging.log4j.LogManager;

import java.io.File;
import java.io.IOException;
import java.util.List;


public class App {
    public static org.apache.logging.log4j.Logger logger;
    public static void main(String[] args) throws IOException {
        File log4jfile =new File("src.main.resources.log4j2.xml");
        System.setProperty("log4j2.configurationFile",log4jfile.toURI().toString());
        logger= LogManager.getLogger(App.class);

       SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder()
               .build(Resources.getResourceAsStream("mybatis-config.xml"));
//
//        ProductDAO productDAO = new ProductDAO(sqlSessionFactory);
//        BreadDAO breadDAO = new BreadDAO(sqlSessionFactory);
//        BreadService breadService = new BreadService(breadDAO);
//        FruitDAO fruitDAO = new FruitDAO(sqlSessionFactory);
//        FruitService fruitService = new FruitService(fruitDAO);
//        ChocolateDAO chocolateDAO = new ChocolateDAO(sqlSessionFactory);
//        ChocolateService chocolateService = new ChocolateService(chocolateDAO);
//        DairyDAO dairyDAO = new DairyDAO(sqlSessionFactory);
//        DairyService dairyService = new DairyService(dairyDAO);
//
//
//        Dairy dairy = dairyDAO.findById(1);
//        logger.info(dairy.toString());
//
//        Chocolate chocolate = chocolateDAO.findById(1);
//        logger.info(chocolate.toString());
//
//
//        Fruit fruit = fruitDAO.findById(1);
//        logger.info("Fruit Name: " + fruit.toString());
//        Bread bread = breadDAO.findById(1);
//        logger.info("Bread Name: " + bread.toString());
//
//        int breadProductId = 6;
//        Product breadProduct = productDAO.findById(breadProductId);
//        if (breadProduct == null) {
//            breadProduct = new Product(breadProductId, "Whole Wheat Bread", 50);
//            productDAO.insert(breadProduct);
//            logger.info("Added product with ID: " + breadProductId);
//        }
//
////        Bread bread = new Bread(breadProductId, "Whole Wheat Bread", 50, 126, "Whole Wheat", "Brand B");
////        breadService.addBread(bread);
////        System.out.println("Added bread: " + bread.getBreadName());
//
//
//        Bread foundBread = breadService.findBreadById(1);
//        if (foundBread != null) {
//            logger.info("Found bread: " + foundBread.getBreadName() + ", Brand: " + foundBread.getBrand());
//        }
//
//
//        foundBread.setBreadName("Multi-Grain Bread");
//        breadService.updateBread(foundBread);
//        logger.info("Updated bread: " + foundBread.getBreadName());
//
//
//        breadService.deleteBread(140);
//        logger.info("Deleted bread with ID: 1");
//
//        // Fruits test
//        int fruitProductId = 136;
//        Product fruitProduct = productDAO.findById(fruitProductId);
//        if (fruitProduct == null) {
//            fruitProduct = new Product(fruitProductId, "Generic Product", 100);
//            productDAO.insert(fruitProduct);
//            logger.info("Added product with ID: " + fruitProductId);
//        }
//
//
////        Fruit apple = new Fruit(fruitProductId, "Apple", 10, 157, "Red Apple", "Brand A");
////        fruitService.addFruit(apple);
////        System.out.println("Added fruit: " + apple.getFruitName());
//
//
//
//        Fruit foundFruit = fruitService.getFruitById(154);
//        if (foundFruit != null) {
//            logger.info("Found fruit: " + foundFruit.getFruitName() + ", Brand: " + foundFruit.getBrand());
//            foundFruit.setFruitName("Green Apple");
//            fruitService.updateFruit(foundFruit);
//            logger.info("Updated fruit: " + foundFruit.getFruitName());
//        }
//
//        fruitService.deleteFruit(154);
//        logger.info("Deleted fruit with ID: 154");
//
//        // Chocolates test
////        int chocolateProductId = 3;
////        Product chocolateProduct = chocolateDAO.findById(chocolateProductId);
////        if(chocolateProduct == null) {
////            chocolateProduct = new Product(chocolateProductId, "Hazelnut chocolate", 1500);
////            productDAO.insert(chocolateProduct);
////            System.out.println("Added product with ID: " + chocolateProductId);
////        }
////
////        Chocolate chocolate = new Chocolate(chocolateProductId, "Golden pleasure", "Ferrero Rocher");
////        chocolateService.addChocolate(chocolate);
////        System.out.println("Added chocolate: " + chocolate.getChocoName());
//
//        Chocolate foundChocolate = chocolateService.getChocolateById(2);
//        if(foundChocolate != null) {
//            logger.info("Found chocolate: " + foundChocolate.getChocoName() + ", Brand: " + foundChocolate.getBrand());
//            foundChocolate.setChocoName("Chocolate bar");
//            chocolateService.updateChocolate(foundChocolate);
//            logger.info("Updated chocolate: " + foundChocolate.getChocoName());
//        }
//
//        chocolateService.deleteChocolate(2);
//        logger.info("Deleted chocolate with ID: 154");
//
//        // Dairy test
////        int dairyProductId = 3;
////        Product dairyProduct = chocolateDAO.findById(dairyProductId);
////        if(dairyProduct == null) {
////            dairyProduct = new Product(dairyProductId, "Cheese", 800);
////            productDAO.insert(dairyProduct);
////            System.out.println("Added product with ID: " + dairyProductId);
////        }
////
////        Dairy dairy = new Dairy(dairyProductId, "Cremon cheese", "Ilolay");
////        dairyService.addDairy(dairy);
////        System.out.println("Added dairy: " + dairy.getDairyName());
//
//        Dairy foundDairy = dairyService.getDairyById(2);
//        if(foundDairy != null) {
//            logger.info("Found dairy: " + foundDairy.getDairyName() + ", Brand: " + foundDairy.getBrand());
//            foundDairy.setDairyName("Dairy bar");
//            dairyService.updateDairy(foundDairy);
//            logger.info("Updated dairy: " + foundDairy.getDairyName());
//        }
//
//        dairyService.deleteDairy(2);
//        logger.info("Deleted dairy with ID: 154");


        // Crear instancia de BreadDAO
        BreadDAO breadDAO = new BreadDAO(sqlSessionFactory);
        BreadService breadService = new BreadService(breadDAO);

// Crear proxy usando BreadDAO
        BreadDAOProxy breadDAOProxy = new BreadDAOProxy(breadService);


// Crear el controlador con el servicio configurado
        BreadController breadController = new BreadController(breadService);

// Crear estrategias de actualización usando el proxy
        FullUpdateStrategy fullUpdateStrategy = new FullUpdateStrategy(breadDAOProxy);
        QuickUpdateStrategy quickUpdateStrategy = new QuickUpdateStrategy(breadDAO);

// Crear una instancia de BreadView
        BreadView breadView = new BreadView();

// Probar el patrón MVC: agregar, actualizar y eliminar pan
// Bread newBread = new Bread(87, "Whole Wheat Bread", 50, 102, "Pan Integral", "BrandA");
// breadController.addBread(newBread);

// Obtener y mostrar pan por ID
        Bread retrievedBread = breadController.getBreadById(2);
        logger.info("Retrieved Bread: " + retrievedBread.getBreadName());
        breadView.displayBread(retrievedBread); // Mostrar detalles del pan

// Probar la estrategia de actualización completa
        fullUpdateStrategy.update(retrievedBread);

// Cambiar algunos atributos y realizar una actualización rápida
        retrievedBread.setBreadName("Updated Bread Name");
        quickUpdateStrategy.update(retrievedBread);

// Obtener todos los panes y mostrarlos
        List<Bread> allBreads = breadController.getAllBreads();
        breadView.displayBreadList(allBreads); // Mostrar la lista de panes

// Eliminar pan
        breadController.deleteBread(101);

        //Factories
        orderFactory factory=new orderFactory();

        packageFactory meatFactory=new meatFactory();
        ProductOrder meatOrder=factory.createOrder("Meat");
        orderPackaging meatPackaging=meatFactory.createPackaging();
        meatOrder.prepareOrder();
        meatPackaging.packOrder();

        packageFactory vegetableFactory=new vegetableFactory();
        ProductOrder vegetableOrder=factory.createOrder("Vegetable");
        orderPackaging vegetablePackaging=vegetableFactory.createPackaging();
        vegetableOrder.prepareOrder();
        vegetablePackaging.packOrder();
        
        //Builder
        Order order =new Order.orderBuilder(1,43,400)
                .setExpirationDate("23/04/2024")
                .setEmissionDate("23/03/2024")
                .setLocation("Coto Supermarket")
                .build();
        logger.info(order);
    }

        // Chocolate

        // Listener, Facade, and Decorator
        ProductService productServiceForChocolate = new ProductService(new ProductDAO(sqlSessionFactory));

        Product chocolateProduct = new Product(40, "Chocolate", 500);
        productServiceForChocolate.addProduct(chocolateProduct);
        
        ChocolateFacade chocolateFacade = new ChocolateFacade(sqlSessionFactory);
        Chocolate newChocolate = new Chocolate(chocolateProduct.getIdProduct(), chocolateProduct.getName(), chocolateProduct.getPrice(), 2, "Bon o Bon", "Arcor");
        chocolateFacade.addChocolate(newChocolate);

        Chocolate gotChocolate = chocolateFacade.getChocolateById(3);
        if(gotChocolate != null) {
                gotChocolate.setChocoName("Gen candy");
                chocolateFacade.updateChocolate(gotChocolate);
        }

        DiscountDecorator chocolateDecorator = new DiscountDecorator(newChocolate, 0.1);
        logger.info(chocolateDecorator);
    }
}
