package com.hierarchy.app.Classes.Proxy;
// BreadDAOProxy.java
import com.hierarchy.app.Classes.DAO.BreadDAO;
import com.hierarchy.app.Classes.Interfaces.GenericDAO;
import com.hierarchy.app.Classes.Model.Bread;
import com.hierarchy.app.Classes.Service.BreadService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.List;


import java.util.List;


public class BreadDAOProxy implements GenericDAO<Bread, Integer>{
    private static final Logger logger = LogManager.getLogger(BreadDAOProxy.class);
    private final BreadService breadService;

    public BreadDAOProxy(BreadService breadService) {
        this.breadService = breadService;
    }

    @Override
    public void insert(Bread bread) {
        log("Inserting Bread: " + bread.getBreadName());
        breadService.addBread(bread);
    }

    @Override
    public Bread findById(int id) {
        log("Finding Bread by ID: " + id);
        return breadService.findBreadById(id);
    }

    @Override
    public List<Bread> getAll() {
        log("Fetching all Breads");
        return breadService.getAllBread();
    }

    @Override
    public void update(Bread bread) {
        log("Updating Bread: " + bread.getBreadName());
        breadService.updateBread(bread);
    }

    @Override
    public void delete(int id) {
        log("Deleting Bread with ID: " + id);
        breadService.deleteBread(id);
    }

    private void log(String message) {
        logger.info(message);
    }
}