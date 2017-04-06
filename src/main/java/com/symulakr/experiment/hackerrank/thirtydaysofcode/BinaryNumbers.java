package com.symulakr.experiment.hackerrank.thirtydaysofcode;

import java.util.Scanner;

//Day 10: Binary Numbers
//https://www.hackerrank.com/challenges/30-binary-numbers
public class BinaryNumbers {

   public static void main(String[] args){
      Scanner s = new Scanner(System.in);
      int n = s.nextInt();
      s.close();
      int max = 0;
      int count = 0;
      while (n > 0) {
         if (n % 2 == 1) {
            count++;
            max = Math.max(max, count);
         }
         else {
            count = 0;
         }
         n = n >> 1;
      }
      System.out.println(max);
   }

}
