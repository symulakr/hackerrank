package com.symulakr.experiment.hackerrank.thirtydaysofcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DictionariesMaps {

   public static void main(String[] args){
      Map<String, Integer> map = new HashMap<>();
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      for (int i = 0; i < n; i++) {
         String name = in.next();
         int phone = in.nextInt();
         map.put(name, phone);
      }
      while (in.hasNext()) {
         String s = in.next();
         Integer phone = map.get(s);

         System.out.println(phone != null ? s + "=" + phone : "Not found");
      }
      in.close();
   }

}
