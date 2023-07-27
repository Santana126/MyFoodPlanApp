package com.example.myfoodplanapp.applicationController;

import com.example.myfoodplanapp.model.Food;
import com.example.myfoodplanapp.model.FoodDatabase;

public class FoodController {
    private FoodDatabase foodDatabase;

    public FoodController() {
        this.foodDatabase = new FoodDatabase();
    }

    // Metodo per ottenere le informazioni di un cibo dall'API
    public Food getFoodInfo(String foodName) {
        return foodDatabase.getFoodInfo(foodName);
    }
}
