package com.game.farm;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class BarnTest {

    @Test
    public void shouldByEmptyBurn() {
        Barn barn = new Barn("Wielka szopa");

        assertEquals(barn.getAnimals().toString(), "[]");
    }


    @Test
    public void shouldAddAnimalToBarn()
    {
        Barn barn = new Barn("");


    }


}
