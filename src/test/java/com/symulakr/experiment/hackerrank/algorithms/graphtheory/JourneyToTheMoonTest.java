package com.symulakr.experiment.hackerrank.algorithms.graphtheory;

import com.symulakr.experiment.hackerrank.SolutionTest;
import org.junit.Test;

import static org.junit.Assert.*;

public class JourneyToTheMoonTest extends SolutionTest{
   @Test
   public void testableMain() throws Exception{
      JourneyToTheMoon.testableMain(getInputStream("/algorithms/graphtheory/jttm.in"), getPrintStream(), new String[0]);
      assertTrue(compareOutputs("/algorithms/graphtheory/jttm.out"));

   }

}