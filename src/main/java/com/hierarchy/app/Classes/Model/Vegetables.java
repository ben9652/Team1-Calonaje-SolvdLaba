package com.hierarchy.app.Classes.Model;

public class Vegetables {
    private int idVegetable;
    private String vegName;
    private String brand;
    private int idProduct;

    public Vegetables(int idVegetable, String vegName, String brand, int idProduct) {
        this.idVegetable = idVegetable;
        this.vegName = vegName;
        this.brand = brand;
        this.idProduct = idProduct;
    }

    public int getIdVegetable() {
        return idVegetable;
    }

    public void setIdVegetable(int idVegetable) {
        this.idVegetable = idVegetable;
    }

    public String getVegName() {
        return vegName;
    }

    public void setVegName(String vegName) {
        this.vegName = vegName;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getIdProduct() {
        return idProduct;
    }
    public String getName() { return vegName; }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }
    @Override
    public String toString() {
        return "Vegetable: id= " + idVegetable + ", name= " + vegName + ", brand= " + brand + ".";
    }
}
