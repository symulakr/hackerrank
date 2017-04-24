package com.symulakr.experiment.hackerrank.thirtydaysofcode;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class Day28 {

   public static class Solution {

      public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
         String myRegExString = "([a-z]+)\\s[a-z.]+@gmail\\.com";
         Pattern pattern = Pattern.compile(myRegExString);

         Scanner scanner = new Scanner(System.in);

         int limit = scanner.nextInt();
         scanner.nextLine();
         Stream.generate(scanner::nextLine)
               .limit(limit)
               .map(pattern::matcher)
               .filter(Matcher::find)
               .map(m -> m.group(1))
               .sorted()
               .forEach(System.out::println);
      }
   }

   /*
   30
riya riya@gmail.com
julia julia@julia.me
julia sjulia@gmail.com
julia julia@gmail.com
samantha samantha@gmail.com
tanya tanya@gmail.com
riya ariya@gmail.com
julia bjulia@julia.me
julia csjulia@gmail.com
julia djulia@gmail.com
samantha esamantha@gmail.com
tanya ftanya@gmail.com
riya riya@live.com
julia julia@live.com
julia sjulia@live.com
julia julia@live.com
samantha samantha@live.com
tanya tanya@live.com
riya ariya@live.com
julia bjulia@live.com
julia csjulia@live.com
julia djulia@live.com
samantha esamantha@live.com
tanya ftanya@live.com
riya gmail@riya.com
priya priya@gmail.com
preeti preeti@gmail.com
alice alice@alicegmail.com
alice alice@gmail.com
alice gmail.alice@gmail.com
    */

   /*
alice
alice
julia
julia
julia
julia
preeti
priya
riya
riya
samantha
samantha
tanya
tanya
    */
}


