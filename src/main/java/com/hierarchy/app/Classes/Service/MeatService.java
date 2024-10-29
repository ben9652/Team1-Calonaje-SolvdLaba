package com.hierarchy.app.Classes.Service;

import com.hierarchy.app.Classes.DAO.MeatDAO;
import com.hierarchy.app.Classes.DAO.ProductDAO;
import com.hierarchy.app.Classes.Model.Meat;
import com.hierarchy.app.Classes.Model.Product;

import java.util.List;

public class MeatService {

    private final MeatDAO meatDAO;


    public MeatService(MeatDAO meatDAO) {
        this.meatDAO = meatDAO;
    }

    public Product getMeatById(int id){return meatDAO.findById(id);}

    public List<Meat> getAllMeats(){return meatDAO.getAll();}

    public void addMeat(Meat meat){meatDAO.insert(meat);}

    public void updateMeat(Meat meat){meatDAO.update(meat);}

    public void deleteMeat(int id){meatDAO.delete(id);}
}
