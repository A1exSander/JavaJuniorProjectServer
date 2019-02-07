package ru.javajunior.juniorproject.entity;

import java.util.ArrayList;
import java.util.List;

public class Meal {
    private List<Portion> mealList = new ArrayList<>(10);
    private Portion portion;

    public void addIngredient(Portion portion){
        mealList.add(portion);
    }

    public void deleteIngredient(Portion portion){
        mealList.remove(portion);
    }

    public List<Portion> getMealList() {
        return mealList;
    }
}
