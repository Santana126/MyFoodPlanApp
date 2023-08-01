package com.example.myfoodplanapp.controller.graphicontroller.cli;

import com.example.myfoodplanapp.exception.CommandNotFoundException;
import com.example.myfoodplanapp.utils.Printer;
import com.example.myfoodplanapp.view.cli.CLIWelcomePageView;

public class CLIWelcomePageController {


    private CLIWelcomePageView cliWelcomePageView;

    public void start() {
        this.cliWelcomePageView = new CLIWelcomePageView(this);
        this.cliWelcomePageView.run();
    }


    public void runCommand(String choice) throws CommandNotFoundException {
        switch (choice) {
            case "1" -> {
                Printer.printMessage("Login Pressed");
            }
            case "2" -> {
                Printer.printMessage("Signup Pressed");
            }
            case "3" -> {
                Printer.printMessage("Guest Pressed");
            }
            default -> throw new CommandNotFoundException("1) 2) 3)");
        }
    }

}
