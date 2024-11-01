package com.hierarchy.app.Classes.MVC;

import com.hierarchy.app.App;
import com.hierarchy.app.Classes.Model.Bread;
import com.hierarchy.app.Classes.Service.BreadService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import java.util.List;

public class BreadController {

    private static final Logger logger = LogManager.getLogger(BreadController.class);
    private final BreadService breadService;

    public BreadController(BreadService breadService) {
        this.breadService = breadService;
    }

    public void addBread(Bread bread) {
        breadService.addBread(bread);
        logger.info("Bread added successfully: " + bread.getBreadName());
    }

    public void updateBread(Bread bread) {
        breadService.updateBread(bread);
        logger.info("Bread updated successfully: " + bread.getBreadName());
    }

    public void deleteBread(int id) {
        breadService.deleteBread(id);
        logger.info("Bread deleted successfully with ID: " + id);
    }

    public Bread getBreadById(int id) {
        return breadService.findBreadById(id);
    }

    public List<Bread> getAllBreads() {
        return breadService.getAllBread();
    }
}