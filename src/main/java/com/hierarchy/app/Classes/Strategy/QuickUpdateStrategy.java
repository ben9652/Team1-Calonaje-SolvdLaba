package com.hierarchy.app.Classes.Strategy;

import com.hierarchy.app.Classes.DAO.BreadDAO;
import com.hierarchy.app.Classes.Model.Bread;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class QuickUpdateStrategy implements UpdateStrategy<Bread> {
    private static final Logger logger = LogManager.getLogger(QuickUpdateStrategy.class);
    private final BreadDAO breadDAO;

    public QuickUpdateStrategy(BreadDAO breadDAO) {
        this.breadDAO = breadDAO;
    }

    @Override
    public void update(Bread bread) {
        // Perform quick update
        logger.info("Performing quick update on Bread: " + bread.getBreadName());
        breadDAO.update(bread);
    }
}