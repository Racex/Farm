package com.game.farm;

import com.game.farm.Cow;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CowTest {


    @Test
    public void shouldHaveName() {
        //Given
        Cow cow = new Cow("Mućka");

        //Then
        assertEquals(cow.getName(), "Mućka");
    }

    @Test
    public void shouldHaveCorrectToString()
    {
        //Given
        Cow cow = new Cow("Mućka");

        //Then
        assertEquals(cow.toString(), "Krowa:Mućka");
    }
}
