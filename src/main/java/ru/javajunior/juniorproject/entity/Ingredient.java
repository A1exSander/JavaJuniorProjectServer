package ru.javajunior.juniorproject.entity;

public class Ingredient {
    private final int energy;
    private final int protein;
    private final int fat;
    private final int carbohydrates;
    private final int sugar;
    private final int fatSaturated;
    private final int fatPolyUnsaturated;
    private final int fatMonoUnsaturated;
    private final int glycemicIndex;

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



    public static class IngredientBuilder {
        private final int energy;
        private final int protein;
        private final int fat;
        private final int carbohydrates;
        private int sugar = 0;
        private int fatSaturated = 0;
        private int fatPolyUnsaturated = 0;
        private int fatMonoUnsaturated = 0;
        private int glycemicIndex = 0;

        public IngredientBuilder(int energy, int protein, int fat, int carbohydrates) {
            this.energy = energy;
            this.protein = protein;
            this.fat = fat;
            this.carbohydrates = carbohydrates;
        }


        public void setSugar(int sugar) {
            this.sugar = sugar;
        }

        public void setFatSaturated(int fatSaturated) {
            this.fatSaturated = fatSaturated;
        }
        public void setFatPolyUnsaturated(int fatPolyUnsaturated) {
            this.fatPolyUnsaturated = fatPolyUnsaturated;
        }

        public void setFatMonoUnsaturated(int fatMonoUnsaturated) {
            this.fatMonoUnsaturated = fatMonoUnsaturated;
        }


        public void setGlycemicIndex(int glycemicIndex) {
            this.glycemicIndex = glycemicIndex;
        }

        public Ingredient build(){
            return new Ingredient(this);
        }

    }
}