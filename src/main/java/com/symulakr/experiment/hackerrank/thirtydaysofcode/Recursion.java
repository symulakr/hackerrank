package com.symulakr.experiment.hackerrank.thirtydaysofcode;

import java.util.Scanner;
import java.util.stream.IntStream;

//Day 9: Recursion
public class Recursion {

   public static void main(String[] args){
      Scanner s = new Scanner(System.in);
      int n = s.nextInt();
      s.close();
      System.out.println(factorial(n));
   }

   public static int factorial(int n){
      if (n > 12 || n < 0) {
         throw new IllegalArgumentException("This method support just integers in range: 0<=N<=12 ");
      }
      if (n < 2) {
         return 1;
      }
      return n * factorial(n - 1);
   }

}
