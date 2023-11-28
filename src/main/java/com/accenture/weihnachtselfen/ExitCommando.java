package com.accenture.weihnachtselfen;

public class ExitCommando extends AbstractCommando implements Commando {

    @Override
    public boolean execute() { // private zu public
        System.out.println("Okay, have a nice day");
        return false;

    }

    @Override
    public String getName() {
        return "exit";
    }
}
