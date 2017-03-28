package com.symulakr.experiment.hackerrank.thirtydaysofcode;


import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class DataTypes {

   public static void main(String[] args){
      testableMain(System.in, System.out, args);
   }

   static void testableMain(InputStream in, PrintStream out, String[] args){
      int i = 4;
      double d = 4.0;
      String s = "HackerRank ";
      Scanner scan = new Scanner(in);
      /* Declare second integer, double, and String variables. */
      int ii;
      double dd;
      String ss;
        /* Read and save an integer, double, and String to your variables.*/
      // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.
      ii = scan.nextInt();
      dd = scan.nextDouble();
      scan.nextLine();
      ss = scan.nextLine();
        /* Print the sum of both integer variables on a new line. */
      out.println(i + ii);
        /* Print the sum of the double variables on a new line. */
      out.println(d + dd);
        /* Concatenate and print the String variables on a new line;
           the 's' variable above should be printed first. */
      out.println(s + ss);
      scan.close();
   }

}
