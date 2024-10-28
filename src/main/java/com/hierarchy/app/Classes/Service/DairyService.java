package com.hierarchy.app.Classes.Service;

import java.util.List;

import com.hierarchy.app.Classes.DAO.DairyDAO;
import com.hierarchy.app.Classes.Model.Dairy;

public class DairyService {
    private final DairyDAO chocolateDAO;

    public DairyService(DairyDAO chocolateDAO) {
        this.chocolateDAO = chocolateDAO;
    }

    public Dairy getDairyById(int id) {
        return chocolateDAO.findById(id);
    }

    public List<Dairy> getAllDairy() {
        return chocolateDAO.getAll();
    }

    public void addDairy(Dairy chocolate) {
        chocolateDAO.insert(chocolate);
    }

    public void updateDairy(Dairy chocolate) {
        chocolateDAO.update(chocolate);
    }

    public void deleteDairy(int id) {
        chocolateDAO.delete(id);
    }
}
