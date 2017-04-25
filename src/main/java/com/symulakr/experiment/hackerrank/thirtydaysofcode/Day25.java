package com.symulakr.experiment.hackerrank.thirtydaysofcode;

import java.util.Scanner;

public class Day25 {

   static class Solution {
      public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         int t = scanner.nextInt();
         while (t-- > 0) {
            System.out.println(isPrime(scanner.nextInt()) ? "Prime" : "Not prime");
         }
      }

      static boolean isPrime(int n) {
         if (n < 2) {
            return false;
         }
         int div = 2;
         int limit = n;
         while (div < limit) {
            limit = n / div;
            if (n % div == 0) {
               return false;
            }
            div++;
         }
         return true;
      }

   }

}
