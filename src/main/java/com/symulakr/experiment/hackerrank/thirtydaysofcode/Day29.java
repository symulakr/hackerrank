package com.symulakr.experiment.hackerrank.thirtydaysofcode;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Day29 {


   static class Solution {

      public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         int t = scanner.nextInt();
         while (t-- > 0) {
            System.out.println(method(scanner.nextInt(), scanner.nextInt()));
         }


      }

      static int method(int limit, int k) {
         int max = Integer.MIN_VALUE;
         int[] array = IntStream.rangeClosed(1, limit).toArray();
         for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
               int temp = Math.max(max, array[i] & array[j]);
               max = temp >= k ? max : temp;
               if (k - max == 1) return max;
            }
         }
         return max;
      }

   }

}
