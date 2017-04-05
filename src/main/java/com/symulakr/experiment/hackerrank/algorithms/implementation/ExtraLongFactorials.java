package com.symulakr.experiment.hackerrank.algorithms.implementation;

import java.math.BigInteger;
import java.util.Scanner;

public class ExtraLongFactorials {

   public static void main(String[] args){
      Scanner scan = new Scanner(System.in);
      int n = scan.nextInt();
      scan.close();
      System.out.println(loopFactorial(n));
      System.out.println(recursionFactorial(n));
   }

   public static BigInteger recursionFactorial(int n){
      return recursionFactorial(BigInteger.valueOf(n));
   }

   public static BigInteger recursionFactorial(BigInteger bi){
      if (bi.intValue() < 2) {
         return BigInteger.ONE;
      }
      return bi.multiply(recursionFactorial(bi.subtract(BigInteger.ONE)));
   }

   public static BigInteger loopFactorial(int n){
      BigInteger result = BigInteger.ONE;
      while (n > 1) {
         result = result.multiply(BigInteger.valueOf(n--));
      }
      return result;
   }

}
