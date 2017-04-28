package com.symulakr.experiment.hackerrank.algorithms.warmup;

import java.util.Scanner;

public class TimeConversion {

   public static class Solution {

      public static void main(String[] args){
         Scanner scanner = new Scanner(System.in);
         String time12 = scanner.nextLine();
         System.out.println(convert12to24(time12));
      }

      public static String convert12to24(String time12){
         int hours = Integer.parseInt(time12.substring(0, 2));
         int mins = Integer.parseInt(time12.substring(3, 5));
         int seconds = Integer.parseInt(time12.substring(6, 8));
         boolean pm = time12.contains("PM");
         hours = hours == 12 ? 0 : hours;
         if (pm) {
            hours += 12;
         }
         return String.format("%02d:%02d:%02d", hours, mins, seconds);
      }

   }

}
