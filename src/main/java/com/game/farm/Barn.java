package com.game.farm;

import java.util.LinkedList;
import java.util.List;

class Barn {

    List<Animal> animalList = new LinkedList<>();
    private String name;

    Barn(String name) {
        this.name = name;
    }

    List<Animal> getAnimals(){
        return animalList;
    }
}
