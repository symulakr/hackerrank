package com.symulakr.experiment.hackerrank.thirtydaysofcode;

import java.util.Scanner;

public class Day26 {

   static class SimpleDate {
      int day;
      int month;
      int year;

      public SimpleDate(int day, int month, int year){
         this.day = day;
         this.month = month;
         this.year = year;
      }

      public boolean isBefore(SimpleDate date){
         if (year == date.year) {
            if (month == date.month) {
               return day < date.day;
            }
            return month < date.month;
         }
         return year < date.year;
      }
   }

   static class Solution {

      public static void main(String[] args){
         SimpleDate expect;
         SimpleDate actual;
         Scanner scanner = new Scanner(System.in);
         actual = new SimpleDate(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
         expect = new SimpleDate(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
         System.out.println(calculateFine(expect, actual));
      }

      private static int calculateFine(SimpleDate expect, SimpleDate actual){
         if (actual.isBefore(expect)) {
            return 0;
         }
         if (expect.year != actual.year) {
            return 10000;
         }
         if (expect.month != actual.month) {
            return calculateFune(expect.month, actual.month, 500);
         }
         return calculateFune(expect.day, actual.day, 15);
      }

      private static int calculateFune(int expect, int actual, int multiply){
         return multiply * (actual - expect);
      }
   }

}


