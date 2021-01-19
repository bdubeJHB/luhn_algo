package com.runaddictmusic.luhn;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class LuhnTest
{
    @Test
    public void luhnAlgoNeverAcceptsInvalidStrings()
    {
        String id = "42082fybtp0rz";
        assertFalse(Luhn.luhn(id));
    }


    @Test
    public void implementsLuhnFormulaCorrectly()
    {
        String id = "8888888888888888";
        assertFalse(Luhn.luhn(id));

        id = "1111";
        assertTrue(Luhn.luhn(id));
    }


    @Test
    public void evaluatesAnyPositiveLengthOfNumber()
    {
        String id = "4444444";
        assertTrue(Luhn.luhn(id));

        assertTrue(Luhn.luhn("22"));

        assertTrue(Luhn.luhn("444"));
    }


    @Test
    public void doesNotAcceptEmptyStrings()
    {
        String id = "";
        assertFalse(Luhn.luhn("500"));
    }
}

