import java.util.*;
import java.io.*;

public class checkPermutation
{
    private static boolean isPermutation(String a, String b)
    {
        char[] aArray = a.toCharArray();
        char[] bArray = b.toCharArray();
        Arrays.sort(aArray);
        Arrays.sort(bArray);
        return Arrays.equals(aArray, bArray);
    }
    
    public static void main(String[] args) 
    {
        System.out.println(isPermutation("HELLO", "OLLEH"));
    }
}