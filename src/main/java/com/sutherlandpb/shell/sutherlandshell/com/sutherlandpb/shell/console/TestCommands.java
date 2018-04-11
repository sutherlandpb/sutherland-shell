package com.sutherlandpb.shell.sutherlandshell.com.sutherlandpb.shell.console;

import com.sutherlandpb.shell.sutherlandshell.com.sutherlandpb.shell.service.AIExperimentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

@ShellComponent
@SuppressWarnings("unused")
public class TestCommands {

    @Autowired
    private AIExperimentService aiExperimentService;

    @ShellMethod("This returns a test string.")
    public String doTest() {

        return "this totally did a test";
    }

    @ShellMethod("Run AI Experiment service")
    public String doAi() {
        aiExperimentService.runHello();
        return "tried it";
    }

}
