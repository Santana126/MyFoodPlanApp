package com.example.myfoodplanapp.viewController;

import com.example.myfoodplanapp.applicationController.DatabaseManager;
import com.example.myfoodplanapp.applicationController.FoodController;
import com.example.myfoodplanapp.applicationController.MealController;
import com.example.myfoodplanapp.model.Food;
import com.example.myfoodplanapp.view.UserInterface;

public class UIController {
    private UserInterface userInterface;
    private MealController mealController;
    private FoodController foodController;

    public UIController(DatabaseManager databaseManager) {
        this.userInterface = new UserInterface();
        this.mealController = new MealController(databaseManager);
        this.foodController = new FoodController();
    }

    // Metodo per avviare l'applicazione e mostrare la schermata principale
    public void startApp() {
        // Codice per avviare l'applicazione e mostrare la schermata principale utilizzando JavaFX
        // Qui potresti, ad esempio, mostrare un elenco di opzioni all'utente come "Registra Pasto" o "Pianifica Pasto Futuro"
    }

    // Metodo per gestire la registrazione di un pasto
    public void handleMealRegistration() {
        // Codice per interagire con la UserInterface per ottenere i dettagli del pasto dall'utente
        // Richiama il MealController per registrare il pasto
    }

    // Metodo per gestire la pianificazione di un pasto futuro
    public void handleMealPlanning() {
        // Codice per interagire con la UserInterface per ottenere i dettagli del pasto futuro dall'utente
        // Richiama il MealController per pianificare il pasto futuro
    }

    // Metodo per gestire la richiesta di informazioni di un cibo
    public void handleFoodInfoRequest(String foodName) {
        // Richiama il FoodController per ottenere le informazioni del cibo richiesto
        Food food = foodController.getFoodInfo(foodName);
        // Mostra le informazioni del cibo all'utente tramite la UserInterface
        userInterface.showFoodInfo(food);
    }
}
