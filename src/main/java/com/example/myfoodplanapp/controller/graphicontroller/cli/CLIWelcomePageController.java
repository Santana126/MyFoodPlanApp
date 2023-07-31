package com.example.myfoodplanapp.controller.graphicontroller.cli;

import com.example.myfoodplanapp.view.cli.CLIWelcomePageView;

public class CLIWelcomePageController {


    private CLIWelcomePageView cliWelcomePageView;

    public void start() {
        this.cliWelcomePageView = new CLIWelcomePageView(this);
        this.cliWelcomePageView.run();
    }


}
