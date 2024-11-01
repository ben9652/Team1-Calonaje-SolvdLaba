package com.hierarchy.app.Classes.Model.Factory;

import com.hierarchy.app.Classes.Interfaces.ProductOrder;

public class meatOrder implements ProductOrder {

    @Override
    public void prepareOrder() {
        System.out.println("Preparing meat order.");
    }
}
