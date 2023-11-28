package com.accenture.weihnachtselfen;

/* Erster Schritt, Main Methode starten, Object von MainKlasse erzeugen und dann run Methode aufrufen
    Zweiter Schritt, System.out.println
    Dritter Schritt, Scanner aufrufen, Variabel um Eingabe zu speichern aufrufen und dann auslesen
    if else Abfrage bauen
    darum eine while Schleife
    damit man aus der while Schleife kommt, muss userInput in den Loop
    Vierter Schritt, Game Klasse erstellen, Variabeln erstellen, diese private setzen(dafür brauchen wir dann getter und setter)
    Fünfter Schritt, eine Liste erstellen, in die wir die Objekte erstellen
    sechster Schritt add Methode erstellen
    siebter Schritt show Methode erstellen, for each Schleife
    achter Schritt: Code aufräumen, Extract Method von add, static als erstes löschen
    neunter Schritt: wir machen nun die execute-Methode für alle gleich, dann geht diesen in ein Interface, anschließend bauen wir in jeder Klasse einen Konstrukor
    wenn die execute methode immer gleich aussieht -> dann Interface -> dann kann sich jede Klasse entsprechend die Methode ziehen
    zehnter Schritt: Interface erstellen, Commando Interface, Methode in boolean umwandeln, damit alle Commandoklassen zugreifen können
    elfter Schritt: anschließend mit Interface arbeiten
    zwölfter Schrtt: ArrayList für commandos erstellen
    13 Schritt: Abstracte klasse für Commando erstellt, in den KLassen extenden


*/

import java.util.ArrayList;
import java.util.Scanner;

public class GamesStore {


    public static final String ADD = "add";
    public static final String SHOW = "show";
    public static final String EXIT = "exit";

    public void run() {

        System.out.println("Willkommen in Merles Game Store");

        ArrayList<Game> games = new ArrayList<>(); //new macht neuen Speicherort

        ArrayList<AbstractCommando> commandos = new ArrayList<>(); // neue Liste, um hier die verschiednenen Commandos reinzuschmeißen
        //ArrayLIst auf Abrstract geändert, damit wir zugriff auf Methode habe
        Scanner scanner = new Scanner(System.in);


        AddCommando addCommando = new AddCommando(scanner, games);
        ShowCommando showCommando = new ShowCommando(games); //Konstruktor erzeugt ein Objekt,hier default Constructor
        ExitCommando exitCommando = new ExitCommando();


        commandos.add(addCommando); // diese fügen wir bei schritt 12 ein, anschließend den if Block auskommentieren
        commandos.add(showCommando); // neuen Loop erstellen, neue Klasse abstract Commandos erstellen
        commandos.add(exitCommando);
            boolean shouldRun = true;
            while (shouldRun) {
                System.out.println("Wie kann ich dir helfen?");
                String input = scanner.nextLine();
                for (AbstractCommando commando : commandos) {
                    if(commando.shouldRun(input)){
                        commando.execute();
                    }
                }

                /*
                if (ADD.equalsIgnoreCase(input))
                    addCommando.execute();
                else if (SHOW.equalsIgnoreCase(input))
                    showCommando.execute();
                else if (EXIT.equalsIgnoreCase(input)) {
                    shouldRun = exitCommando.execute();
                } else {
                    System.out.println("Input nicht erkannt");
                } */
            }
        }


    public static void main(String[] agrs){

        //static kann ohne Objekt aufgerufen werden, Klassenmethoden
        // final heisst Konstante, KOnstante ist Teil der System-Klasse(System.out.println)
        //ich brauche kein Object weil System-Klasse static ist
        // non-static; Objektmethoden
        GamesStore gamesStore = new GamesStore();
        gamesStore.run();
    }


}