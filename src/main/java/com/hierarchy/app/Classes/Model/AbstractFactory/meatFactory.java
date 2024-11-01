package com.hierarchy.app.Classes.Model.AbstractFactory;

import com.hierarchy.app.Classes.Interfaces.orderPackaging;
import com.hierarchy.app.Classes.Interfaces.packageFactory;

public class meatFactory implements packageFactory {
    @Override
    public orderPackaging createPackaging() {
        return new meatPackaging();
    }
}
