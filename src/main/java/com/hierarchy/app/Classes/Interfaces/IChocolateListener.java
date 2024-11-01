package com.hierarchy.app.Classes.Interfaces;

import com.hierarchy.app.Classes.Model.Chocolate;

public interface IChocolateListener {
    void onChocolateAdded(Chocolate chocolate);
    void onChocolateUpdated(Chocolate chocolate);
    void onChocolateRemoved(Chocolate chocolate);
}
