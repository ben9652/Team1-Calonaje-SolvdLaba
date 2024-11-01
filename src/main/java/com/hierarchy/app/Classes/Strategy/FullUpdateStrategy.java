package com.hierarchy.app.Classes.Strategy;

import com.hierarchy.app.Classes.DAO.BreadDAO;
import com.hierarchy.app.Classes.Interfaces.GenericDAO;
import com.hierarchy.app.Classes.Model.Bread;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.SQLException;

public class FullUpdateStrategy implements UpdateStrategy<Bread> {
    private static final Logger logger = LogManager.getLogger(FullUpdateStrategy.class);
    private final GenericDAO<Bread, Integer> breadDAO;

    public FullUpdateStrategy(GenericDAO<Bread, Integer> breadDAO) {
        this.breadDAO = breadDAO;
    }

    @Override
    public void update(Bread bread) {
        logger.info("Performing full update on Bread: " + bread.getBreadName());
        try {
            breadDAO.update(bread);
        } catch (SQLException e) {
            logger.error("Error updating Bread: " + bread.getBreadName(), e);
            throw new RuntimeException("Update failed", e);
        }
    }
}