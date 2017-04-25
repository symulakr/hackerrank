package com.symulakr.experiment.hackerrank.thirtydaysofcode;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Day20 {

   public static class Solution {

      public static void main(String[] args){
         Scanner scanner = new Scanner(System.in);
         int n = scanner.nextInt();
         scanner.nextLine();
         int[] array = IntStream.generate(scanner::nextInt).limit(n).toArray();
         System.out.println("Array is sorted in " + sort(array) + " swaps.");
         System.out.println("First Element: " + array[0]);
         System.out.println("Last Element: " + +array[array.length - 1]);

      }

      private static int sort(int[] a){
         int swapCount = 0;
         for (int i = 0; i < a.length; i++) {
            // Track number of elements swapped during a single array traversal
            boolean sorted = true;

            for (int j = 0; j < a.length - 1; j++) {
               // Swap adjacent elements if they are in decreasing order
               if (a[j] > a[j + 1]) {
                  swap(a, j, j + 1);
                  sorted = false;
                  swapCount++;
               }
            }

            // If no elements were swapped during a traversal, array is sorted
            if (sorted) {
               break;
            }
         }
         return swapCount;
      }

      private static void swap(int[] a, int i, int j){
         int temp = a[i];
         a[i] = a[j];
         a[j] = temp;
      }

   }

}
