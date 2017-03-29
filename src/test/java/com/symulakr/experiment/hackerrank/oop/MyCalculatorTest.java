package com.symulakr.experiment.hackerrank.oop;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class MyCalculatorTest
{

   private JavaInterface.MyCalculator calculator;

   @Before
   public void before()
   {
      calculator = new JavaInterface.MyCalculator();
   }

   @Test
   public void divisor_sum() throws Exception
   {
      assertEquals(0, calculator.divisor_sum(0));
      assertEquals(1, calculator.divisor_sum(1));
      assertEquals(12, calculator.divisor_sum(6));
      assertEquals(42, calculator.divisor_sum(20));
   }

}