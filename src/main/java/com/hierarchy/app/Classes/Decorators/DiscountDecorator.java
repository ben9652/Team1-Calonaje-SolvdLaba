package com.hierarchy.app.Classes.Decorators;

import com.hierarchy.app.Classes.Model.Chocolate;

public class DiscountDecorator extends ChocolateDecorator {
    private double discountRate;

    public DiscountDecorator(Chocolate decoratedChocolate, double discountRate) {
        super(decoratedChocolate);
        this.discountRate = discountRate;
    }

    @Override
    public int getPrice() {
        int originalPrice = decoratedChocolate.getPrice();
        return (int) (originalPrice * (1 - discountRate));
    }

    @Override
    public String toString() {
        return decoratedChocolate.toString() + "\n(Discount applied: " + (int)(discountRate * 100) + "%)";
    }
}
