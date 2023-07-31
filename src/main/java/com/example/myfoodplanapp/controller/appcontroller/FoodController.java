package com.example.myfoodplanapp.controller.appcontroller;

import com.example.myfoodplanapp.model.Food;
import com.example.myfoodplanapp.model.FoodDatabase;

public class FoodController {
    private FoodDatabase foodDatabase;

    public FoodController() {
        this.foodDatabase = new FoodDatabase();
    }

    // Metodo per ottenere le informazioni di un cibo
    public Food getFoodInfo(String foodName) {
        // Chiedi al FoodDatabase di ottenere le informazioni del cibo
        Food foodInfo = foodDatabase.getFoodInfo(foodName);

        // Gestisci il caso in cui il cibo non sia disponibile
        if (foodInfo == null) {
            // Notifica l'utente che il cibo non è stato trovato
            // Al momento restituiamo null
            return null;
        }

        // Restituisci le informazioni del cibo ottenute
        return foodInfo;
    }
}
