package com.example.myfoodplanapp.applicationController;

import com.example.myfoodplanapp.model.Food;
import com.example.myfoodplanapp.model.Meal;

import java.util.List;

public class MealController {
    private Meal currentMeal;

    public MealController() {
        this.currentMeal = new Meal();
    }

    // Metodo per registrare un pasto
    public void registerMeal(List<Food> foods, String mealType) {
        // Codice per aggiungere i cibi al pasto corrente e calcolare i macronutrienti totali
        // Potresti anche invocare il DatabaseManager per salvare il pasto nel database
    }

    // Metodo per ottenere il pasto corrente
    public Meal getCurrentMeal() {
        return currentMeal;
    }
}
