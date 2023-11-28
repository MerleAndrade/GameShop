package com.accenture.weihnachtselfen;

public interface Commando { //interface ist abstract, keine fertigen Methoden

String HELLO = "Hello";  // Variabeln sind hier immer final
    boolean execute(); // Methoden ist implizit public abstract
        //keine gescheiften Klammern bei Interface!!!
}

/*
        Commando c = () -> false;  //Lambda funktioniert nur bei einer Methode im Interface (functionel Interfaces)

       Commando b = new Commando() {
            @Override
            public boolean execute() {
                return false;
            }
        };
*/