package com.example.myfoodplanapp.utils;

import java.util.Scanner;

public class ShowException {

    private ShowException(){
        //Costruttore privato poiché tutti metodi sono statici
    }


    public static void showExceptionCLI(String msg){
        Printer.printMessage("\n\nERROR:\n" + msg + "\nPress ENTRER to continue\n");
        ScannerSupporter.waitForEnter();
    }


}
