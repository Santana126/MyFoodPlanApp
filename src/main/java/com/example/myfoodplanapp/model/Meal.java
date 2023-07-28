package com.example.myfoodplanapp.model;

import java.util.ArrayList;
import java.util.List;

public class Meal {
    private List<Food> foods; // Elenco dei cibi consumati durante il pasto
    private String mealType; // Tipo di pasto (colazione, pranzo, cena, ecc.)
    private int totalCalories; // Calorie totali del pasto
    private int totalProteins; // Proteine totali del pasto
    private int totalCarbs; // Carboidrati totali del pasto
    private int totalFats; // Grassi totali del pasto

    // Costruttore della classe Meal
    public Meal() {
        this.foods = new ArrayList<>();
        this.mealType = "";
        this.totalCalories = 0;
        this.totalProteins = 0;
        this.totalCarbs = 0;
        this.totalFats = 0;
    }

    // Metodi getter e setter per i campi della classe Meal
    public List<Food> getFoods() {
        return foods;
    }

    public void setFoods(List<Food> foods) {
        this.foods = foods;
    }

    public String getMealType() {
        return mealType;
    }

    public void setMealType(String mealType) {
        this.mealType = mealType;
    }

    public int getTotalCalories() {
        return totalCalories;
    }

    public void setTotalCalories(int totalCalories) {
        this.totalCalories = totalCalories;
    }

    public int getTotalProteins() {
        return totalProteins;
    }

    public void setTotalProteins(int totalProteins) {
        this.totalProteins = totalProteins;
    }

    public int getTotalCarbs() {
        return totalCarbs;
    }

    public void setTotalCarbs(int totalCarbs) {
        this.totalCarbs = totalCarbs;
    }

    public int getTotalFats() {
        return totalFats;
    }

    public void setTotalFats(int totalFats) {
        this.totalFats = totalFats;
    }
}
