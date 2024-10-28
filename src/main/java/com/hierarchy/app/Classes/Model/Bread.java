package com.hierarchy.app.Classes.Model;

public class Bread extends Product {
    private int idBread;
    private String Name;
    private String brand;

    public Bread(int idProduct, String name, int price, int idBread, String Name, String brand) {
        super(idProduct, name, price);
        this.idBread = idBread;
        this.Name = Name;
        this.brand = brand;

    }

    public int getIdBread() {
        return idBread;
    }

    public String getBreadName() {
        return Name;
    }

    public String getBrand() {
        return brand;
    }


    public void setIdBread(int idBread) {
        this.idBread = idBread;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setBreadName(String breadName) {
        this.Name = breadName;
    }
}