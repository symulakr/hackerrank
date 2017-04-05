package com.symulakr.experiment.hackerrank.thirtydaysofcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RecursionTest {
   @Test
   public void shouldReturnFactorials() throws Exception{
      assertEquals(Recursion.factorial(0), 1);
      assertEquals(Recursion.factorial(1), 1);
      assertEquals(Recursion.factorial(2), 2);
      assertEquals(Recursion.factorial(3), 6);
      assertEquals(Recursion.factorial(4), 24);
      assertEquals(Recursion.factorial(5), 120);
      assertEquals(Recursion.factorial(6), 720);
      assertEquals(Recursion.factorial(7), 5040);
      assertEquals(Recursion.factorial(8), 40320);
      assertEquals(Recursion.factorial(9), 362880);
      assertEquals(Recursion.factorial(10), 3628800);
      assertEquals(Recursion.factorial(11), 39916800);
      assertEquals(Recursion.factorial(12), 479001600);
   }

   @Test(expected = IllegalArgumentException.class)
   public void expectExceptionForNegativeArgument() throws Exception{
      Recursion.factorial(-1);
   }

   @Test(expected = IllegalArgumentException.class)
   public void expectExceptionForArgumentMoreThan12() throws Exception{
      Recursion.factorial(13);
   }
}