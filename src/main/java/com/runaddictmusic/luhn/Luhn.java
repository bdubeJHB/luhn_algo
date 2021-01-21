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
        private static final Logger logger = LoggerFactory.getLogger(Luhn.class);

        public final static boolean luhn(String idNumber) {
                int sum = 0;
                boolean checkDigit = false;
                int current;

                if ((idNumber == null) || idNumber.isEmpty()) {
                        logger.error("No valid input");
                        return false;
                }

                try {
                        Integer.parseInt(idNumber);
                } catch (Exception e) {
                        logger.error("Number contains illegal charaters");
                        return false;
                }

                logger.debug("Now evaluating \"{}\"", idNumber);
                for (int index = idNumber.length() - 1; index >= 0; index--) {
                        current = Integer.parseInt(String.valueOf(idNumber.charAt(index)));
                        logger.debug("At position {}, value is {}",
                                     index, current);

                        if (checkDigit && (current * 2 > 9)) {
                                current *= 2;
                                sum += current % 10;
                                sum += current / 10;
                                logger.debug("Adding {} + {}. Sum is currently {}",
                                             current % 10, current / 10, sum);
                        } else if (checkDigit) {
                                sum += current * 2;
                                logger.debug("Adding {}. Sum is currently {}",
                                             current * 2, sum);
                        } else {
                                sum += current;
                                logger.debug("Adding {} as is. Sum is currently {}",
                                             current, sum);
                        }

                        checkDigit = !checkDigit;
                }

                logger.info("For input \"{}\", validation returned: {}",
                            idNumber, sum % 10 == 0);

                return (sum % 10 == 0) ? true: false;
        }
}

