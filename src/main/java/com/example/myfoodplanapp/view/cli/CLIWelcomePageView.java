package com.example.myfoodplanapp.view.cli;

import com.example.myfoodplanapp.controller.graphicontroller.cli.CLIWelcomePageController;
import com.example.myfoodplanapp.utils.Printer;

public class CLIWelcomePageView {

    private final CLIWelcomePageController cliWelcomePageControllerCurrent;

    public CLIWelcomePageView(CLIWelcomePageController cliWelcomePageController){
        this.cliWelcomePageControllerCurrent = cliWelcomePageController;
    }

    public void run(){
        Printer.printSeparator();
        Printer.printMessage("------------------------------------------WELCOME-------------------------------------------");
        Printer.printSeparator();

    }



}
