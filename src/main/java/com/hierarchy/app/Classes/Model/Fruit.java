package com.hierarchy.app.Classes.Model;

public class Fruit extends Product{
    private int idFruit;
    private String fruitName;
    private String brand;


    public Fruit(int idProduct, String name, int price, int idFruit, String fruitName, String brand) {
        super(idProduct, name, price);
        this.idFruit = idFruit;
        this.fruitName = fruitName;
        this.brand = brand;
    }

    public int getIdFruit() {
        return idFruit;
    }

    public String getFruitName() {
        return fruitName;
    }

    public String getBrand() {
        return brand;
    }

    public void setFruitName(String fruitName) {
        this.fruitName = fruitName;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setIdFruit(int idFruit) {
        this.idFruit = idFruit;
    }

    @Override
    public String toString() {
        return "Fruit: id= " + idFruit + ", name= " + fruitName + ", brand= " + brand + ".";
    }
}
