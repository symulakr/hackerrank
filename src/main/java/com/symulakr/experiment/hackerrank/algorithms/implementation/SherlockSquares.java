package com.symulakr.experiment.hackerrank.algorithms.implementation;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class SherlockSquares {

   public static void main(String[] args){
      testableMain(System.in, System.out, args);
   }

   public static void testableMain(InputStream in, PrintStream out, String[] args){
      Scanner scan = new Scanner(in);
      while (scan.hasNextInt()){
         out.println(countSquares(scan.nextInt(), scan.nextInt()));
      }
   }

   private static int countSquares(int from, int to){
      int sFrom = (int) Math.ceil(Math.sqrt(from));
      int sTo = (int) Math.floor(Math.sqrt(to));
      return (sTo - sFrom + 1);
   }

}
