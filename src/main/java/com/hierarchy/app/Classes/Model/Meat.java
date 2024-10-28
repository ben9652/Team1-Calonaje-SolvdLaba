package com.hierarchy.app.Classes.Model;

public class Meat extends Product{
    private int idMeat;
    private String cut;
    private String brand;


    public Meat(int idProduct,String name,int price,int idMeat, String cut, String brand) {
        super(idProduct, name, price);
        this.idMeat = idMeat;
        this.cut = cut;
        this.brand = brand;

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

    @Override
    public String getName() { return cut; }

    @Override
    public String toString() {
        return "Meat: id= " + idMeat + ", cut= " + cut + ", brand= " + brand + ".";
    }
}
