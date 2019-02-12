package ru.javajunior.juniorproject.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "ingredient")
public class Ingredient {
    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name= "increment", strategy= "increment")
    @Column(name = "id", length = 6, nullable = false)
    private int ingredientId;
    private String ingredientName;
    @Column(name = "energy", nullable = false)
    private double energy;
    @Column(name = "protein", nullable = false)
    private double protein;
    @Column(name = "fat", nullable = false)
    private double fat;
    @Column(name = "carbohydrates", nullable = false)
    private double carbohydrates;
    @Column(name = "sugar")
    private double sugar;
    @Column(name = "fatSaturated")
    private double fatSaturated;
    @Column(name = "fatPolyUnsaturated")
    private double fatPolyUnsaturated;
    @Column(name = "fatMonoUnsaturated")
    private double fatMonoUnsaturated;
    @Column(name = "glycemicIndex")
    private double glycemicIndex;
    @Column(name = "glycemicLoad")
    private double glycemicLoad;
    @ManyToMany(mappedBy = "ingredients",fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<Ration> rations;


    public int getIngredientId() {
        return ingredientId;
    }

    public void setIngredientId(int ingredientId) {
        this.ingredientId = ingredientId;
    }

    public String getIngredientName() {
        return ingredientName;
    }

    public void setIngredientName(String ingredientName) {
        this.ingredientName = ingredientName;
    }

    public double getEnergy() {
        return energy;
    }

    public void setEnergy(double energy) {
        this.energy = energy;
    }

    public double getProtein() {
        return protein;
    }

    public void setProtein(double protein) {
        this.protein = protein;
    }

    public double getFat() {
        return fat;
    }

    public void setFat(double fat) {
        this.fat = fat;
    }

    public double getCarbohydrates() {
        return carbohydrates;
    }

    public void setCarbohydrates(double carbohydrates) {
        this.carbohydrates = carbohydrates;
    }

    public double getSugar() {
        return sugar;
    }

    public void setSugar(double sugar) {
        this.sugar = sugar;
    }

    public double getFatSaturated() {
        return fatSaturated;
    }

    public void setFatSaturated(double fatSaturated) {
        this.fatSaturated = fatSaturated;
    }

    public double getFatPolyUnsaturated() {
        return fatPolyUnsaturated;
    }

    public void setFatPolyUnsaturated(double fatPolyUnsaturated) {
        this.fatPolyUnsaturated = fatPolyUnsaturated;
    }

    public double getFatMonoUnsaturated() {
        return fatMonoUnsaturated;
    }

    public void setFatMonoUnsaturated(double fatMonoUnsaturated) {
        this.fatMonoUnsaturated = fatMonoUnsaturated;
    }

    public double getGlycemicIndex() {
        return glycemicIndex;
    }

    public void setGlycemicIndex(double glycemicIndex) {
        this.glycemicIndex = glycemicIndex;
    }

    public double getGlycemicLoad() {
        return glycemicLoad;
    }

    public void setGlycemicLoad(double glycemicLoad) {
        this.glycemicLoad = glycemicLoad;
    }

    @Override
    public String toString() {
        return "Ingredient{" +
                "id=" + ingredientId +
                ", ingredientName='" + ingredientName + '\'' +
                ", energy=" + energy +
                ", protein=" + protein +
                ", fat=" + fat +
                ", carbohydrates=" + carbohydrates +
                ", sugar=" + sugar +
                ", fatSaturated=" + fatSaturated +
                ", fatPolyUnsaturated=" + fatPolyUnsaturated +
                ", fatMonoUnsaturated=" + fatMonoUnsaturated +
                ", glycemicIndex=" + glycemicIndex +
                ", glycemicLoad=" + glycemicLoad +
                '}';
    }
}