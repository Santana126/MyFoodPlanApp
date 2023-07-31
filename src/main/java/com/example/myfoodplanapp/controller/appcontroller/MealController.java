package com.example.myfoodplanapp.controller.appcontroller;

import com.example.myfoodplanapp.model.Food;
import com.example.myfoodplanapp.model.Meal;

import java.util.List;

public class MealController {
    private Meal currentMeal; // Il pasto corrente che sta venendo registrato
    private DatabaseManager databaseManager; // Riferimento al DatabaseManager per la memorizzazione dei pasti

    public MealController(DatabaseManager databaseManager) {
        this.currentMeal = new Meal();
        this.databaseManager = databaseManager;
    }

    // Metodo per registrare un pasto
    public void registerMeal(List<Food> foods, String mealType) {
        // Aggiungi i cibi al pasto corrente
        currentMeal.setFoods(foods);
        // Imposta il tipo di pasto
        currentMeal.setMealType(mealType);

        // Calcola i macronutrienti totali del pasto
        calculateTotalMacronutrients();

        // Salva il pasto nel database utilizzando il DatabaseManager
        databaseManager.saveMeal(currentMeal);
    }

    // Metodo per calcolare i macronutrienti totali del pasto
    private void calculateTotalMacronutrients() {
        int totalCalories = 0;
        int totalProteins = 0;
        int totalCarbs = 0;
        int totalFats = 0;

        for (Food food : currentMeal.getFoods()) {
            totalCalories += food.getCalories();
            totalProteins += food.getProteins();
            totalCarbs += food.getCarbs();
            totalFats += food.getFats();
        }

        currentMeal.setTotalCalories(totalCalories);
        currentMeal.setTotalProteins(totalProteins);
        currentMeal.setTotalCarbs(totalCarbs);
        currentMeal.setTotalFats(totalFats);
    }

    // Metodo per ottenere il pasto corrente
    public Meal getCurrentMeal() {
        return currentMeal;
    }
}
