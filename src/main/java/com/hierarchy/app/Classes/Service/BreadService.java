package com.hierarchy.app.Classes.Service;

import com.hierarchy.app.Classes.DAO.BreadDAO;
import com.hierarchy.app.Classes.Model.Bread;

import java.util.List;

public class BreadService {
    private final BreadDAO breadDAO;

    public BreadService(BreadDAO breadDAO) {
        this.breadDAO = breadDAO;
    }

    public Bread findBreadById(int id) {
        return breadDAO.findById(id);
    }

    public List<Bread> getAllBread() {
        return breadDAO.getAll();
    }

    public void addBread(Bread bread) {
        breadDAO.insert(bread);
    }

    public void updateBread(Bread bread) {
        breadDAO.update(bread);
    }

    public void deleteBread(int id) {
        breadDAO.delete(id);
    }
}