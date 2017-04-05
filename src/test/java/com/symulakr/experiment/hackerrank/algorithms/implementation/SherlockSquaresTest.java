package com.symulakr.experiment.hackerrank.algorithms.implementation;

import com.symulakr.experiment.hackerrank.SolutionTest;
import org.junit.Test;

import static org.junit.Assert.*;

public class SherlockSquaresTest extends SolutionTest{

   @Test
   public void testableMain() throws Exception
   {
      SherlockSquares.testableMain(getInputStream("/algorithms/implementation/sherlock_squares_test.in"), getPrintStream(), new String[0]);
      assertTrue(compareOutputs("/algorithms/implementation/sherlock_squares_test.out"));
   }
}