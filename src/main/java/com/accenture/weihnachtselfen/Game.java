package com.accenture.weihnachtselfen;


//Ist eine POJO Klasse, hier niemals final setzen
//nur dafür da um Daten zu speichern, keine Logik
public class Game {
    private String name;

    private Integer price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }


}
