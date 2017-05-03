package com.symulakr.experiment.hackerrank.algorithms.graphtheory;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Collection;
import java.util.Scanner;
import java.util.stream.IntStream;

public class JourneyToTheMoon {

   public static void main(String[] args){
      testableMain(System.in, System.out, args);
   }

   public static void testableMain(InputStream in, PrintStream out, String[] args){
      DisjointSet<Integer> astronauts = new DisjointSet<>();
      Scanner scnr = new Scanner(in);
      int astronautsCount = scnr.nextInt();
      int testCount = scnr.nextInt();
      IntStream.range(0, astronautsCount).forEach(astronauts::addSingleton);
      while (scnr.hasNextInt()) {
         astronauts.union(scnr.nextInt(), scnr.nextInt());
      }

      out.println(
            astronauts.getSets()
                  .stream()
                  .map(Collection::size)
                  .mapToLong(Long::new)
                  .map(s -> s * (astronautsCount - s))
                  .sum() / 2L
      );

   }

}
