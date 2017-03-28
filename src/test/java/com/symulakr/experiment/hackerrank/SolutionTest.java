package com.symulakr.experiment.hackerrank;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Arrays;

import org.apache.commons.io.IOUtils;

public abstract class SolutionTest
{

   protected InputStream in;
   protected ByteArrayOutputStream out;

   protected InputStream getInputStream(String name)
   {
      in = this.getClass()
            .getResourceAsStream(name);
      return in;
   }

   protected PrintStream getPrintStream()
   {
      out = new ByteArrayOutputStream();
      return new PrintStream(out);
   }

   protected boolean compareOutputs(String name)
   {
      try
      {
         return Arrays.equals(out.toByteArray(), IOUtils.toByteArray(this.getClass()
               .getResourceAsStream(name)));
      }
      catch (IOException e)
      {
         throw new RuntimeException(e);
      }
   }

}
