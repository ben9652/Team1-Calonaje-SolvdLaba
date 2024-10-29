package com.hierarchy.app.Classes.Service;



import com.hierarchy.app.Classes.DAO.VegetableDAO;
import com.hierarchy.app.Classes.Model.Vegetables;

import java.util.List;

public class VegetableService {
    private final VegetableDAO vegetableDAO;


    public VegetableService(VegetableDAO vegetableDAO) {
        this.vegetableDAO = vegetableDAO;
    }
    public Vegetables getVegetableById(int id){return vegetableDAO.findById(id);}

    public List<Vegetables> getAllVegetables(){return vegetableDAO.getAll();}

    public void addVegetable(Vegetables vegetable){vegetableDAO.insert(vegetable);}

    public void updateVegetable(Vegetables vegetable){vegetableDAO.update(vegetable);}

    public void deleteVegetable(int id){vegetableDAO.delete(id);}
}
