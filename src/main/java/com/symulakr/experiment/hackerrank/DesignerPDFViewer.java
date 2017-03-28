package com.symulakr.experiment.hackerrank;

import java.util.Scanner;

public class DesignerPDFViewer {

   public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      int[] h = new int[26];
      for (int h_i = 0; h_i < 26; h_i++) {
         h[h_i] = in.nextInt();
      }
      String word = in.next();
      System.out.println(calculate(h, word));
   }

   static int calculate(int[] h, String word){
      int maxHeight = 0;
      for (char c : word.toCharArray()) {
         maxHeight = Math.max(maxHeight, h[(int) c - 97]);
      }
      return word.length() * maxHeight;
   }

}
