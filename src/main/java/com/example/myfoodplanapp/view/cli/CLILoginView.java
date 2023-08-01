package com.example.myfoodplanapp.view.cli;

import com.example.myfoodplanapp.controller.graphicontroller.cli.CLILoginController;
import com.example.myfoodplanapp.utils.Printer;

public class CLILoginView {

    private final CLILoginController cliLoginControllerCurrent;

    public CLILoginView(CLILoginController cliLoginControllerCurrent) {
        this.cliLoginControllerCurrent = cliLoginControllerCurrent;
    }

    public void run(){
        Printer.printMessage("----------------LOGIN PAGE-----------------");
        Printer.printMessage("-------------choose an option--------------");
        Printer.printMessage("\n1)Login with email\n2)Login with Google\n3)Login with Apple\n4)Forgot credentials\n5)Continue as a Guest\n");

    }


}
