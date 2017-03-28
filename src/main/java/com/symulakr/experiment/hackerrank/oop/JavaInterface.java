package com.symulakr.experiment.hackerrank.oop;

public class JavaInterface {

   interface AdvancedArithmetic {
      int divisor_sum(int n);
   }

   static class MyCalculator implements AdvancedArithmetic {

      public int divisor_sum(int n) {
         if (n == 1) return 1;
         int sum = 1 + n;
         int div = 2;
         int limit = n / div;
         while (div < limit) {
            if (n % div == 0) {
               System.out.println(div);
               limit = n / div;
               sum += (div +limit);
            }
            div++;
         }
         return sum;
      }

   }

   static class Solution {
      public static void main(String[] args) {
         System.out.println(new MyCalculator().divisor_sum(24));
      }
   }

}
