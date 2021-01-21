package com.runaddictmusic.luhn;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class LuhnTest {
    @Test
    public void luhnAlgoNeverAcceptsInvalidStrings() {
        String id = "42082fybtp0rz";
        assertFalse(Luhn.luhn(id));
    }


    @Test
    public void implementsLuhnFormulaCorrectly() {
        String accountNumber = "8888888888888888";
        assertFalse(Luhn.luhn(accountNumber));

        accountNumber = "1111";
        assertFalse(Luhn.luhn(accountNumber));

        // accountNumber = "49927398716";
        // assertTrue(Luhn.luhn(accountNumber));
    }


    @Test
    public void doesNotAcceptEmptyStrings() {
        String id = "";
        assertFalse(Luhn.luhn(id));
        assertFalse(Luhn.luhn("500"));
    }
}

