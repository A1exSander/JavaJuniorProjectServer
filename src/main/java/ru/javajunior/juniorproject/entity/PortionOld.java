package ru.javajunior.juniorproject.entity;

public class PortionOld {
    private Ingredient ingredient;
    private double energy;
    private double protein;
    private double fat;
    private double carbohydrates;
    private double sugar;
    private double fatSaturated;
    private double fatPolyUnsaturated;
    private double fatMonoUnsaturated;
    private double glycemicIndex;
    private double mass;
    private double gl;

    public PortionOld(Ingredient ingredient, double mass) {
        this.ingredient = ingredient;
        this.mass = mass;
        this.energy = ingredient.getEnergy()/100*mass;
        this.protein = ingredient.getProtein()/100*mass;
        this.fat = ingredient.getFat()/100*mass;
        this.carbohydrates = ingredient.getCarbohydrates()/100*mass;
        this.sugar = ingredient.getSugar()/100*mass;
        this.fatSaturated = ingredient.getFatSaturated()/100*mass;
        this.fatMonoUnsaturated = ingredient.getFatMonoUnsaturated()/100*mass;
        this.fatPolyUnsaturated = ingredient.getFatPolyUnsaturated()/100*mass;
        this.glycemicIndex = ingredient.getGlycemicIndex()/100*mass;
        this.gl = ingredient.getCarbohydrates()/mass*ingredient.getGlycemicIndex();
    }

    public Ingredient getIngredient() {
        return ingredient;
    }

    public double getEnergy() {
        return energy;
    }

    public double getProtein() {
        return protein;
    }

    public double getFat() {
        return fat;
    }

    public double getCarbohydrates() {
        return carbohydrates;
    }

    public double getSugar() {
        return sugar;
    }

    public double getFatSaturated() {
        return fatSaturated;
    }

    public double getFatPolyUnsaturated() {
        return fatPolyUnsaturated;
    }

    public double getFatMonoUnsaturated() {
        return fatMonoUnsaturated;
    }

    public double getGlycemicIndex() {
        return glycemicIndex;
    }

    public double getMass() {
        return mass;
    }

    public double getGl() {
        return gl;
    }
}
