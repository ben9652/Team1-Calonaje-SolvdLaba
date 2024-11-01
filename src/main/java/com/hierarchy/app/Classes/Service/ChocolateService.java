package com.hierarchy.app.Classes.Service;

import java.util.List;
import java.util.ArrayList;

import com.hierarchy.app.Classes.DAO.ChocolateDAO;
import com.hierarchy.app.Classes.Listeners.ChocolateListener;
import com.hierarchy.app.Classes.Model.Chocolate;

public class ChocolateService {
    private final ChocolateDAO chocolateDAO;
    private List<ChocolateListener> listeners = new ArrayList<>();

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
        notifyChocolateAdded(chocolate);
    }

    public void updateChocolate(Chocolate chocolate) {
        chocolateDAO.update(chocolate);
        notifyChocolateUpdated(chocolate);
    }

    public void deleteChocolate(int id) {
        Chocolate chocolateToDelete = getChocolateById(id);
        chocolateDAO.delete(id);
        notifyChocolateRemoved(chocolateToDelete);
    }

    public void addListener(ChocolateListener listener) {
        listeners.add(listener);
    }

    public void removeListener(ChocolateListener listener) {
        listeners.remove(listener);
    }

    private void notifyChocolateAdded(Chocolate chocolate) {
        for(ChocolateListener listener : listeners) {
            listener.onChocolateAdded(chocolate);
        }
    }

    private void notifyChocolateUpdated(Chocolate chocolate) {
        for(ChocolateListener listener : listeners) {
            listener.onChocolateUpdated(chocolate);
        }
    }

    private void notifyChocolateRemoved(Chocolate chocolate) {
        for(ChocolateListener listener : listeners) {
            listener.onChocolateRemoved(chocolate);
        }
    }
}
