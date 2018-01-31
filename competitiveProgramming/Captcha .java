/*
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
 
import java.util.Scanner;
import java.io.File;

public class Captcha 
{
	 public static void main(String[] args) throws Exception {
     Scanner infile = new Scanner(new File("Index.txt"));
     String thing = infile.nextLine();
     int sum=0;

     for(int i=0;i<thing.length()-1;i++) {
        if(Character.getNumericValue(thing.charAt(i))==Character.getNumericValue(thing.charAt((i+(thing.length()/2))%thing.length())))
           sum+=Character.getNumericValue(thing.charAt(i));
     }
     System.out.print(sum);
  }
}

