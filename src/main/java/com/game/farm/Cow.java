package com.game.farm;

class Cow implements Animal{

    private String name;

    Cow(String name) {

        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Krowa:"+name;
    }
}
