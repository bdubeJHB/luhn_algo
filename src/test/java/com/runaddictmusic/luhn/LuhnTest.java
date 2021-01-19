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
    } /*


    @Test
    public void implementsLuhnFormulaCorrectly()
    {
        Person test_person = new Person("8888888888888888");
        assertFalse(test_person.validate_number(test_person.get_id()));

        test_person.set_id("1111");
        assertTrue(test_person.validate_number(test_person.get_id()));
    }


    @Test
    public void evaluatesAnyPositiveLengthOfNumber()
    {
        Person test_person = new Person("4444444");
        assertTrue(test_person.validate_number(test_person.get_id()));
    }


    @Test
    public void doesNotAcceptEmptyStrings()
    {
        Person test_person = new Person("500");
        assertFalse(test_person.set_id(""));
        assertEquals(test_person.get_id(), "500");
    }*/
}

