package com.example.myfoodplanapp.view.cli;

import com.example.myfoodplanapp.controller.graphicontroller.cli.CLIWelcomePageController;
import com.example.myfoodplanapp.exception.CommandNotFoundException;
import com.example.myfoodplanapp.utils.Printer;
import com.example.myfoodplanapp.utils.ShowException;

import java.util.Scanner;

public class CLIWelcomePageView {

    private final CLIWelcomePageController cliWelcomePageControllerCurrent;

    public CLIWelcomePageView(CLIWelcomePageController cliWelcomePageController){
        this.cliWelcomePageControllerCurrent = cliWelcomePageController;
    }

    public void run(){
        Printer.printSeparator();
        Printer.printMessage("------------------------------------------WELCOME-------------------------------------------");
        Printer.printSeparator();
        Printer.printMessage("Choose an option:\n");
        Printer.printMessage("\n1) Log in   \n2) Sign up   \n3) Guest\n");

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        try{
            this.cliWelcomePageControllerCurrent.runCommand(input);
        }catch (CommandNotFoundException e){
            ShowException.showExceptionCLI(e.getMessage());
            run();
        }





    }



}
