package com.symulakr.experiment.hackerrank.thirtydaysofcode;

import org.junit.Test;

import com.symulakr.experiment.hackerrank.SolutionTest;

import static org.junit.Assert.assertTrue;

public class DataTypesTest extends SolutionTest
{

   @Test
   public void testableMain() throws Exception
   {
      DataTypes.testableMain(getInputStream("/data_types_test.in"), getPrintStream(), new String[0]);
      assertTrue(compareOutputs("/data_types_test.out"));
   }

}