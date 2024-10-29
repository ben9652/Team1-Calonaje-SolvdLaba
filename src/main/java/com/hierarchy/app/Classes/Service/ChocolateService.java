package com.hierarchy.app.Classes.Service;

import java.util.List;

import com.hierarchy.app.Classes.DAO.ChocolateDAO;
import com.hierarchy.app.Classes.Model.Chocolate;

public class ChocolateService {
    private final ChocolateDAO chocolateDAO;

    public ChocolateService(ChocolateDAO chocolateDAO) {
        this.chocolateDAO = chocolateDAO;
    }

    public Chocolate getChocolateById(int id) {
        return chocolateDAO.findById(id);
    }

    public List<Chocolate> getAllChocolates() {
        return chocolateDAO.getAll();
    }

    public void addChocolate(Chocolate chocolate) {
        chocolateDAO.insert(chocolate);
    }

    public void updateChocolate(Chocolate chocolate) {
        chocolateDAO.update(chocolate);
    }

    public void deleteChocolate(int id) {
        chocolateDAO.delete(id);
    }
}
