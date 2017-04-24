package com.symulakr.experiment.hackerrank.thirtydaysofcode;

import java.util.Scanner;

public class Day22 {

   static class Solution {
      public static int getHeight(Node root) {
         //Write your code here
         if (root == null || (root.left == null && root.right == null)) {
            return 0;
         } else {
            return Math.max(1 + getHeight(root.left), 1 + getHeight(root.right));
         }
      }

      public static void main(String args[]) {
         Scanner sc = new Scanner(System.in);
         int T = sc.nextInt();
         Node<Integer> root = null;
         while (T-- > 0) {
            int data = sc.nextInt();
            root = Node.insert(root, data);
         }
         int height = getHeight(root);
         System.out.println(height);
      }
   }

}
