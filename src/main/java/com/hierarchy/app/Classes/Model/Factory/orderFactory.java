package com.hierarchy.app.Classes.Model.Factory;

import com.hierarchy.app.Classes.Interfaces.ProductOrder;


public class orderFactory {
    public ProductOrder createOrder(String type){
        if (type.equalsIgnoreCase("Meat")) {
            return new meatOrder();
        } else if (type.equalsIgnoreCase("Vegetable")) {
            return new vegetableOrder();
        }
        return null;
    }
}
