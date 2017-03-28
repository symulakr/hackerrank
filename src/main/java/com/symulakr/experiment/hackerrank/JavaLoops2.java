package com.symulakr.experiment.hackerrank;

import java.util.Scanner;

/*
*https://www.hackerrank.com/challenges/java-loops
*/
public class JavaLoops2 {

   public static void main(String[] argh){
      Scanner in = new Scanner(System.in);
      int t = in.nextInt();
      for (int i = 0; i < t; i++) {
         int a = in.nextInt();
         int b = in.nextInt();
         int n = in.nextInt();
         createSeries(a, b, n);
      }
      in.close();
   }

   private static void createSeries(int a, int b, int n){
      int i = 0;
      int value = a + b;
      System.out.print(value + " ");
      while (i < n - 1) {
         value += (b * (2 << i++));
         System.out.print(value + " ");
      }
      System.out.println();
   }

}
