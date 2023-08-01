package com.example.myfoodplanapp.utils;

import java.util.Scanner;

public class ScannerSupporter {

    private ScannerSupporter() {
        //Costruttore privato poiché tutti i metodi sono statici
    }

    public static void waitForEnter() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        while (!input.equals("")) {
            input = scanner.nextLine();
        }
    }
}
