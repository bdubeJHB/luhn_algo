package com.runaddictmusic.luhn;

public class Person
{
    private static int count;
    private String id_number;

    public Person(String id_number)
    {
        this.id_number = id_number;
    }

    public String get_id()
    {
        return this.id_number;
    }

    public boolean validate_number(String num)
    {
        // Check if all characters in string are integers
        //for(int index = 0; index < num.length(); index++)
        //{
        //    if(!num.charAt(index).isInt())
        //    {
        //        return False;
        //    }
        //}
        try
        {
            Integer.parseInt(num);
        }
        catch(NumberFormatException e)
        {
            System.err.print("Number contains illegal charaters");
            return false;
        }

        int sum = 0;
        boolean check_digit = false;
        for(int index = num.length(); index > 0; index--)
        {
            int current = Integer.valueOf(num.charAt(index));
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
