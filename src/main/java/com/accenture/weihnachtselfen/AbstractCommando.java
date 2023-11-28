package com.accenture.weihnachtselfen;

public abstract class AbstractCommando implements Commando {

    public abstract String getName(); //noch nicht fertig, die Unterklassen machen diese Methode fertig

    public boolean shouldRun(String commando){
        return getName().equals(commando);
    }

}
