package com.example.myfoodplanapp.utils;

public class Printer {
    //Stampa messaggi sulla CLI

    private Printer(){
        //Costruttore privato poiché tutti i metodi sono privati
    }

    public static void printMessage(String message) {
        System.out.println(message);
    }

    public static void printSeparator() {
        System.out.println("\n--------------------------------------------------------------------------------------------\n");
    }
}
