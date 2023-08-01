package com.example.myfoodplanapp.controller.graphicontroller.cli;

import com.example.myfoodplanapp.view.cli.CLILoginView;

public class CLILoginController implements CLIGraphicController {

    private CLILoginView cliLoginView;

    @Override
    public void start(){
        this.cliLoginView = new CLILoginView(this);
    }
}
