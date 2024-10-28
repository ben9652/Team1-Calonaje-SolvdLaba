package com.hierarchy.app;

import com.hierarchy.app.Classes.DAO.*;
import com.hierarchy.app.Classes.Model.*;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;


public class App {
    public static void main(String[] args) throws IOException {

        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder()
                .build(Resources.getResourceAsStream("mybatis-config.xml"));

        ProductDAO productDAO = new ProductDAO(sqlSessionFactory);
        MeatDAO meatDAO = new MeatDAO(sqlSessionFactory);
        VegetableDAO vegetableDAO = new VegetableDAO(sqlSessionFactory);
        ChocolateDAO chocolateDAO = new ChocolateDAO(sqlSessionFactory);
        DairyDAO dairyDAO = new DairyDAO(sqlSessionFactory);

        // Usage example
        Product product = productDAO.findById(1);
        System.out.println(product.getName());
        Meat meat = meatDAO.findById(1);
        System.out.println(meat.getName());
        Vegetables veg = vegetableDAO.findById(1);
        System.out.println(veg.getName());

        // Chocolate example
        Chocolate chocolate = chocolateDAO.findById(1);
        System.out.println(chocolate.getName());

        // Dairy example
        Dairy dairy = dairyDAO.findById(1);
        System.out.println(dairy.getName());
    }

}
