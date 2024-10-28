package com.hierarchy.app.Classes.Model;

public class Vegetables extends Product{
    private int idVegetable;
    private String vegName;
    private String brand;

    public Vegetables(int idProduct,String name,int price,int idVegetable, String vegName, String brand) {
        super(idProduct, name, price);
        this.idVegetable = idVegetable;
        this.vegName = vegName;
        this.brand = brand;
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
    @Override
    public String getName() { return vegName; }

    @Override
    public String toString() {
        return "Vegetable: id= " + idVegetable + ", name= " + vegName + ", brand= " + brand + ".";
    }
}
