/*
 * DayTwo.java
 * 
 * Copyright 2017 RossHeaney <rossheaney@rossheaney-MacBookPro>
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301, USA.
 * 
 * 
 */
import java.util.*;
import java.io.*;
import java.util.Arrays;


public class Day2 {

    public static int part1(String s) {
        Integer[] a = FileIO.StringArrayToInteger(s.split("\\s+"));
        return ArrayUtils.max(a) - ArrayUtils.min(a);
    }

    public static int part2(String s) {
        Integer[]a = FileIO.StringArrayToInteger(s.split("\\s+"));
        Arrays.sort(a);
        for (int i = a.length - 1; i >= 0 ; i--) {
            for (int j = i - 1; j >=0 ; j--) {
                if (a[i] % a[j] == 0) {
                    return a[i] / a[j];
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        //List<String> input = FileIO.getAOCInputForDay(2017, 2, FileIO.SESSION_ID);
        String filename = "input.txt";
        int sum1 = FileIO.performIntActionOnLine(filename, Day2::part1);
        int sum2 = FileIO.performIntActionOnLine(filename, Day2::part2);
        System.out.println("Part 1: " + sum1);
        System.out.println("Part 2: " + sum2);
    }
}

