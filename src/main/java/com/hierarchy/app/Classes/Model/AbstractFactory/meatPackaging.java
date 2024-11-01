package com.hierarchy.app.Classes.Model.AbstractFactory;

import com.hierarchy.app.Classes.Interfaces.orderPackaging;

public class meatPackaging implements orderPackaging {
    @Override
    public void packOrder() {
        System.out.println("Packaging meat Order.");
    }
}
