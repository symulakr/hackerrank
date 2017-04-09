package com.symulakr.experiment.hackerrank.thirtydaysofcode;

import java.util.Scanner;
import java.util.stream.Stream;

public class LetsReview {

   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int t = scan.nextInt();
      scan.nextLine();
      Stream.generate(scan::nextLine).limit(t).forEach(s -> {
         StringBuilder odd = new StringBuilder();
         StringBuilder even = new StringBuilder();
         for (int i = 0; i < s.length() - 1; i++) {
            even.append(s.charAt(i++));
            odd.append(s.charAt(i));
         }
         System.out.printf("%s %s%n", even.toString(), odd.toString());
      });
      scan.close();
   }

}
