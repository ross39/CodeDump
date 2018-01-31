import java.util.*;
import java.io.*;

//THIS USES AN ARRAY DATA STRUCTURE.
//CAN BE DONE USING ASCII NUMBERS(0(N LOG N))
//THIS IS 0(N)
public class CharsUniqueString
{
    final static int MAX_CHAR = 256;
    boolean uniqueChar(String str)
    {
        //if length is greater than 256 then return false
        if(str.length() > MAX_CHAR)
            return false;
        boolean[] chars = new boolean[MAX_CHAR];
        Arrays.fill(chars, false);

        for(int i = 0; i < str.length(); i++)
        {
            int index = (int) str.charAt(i);
            //if the value is true then this has duplicate values
            //return false
            if(chars[index] == true)
                return false;

            chars[index] = true;
       }
       return true;
    }
    public static void main(String[] args)
    {
        CharsUniqueString c = new CharsUniqueString();
        String input = "QWERTYUIOPASDFGHJKLZXCVBNM";
        if(c.uniqueChar(input))
            System.out.println("The string " + input + "has all unique characters");
        else
            System.out.println("The string " + input + "has duplicate characters");
    }
}