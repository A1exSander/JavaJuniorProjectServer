package ru.javajunior.juniorproject.entity;

import java.util.ArrayList;
import java.util.List;

public class Meal {
    private List<Ingredient> mealList = new ArrayList<>(10);
    private Ingredient finalIngredient;

    public void addIngredient(Ingredient ingredient, int mass){
        mealList.add(finalIngredient);
    }

    public void deleteIngredient(Ingredient ingredient){
        mealList.remove(ingredient);
    }

    public List<Ingredient> getMealList() {
        return mealList;
    }


}
