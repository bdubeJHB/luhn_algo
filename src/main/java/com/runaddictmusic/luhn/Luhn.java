package com.runaddictmusic.luhn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Luhn
{
    public final static boolean luhn(String id_number)
    {
        Logger logger = LoggerFactory.getLogger(Luhn.class);

        if(id_number == null || id_number.isEmpty())
        {
            logger.error("No valid input");
            return false;
        }

        try
        {
            Integer.parseInt(id_number);
        }
        catch(Exception e)
        {
            logger.error("Number contains illegal charaters");
            return false;
        }

        int sum = 0;
        boolean check_digit = false;
        for(int index = id_number.length() - 1; index >= 0; index--)
        {
            int current = Integer.valueOf(id_number.charAt(index));
            if(check_digit)
            {
                if(current * 2 > 9)
                {
                    current *= 2;
                    sum += current % 10;
                    sum += current / 10;
                }
                else
                {
                    sum += current * 2;
                }
                check_digit = false;
            }
            else
            {
                sum += current;
                check_digit = true;
            }
        }

        logger.info("For input \"{}\", validation returned: {}", id_number, sum % 10 == 0);
        return sum % 10 == 0 ? true: false;
    }
}

