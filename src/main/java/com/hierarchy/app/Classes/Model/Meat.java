package com.hierarchy.app.Classes.Model;

public class Meat {
    private int idMeat;
    private String cut;
    private String brand;
    private int idProduct;

    public Meat(int idMeat, String cut, String brand, int idProduct) {
        this.idMeat = idMeat;
        this.cut = cut;
        this.brand = brand;
        this.idProduct = idProduct;
    }

    public int getIdMeat() {
        return idMeat;
    }

    public void setIdMeat(int idMeat) {
        this.idMeat = idMeat;
    }

    public String getCut() {
        return cut;
    }

    public void setCut(String cut) {
        this.cut = cut;
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

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }
    public String getName() { return cut; }

    @Override
    public String toString() {
        return "Meat: id= " + idMeat + ", cut= " + cut + ", brand= " + brand + ".";
    }
}
