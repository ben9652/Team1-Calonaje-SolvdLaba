package com.hierarchy.app.Classes.Model;

public class Chocolate extends Product {
    private int idChocolate;
    private String chocoName;
    private String Brand;

    public Chocolate(int idChocolate, String chocoName, String brand) {
        this.idChocolate = idChocolate;
        this.chocoName = chocoName;
        Brand = brand;
    }

    public Chocolate(int idProduct, String name, int price, int idChocolate, String chocoName, String brand) {
        super(idProduct, name, price);
        this.idChocolate = idChocolate;
        this.chocoName = chocoName;
        Brand = brand;
    }
    
    public int getIdChocolate() {
        return idChocolate;
    }
    public void setIdChocolate(int idChocolate) {
        this.idChocolate = idChocolate;
    }
    
    public String getChocoName() {
        return chocoName;
    }
    public void setChocoName(String chocoName) {
        this.chocoName = chocoName;
    }
    
    public String getBrand() {
        return Brand;
    }
    public void setBrand(String brand) {
        Brand = brand;
    }

    @Override
    public String getName() { return chocoName; }

    @Override
    public String toString() {
        return "Chocolate: id= " + idChocolate + ", name= " + chocoName + ", brand= " + Brand + ".";
    }
}
