package com.accenture.weihnachtselfen;

import java.util.ArrayList;

public class ShowCommando extends AbstractCommando implements Commando {
    private final ArrayList<Game> games;
    public ShowCommando(ArrayList<Game> games){
        this.games = games;
    }

    @Override
    public boolean execute() { // private zu public
        System.out.println("show");
        for (Game game : games) {
            System.out.println("Name: " + game.getName() + " Preis: " + game.getPrice() + "€");
        }
        return true;
    }

    @Override
    public String getName() {
        return "show";
    }
}
