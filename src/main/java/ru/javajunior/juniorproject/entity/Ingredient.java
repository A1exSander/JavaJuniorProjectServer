package ru.javajunior.juniorproject.entity;

// TODO: Занесение в базу данных ингредиентов

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "ingredient")
public class Ingredient {
    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name= "increment", strategy= "increment")
    @Column(name = "id", length = 6, nullable = false)
    private int id;
    @Column(name = "energy", nullable = false)
    private final double energy;
    @Column(name = "protein", nullable = false)
    private final double protein;
    @Column(name = "fat", nullable = false)
    private final double fat;
    @Column(name = "carbohydrates", nullable = false)
    private final double carbohydrates;
    @Column(name = "sugar")
    private final double sugar;
    @Column(name = "fatSaturated")
    private final double fatSaturated;
    @Column(name = "fatPolyUnsaturated")
    private final double fatPolyUnsaturated;
    @Column(name = "fatMonoUnsaturated")
    private final double fatMonoUnsaturated;
    @Column(name = "glycemicIndex")
    private final double glycemicIndex;

    public Ingredient(IngredientBuilder builder){
        this.energy = builder.energy;
        this.protein = builder.protein;
        this.fat = builder.fat;
        this.carbohydrates = builder.carbohydrates;
        this.sugar = builder.sugar;
        this.fatSaturated = builder.fatSaturated;
        this.fatPolyUnsaturated = builder.fatPolyUnsaturated;
        this.fatMonoUnsaturated = builder.fatMonoUnsaturated;
        this.glycemicIndex = builder.glycemicIndex;
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

    public static class IngredientBuilder {
        private final double energy;
        private final double protein;
        private final double fat;
        private final double carbohydrates;
        private double sugar = 0;
        private double fatSaturated = 0;
        private double fatPolyUnsaturated = 0;
        private double fatMonoUnsaturated = 0;
        private double glycemicIndex = 0;

        public IngredientBuilder(double energy, double protein, double fat, double carbohydrates) {
            this.energy = energy;
            this.protein = protein;
            this.fat = fat;
            this.carbohydrates = carbohydrates;
        }


        public void setSugar(double sugar) {
            this.sugar = sugar;
        }

        public void setFatSaturated(double fatSaturated) {
            this.fatSaturated = fatSaturated;
        }
        public void setFatPolyUnsaturated(double fatPolyUnsaturated) {
            this.fatPolyUnsaturated = fatPolyUnsaturated;
        }

        public void setFatMonoUnsaturated(double fatMonoUnsaturated) {
            this.fatMonoUnsaturated = fatMonoUnsaturated;
        }


        public void setGlycemicIndex(double glycemicIndex) {
            this.glycemicIndex = glycemicIndex;
        }

        public Ingredient build(){
            return new Ingredient(this);
        }

    }
}