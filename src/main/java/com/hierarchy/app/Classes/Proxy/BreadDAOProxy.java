package com.hierarchy.app.Classes.Proxy;
// BreadDAOProxy.java
import com.hierarchy.app.Classes.DAO.BreadDAO;
import com.hierarchy.app.Classes.Interfaces.GenericDAO;
import com.hierarchy.app.Classes.Model.Bread;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.List;


import java.util.List;


public class BreadDAOProxy implements GenericDAO<Bread, Integer> {
    private static final Logger logger = LogManager.getLogger(BreadDAOProxy.class);
    private final BreadDAO breadDAO;

    public BreadDAOProxy(BreadDAO breadDAO) {
        this.breadDAO = breadDAO;
    }

    @Override
    public void insert(Bread bread) {
        log("Inserting Bread: " + bread.getBreadName());
        breadDAO.insert(bread);
    }

    @Override
    public Bread findById(int id) {
        log("Finding Bread by ID: " + id);
        return breadDAO.findById(id);
    }

    @Override
    public List<Bread> getAll() {
        log("Fetching all Breads");
        return breadDAO.getAll();
    }

    @Override
    public void update(Bread bread) {
        log("Updating Bread: " + bread.getBreadName());
        breadDAO.update(bread);
    }

    @Override
    public void delete(int id) {
        log("Deleting Bread with ID: " + id);
        breadDAO.delete(id);
    }

    private void log(String message) {
        logger.info(message);
    }
}