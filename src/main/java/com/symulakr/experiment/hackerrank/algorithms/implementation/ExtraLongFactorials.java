package com.symulakr.experiment.hackerrank.algorithms.implementation;

import java.math.BigInteger;
import java.util.Scanner;

public class ExtraLongFactorials {

   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int n = scan.nextInt();
      scan.close();
      if (n <= 1) {
         System.out.println(1);
         return;
      }
      BigInteger result = BigInteger.valueOf(n);
      for (int i = 1; i<n; i++){
         result = result.multiply(BigInteger.valueOf(i));
      }
      System.out.println(result);
   }


}
