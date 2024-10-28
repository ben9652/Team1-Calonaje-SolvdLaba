package com.hierarchy.app.Classes.Model;

public class Dairy extends Product {
    private int idDairy;
    private String dairyName;
    private String Brand;

    public Dairy(int idDairy, String dairyName, String brand) {
        this.idDairy = idDairy;
        this.dairyName = dairyName;
        Brand = brand;
    }

    public Dairy(int idProduct, String name, int price, int idDairy, String dairyName, String brand) {
        super(idProduct, name, price);
        this.idDairy = idDairy;
        this.dairyName = dairyName;
        Brand = brand;
    }
    
    public int getIdDairy() {
        return idDairy;
    }
    public void setIdDairy(int idDairy) {
        this.idDairy = idDairy;
    }
    
    public String getDairyName() {
        return dairyName;
    }
    public void setDairyName(String dairyName) {
        this.dairyName = dairyName;
    }
    
    public String getBrand() {
        return Brand;
    }
    public void setBrand(String brand) {
        Brand = brand;
    }

    @Override
    public String getName() { return dairyName; }

    @Override
    public String toString() {
        return "Dairy: id= " + idDairy + ", name= " + dairyName + ", brand= " + Brand + ".";
    }
}
