package com.hierarchy.app.Classes.Strategy;

import com.hierarchy.app.Classes.DAO.BreadDAO;
import com.hierarchy.app.Classes.Model.Bread;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class FullUpdateStrategy implements UpdateStrategy<Bread> {
    private static final Logger logger = LogManager.getLogger(FullUpdateStrategy.class);
    private final BreadDAO breadDAO;

    public FullUpdateStrategy(BreadDAO breadDAO) {
        this.breadDAO = breadDAO;
    }

    @Override
    public void update(Bread bread) {
        // Perform a complete update
        logger.info("Performing full update on Bread: " + bread.getBreadName());
        breadDAO.update(bread);
    }
}