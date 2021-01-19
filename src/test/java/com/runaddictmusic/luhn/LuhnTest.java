package com.runaddictmusic.luhn;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class PersonTest
{
    @Test
    public void personInstanceCounterWorks()
    {
        assertEquals(0, Person.get_count());

        Person test1 = new Person("44444444");
        assertEquals(1, Person.get_count());

        Person test2 = new Person("44444444");
        assertNotEquals(1, Person.get_count());
        assertTrue(2, Person.get_count());
    } /*


    @Test
    public void personClassesNeverAcceptInvalidStrings()
    {
        Person test_person = new Person("42082fybtp0rz");
        assertFalse(test_person.validate_number(test_person.get_id()));
    }


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

