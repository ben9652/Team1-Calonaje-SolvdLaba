package com.hierarchy.app.Classes.Facade;

import org.apache.ibatis.session.SqlSessionFactory;

import com.hierarchy.app.Classes.DAO.ChocolateDAO;
import com.hierarchy.app.Classes.Listeners.ChocolateListener;
import com.hierarchy.app.Classes.Model.Chocolate;
import com.hierarchy.app.Classes.Service.ChocolateService;

public class ChocolateFacade {
    private final ChocolateService chocolateService;
    private final ChocolateListener eventListener;

    public ChocolateFacade(SqlSessionFactory sqlSessionFactory) {
        chocolateService = new ChocolateService(new ChocolateDAO(sqlSessionFactory));
        eventListener = new ChocolateListener();

        // Registro el listener en el mapper
        chocolateService.addListener(eventListener);
    }

    public Chocolate getChocolateById(int id) {
        return chocolateService.getChocolateById(id);
    }
    
    public void addChocolate(Chocolate chocolate) {
        chocolateService.addChocolate(chocolate);
    }

    public void updateChocolate(Chocolate chocolate) {
        chocolateService.updateChocolate(chocolate);
    }

    public void removeChocolate(Chocolate chocolate) {
        chocolateService.deleteChocolate(chocolate.getIdChocolate());
    }
}
