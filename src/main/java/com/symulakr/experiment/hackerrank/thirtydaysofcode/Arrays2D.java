package com.symulakr.experiment.hackerrank.thirtydaysofcode;

import java.util.Arrays;
import java.util.Scanner;
//Day 11: 2D Arrays
public class Arrays2D {


   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int arr[][] = new int[6][6];
      for (int i = 0; i < 6; i++) {
         for (int j = 0; j < 6; j++) {
            arr[i][j] = in.nextInt();
         }
      }

      int[][] pattern = {
            {1, 1, 1},
            {0, 1, 0},
            {1, 1, 1}};

      int max = Integer.MIN_VALUE;
      for (int i = 0; i < 4; i++) {
         for (int j = 0; j < 4; j++) {
            max = Math.max(max, sum(applyPattern(cutByPattern(arr, 3, 3, i, j), pattern)));
         }
      }
      System.out.println(max);

   }

   private static int[][] applyPattern(int[][] array, int[][] pattern) {
      for (int i = 0; i < array.length; i++) {
         for (int j = 0; j < array[i].length; j++) {
            array[i][j] = array[i][j] * pattern[i][j];
         }
      }
      return array;
   }


   private static int[][] cutByPattern(int[][] array, int row, int collumn, int x, int y) {
      int[][] result = new int[row][collumn];
      if (x + collumn <= array[0].length || y + row <= array.length) {
         for (int i = 0; i < row; i++) {
            result[i] = Arrays.copyOfRange(array[i + y], x, x + collumn);
            System.out.println(Arrays.toString(result[i]));
         }
         System.out.println();
      }
      return result;
   }

   private static int sum(int[][] array) {
      int result = 0;
      for (int[] a : array) {
         for (int i : a) {
            result += i;
         }
      }
      return result;
   }


}
