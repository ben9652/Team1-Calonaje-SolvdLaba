package com.hierarchy.app.Classes.Decorators;

import com.hierarchy.app.Classes.Model.Chocolate;

public class ChocolateDecorator extends Chocolate {
    protected Chocolate decoratedChocolate;

    public ChocolateDecorator(Chocolate decoratedChocolate) {
        super(
            decoratedChocolate.getIdProduct(),
            decoratedChocolate.getName(),
            decoratedChocolate.getPrice(),
            decoratedChocolate.getIdChocolate(),
            decoratedChocolate.getChocoName(),
            decoratedChocolate.getBrand()
        );

        this.decoratedChocolate = decoratedChocolate;
    }

    @Override
    public int getIdChocolate() {
        return super.getIdChocolate();
    }

    @Override
    public String getChocoName() {
        return super.getChocoName();
    }

    @Override
    public String getBrand() {
        return super.getBrand();
    }

    @Override
    public int getPrice() {
        return super.getPrice();
    }
}
