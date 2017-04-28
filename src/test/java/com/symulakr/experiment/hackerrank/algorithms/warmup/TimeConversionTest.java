package com.symulakr.experiment.hackerrank.algorithms.warmup;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TimeConversionTest {

   @Test
   public void shouldConvert12formatTo24() throws Exception
   {
      assertEquals("00:00:00", TimeConversion.Solution.convert12to24("12:00:00AM"));
      assertEquals("01:00:00", TimeConversion.Solution.convert12to24("01:00:00AM"));
      assertEquals("02:00:00", TimeConversion.Solution.convert12to24("02:00:00AM"));
      assertEquals("03:00:00", TimeConversion.Solution.convert12to24("03:00:00AM"));
      assertEquals("04:00:00", TimeConversion.Solution.convert12to24("04:00:00AM"));
      assertEquals("05:00:00", TimeConversion.Solution.convert12to24("05:00:00AM"));
      assertEquals("06:00:00", TimeConversion.Solution.convert12to24("06:00:00AM"));
      assertEquals("07:00:00", TimeConversion.Solution.convert12to24("07:00:00AM"));
      assertEquals("08:00:00", TimeConversion.Solution.convert12to24("08:00:00AM"));
      assertEquals("12:00:00", TimeConversion.Solution.convert12to24("12:00:00PM"));
      assertEquals("13:00:00", TimeConversion.Solution.convert12to24("01:00:00PM"));
      assertEquals("14:00:00", TimeConversion.Solution.convert12to24("02:00:00PM"));
      assertEquals("23:00:00", TimeConversion.Solution.convert12to24("11:00:00PM"));
      assertEquals("23:22:22", TimeConversion.Solution.convert12to24("11:22:22PM"));
   }

}