package com.accenture.weihnachtselfen;

import java.util.ArrayList;
import java.util.Scanner;

public class AddCommando extends AbstractCommando implements Commando {  //hier das Interface implementieren

    private final Scanner scanner; //warum final? Mit final machen wir das Konstant
    private final ArrayList<Game> games; // die Referenz ist final, aber kann manipuliert werden

    public AddCommando(Scanner scanner, ArrayList<Game> games){ //runde Klammern sind das Eingangstor in eine Variable

        this.scanner = scanner;
        this.games = games;
    }

    @Override
    public boolean execute() { //private in public ändern, Methodennamen ändern von addCommando in execute, in ein boolean ändern bei Implementierung
        System.out.println("Wie ist der Name?");
        String gameName = scanner.nextLine(); //UserInput in gameName schmeißen



        System.out.println("Wie ist der Preis?");
        String gamePrice = scanner.nextLine(); // UserInput in gamePrice schmeißen
        Game game = new Game(); //neues Object erstellen
        game.setName(gameName); // Namen für das erstellte Object setzen
        game.setPrice(Integer.parseInt(gamePrice)); // Preis für das erstellte Object setzen, mit pareInt, da Eingabe ein String ist
        games.add(game); // Anschließend game in Liste aufnehmen

        return true;
    }

    @Override
    public String getName() {
        return "add";
    }
}
