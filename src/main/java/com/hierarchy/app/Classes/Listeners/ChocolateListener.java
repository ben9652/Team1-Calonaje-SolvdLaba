package com.hierarchy.app.Classes.Listeners;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.hierarchy.app.Classes.Interfaces.IChocolateListener;
import com.hierarchy.app.Classes.Model.Chocolate;

public class ChocolateListener implements IChocolateListener {
    private static final Logger logger = LogManager.getLogger(ChocolateListener.class);

    @Override
    public void onChocolateAdded(Chocolate chocolate) {
        logger.info("Chocolate added: " + chocolate);
    }

    @Override
    public void onChocolateUpdated(Chocolate chocolate) {
        logger.info("Chocolate updated: " + chocolate);
    }

    @Override
    public void onChocolateRemoved(Chocolate chocolate) {
        logger.info("Chocolate removed: " + chocolate);
    }
}
