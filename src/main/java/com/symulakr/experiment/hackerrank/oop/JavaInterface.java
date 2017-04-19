package com.symulakr.experiment.hackerrank.oop;

import java.util.stream.IntStream;

public class JavaInterface {

   interface AdvancedArithmetic {
      long divisor_sum(int n);
   }

   static class MyCalculator implements AdvancedArithmetic {

      public long divisor_sum(int n){
         long time = System.nanoTime();
         if (n <= 1)
            return n;
         long sum = 1L + n;
         long div = 2L;
         long limit = n / div;
         while (div < limit) {
            limit = n / div;
            if (n % div == 0) {
               if (div != limit) {
                  sum += (div + limit);
               }
               else {
                  sum += div;
               }
            }
            div++;
         }
         System.out.printf("E: %d -> %d -> %d%n", n, System.nanoTime() - time, sum);
         return sum;
      }

   }

   static class Solution {
      public static void main(String[] args){
         MyCalculator calculator = new MyCalculator();
         IntStream.range(16, 17).forEach(calculator::divisor_sum);
         calculator.divisor_sum(Integer.MAX_VALUE);
         calculator.divisor_sum(Integer.MAX_VALUE - 1);
      }
   }

}
