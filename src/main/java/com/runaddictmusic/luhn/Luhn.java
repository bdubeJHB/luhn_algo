package com.runaddictmusic.luhn;


public class Luhn
{
    public final static boolean luhn(String id_number)
    {
        if(id_number == null || id_number.isEmpty())
            return False;

        try
        {
            Integer.parseInt(id_number);
        }
        catch(Exception e)
        {
            System.err.print("Number contains illegal charaters");
            return false;
        }

        int sum = 0;
        boolean check_digit = false;
        for(int index = id_number.length(); index > 0; index--)
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

        return sum % 10 == 0 ? true: false;
    }
}

