package com.hierarchy.app.Classes.Model.Factory;

import com.hierarchy.app.Classes.Interfaces.ProductOrder;

public class vegetableOrder implements ProductOrder {
    @Override
    public void prepareOrder() {
        System.out.println("Preparing vegetable order.");
    }
}
