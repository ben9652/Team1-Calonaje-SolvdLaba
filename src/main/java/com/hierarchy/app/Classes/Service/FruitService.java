package com.hierarchy.app.Classes.Service;

import com.hierarchy.app.Classes.DAO.FruitDAO;
import com.hierarchy.app.Classes.Model.Fruit;

import java.util.List;

public class FruitService {

    private final FruitDAO fruitDAO;

    public FruitService(FruitDAO fruitDAO) {
        this.fruitDAO = fruitDAO;
    }

    /**
     * Retrieves a Fruit by its ID.
     *
     * @param id the ID of the fruit
     * @return the Fruit object if found, or null otherwise
     */
    public Fruit getFruitById(int id) {
        return fruitDAO.findById(id);
    }

    /**
     * Retrieves all fruits.
     *
     * @return a list of all Fruit objects
     */
    public List<Fruit> getAllFruits() {
        return fruitDAO.getAll();
    }

    /**
     * Adds a new fruit.
     *
     * @param fruit the Fruit object to add
     */
    public void addFruit(Fruit fruit) {
        fruitDAO.insert(fruit);
    }

    /**
     * Updates an existing fruit.
     *
     * @param fruit the Fruit object with updated information
     */
    public void updateFruit(Fruit fruit) {
        fruitDAO.update(fruit);
    }

    /**
     * Deletes a fruit by its ID.
     *
     * @param id the ID of the fruit to delete
     */
    public void deleteFruit(int id) {
        fruitDAO.delete(id);
    }
}