/*
 * Copyright (c) 2021 Benedict Dube. Creative Commons Attribution (CC BY)
 * 
 * This program should not be used as a final validation measure as it provides
 * only basic validation of numbers and may let some invalid numbers through.
 */
package com.runaddictmusic.luhn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Luhn algorithm: Used to validate credit card numbers, IMEI numbers
 * and certain countries ID numbers (including South Africa).
 *
 * @version 1.0 20 Jan 2021
 * @author  Benedict Dube
 */
public class Luhn {
    public final static boolean luhn(String idNumber) {
        Logger logger = LoggerFactory.getLogger(Luhn.class);
        int sum = 0;
        boolean checkDigit = false;

        if ((idNumber == null) || idNumber.isEmpty()) {
            logger.error("No valid input");
            return false;
        }

        try {
            Integer.parseInt(idNumber);
        }
        catch (Exception e) {
            logger.error("Number contains illegal charaters");
            return false;
        }

        for (int index = idNumber.length() - 1; index >= 0; index--) {
            int current = Integer.valueOf(idNumber.charAt(index));

            if (checkDigit) {
                if (current * 2 > 9) {
                    current *= 2;
                    sum += current % 10;
                    sum += current / 10;
                } else {
                    sum += current * 2;
                }
                checkDigit = false;
            } else {
                sum += current;
                checkDigit = true;
            }
        }

        logger.info("For input \"{}\", validation returned: {}",
                    idNumber, sum % 10 == 0);
        return (sum % 10 == 0) ? true: false;
    }
}

