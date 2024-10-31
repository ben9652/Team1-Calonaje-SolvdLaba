package com.hierarchy.app.Classes.MVC;

import com.hierarchy.app.Classes.Model.Bread;

import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

public class BreadView {
    private static final Logger logger = LogManager.getLogger(BreadView.class);

    public void displayBread(Bread bread) {
        logger.info("Bread Details: Name = " + bread.getBreadName() + ", Brand = " + bread.getBrand());
    }

    public void displayBreadList(List<Bread> breads) {
        logger.info("Displaying list of breads:");
        breads.forEach(bread -> logger.info("Bread: " + bread.getBreadName() + ", Brand: " + bread.getBrand()));
    }
}