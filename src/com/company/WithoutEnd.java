package com.company;

public class WithoutEnd
{
    public static String withoutEnd(String input)
    {
        if (input.length() <= 1)
        {
            String output = "The string must be at least 2 characters long.";
            return output;
        }
        else
        {
            String output = input.substring(1,input.length()-1);
            return output;
        }
    }
}
