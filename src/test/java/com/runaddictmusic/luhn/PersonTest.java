package com.runaddictmusic.luhn;

import org.junit.Jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PersonTest
{
    @Test
    public void doesNotAcceptInvalidStrings()
    {
        Person ben = new Person("42082fybtp0rz");
        assertFalse(ben.validate_number(ben.get_id()));
    }

    @Test
    public void implementsLuhnFormulaCorrectly()
    {
        Person ben = new Person("8888888888888888");
        assertFalse(ben.validate_number(ben.get_id()));

        String card_number = "44444444";
        assertTrue(ben.validate_number(card_number));
    }
}
