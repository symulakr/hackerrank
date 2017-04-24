package com.symulakr.experiment.hackerrank.thirtydaysofcode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Day23 {
   static class Solution {
      static Queue<Node> queue = new LinkedList<>();

      static void levelOrder(Node root) {
         //Write your code here

         if (root != null) {

            queue.add(root);

            while (!queue.isEmpty()) {
               Node node = queue.poll();
               System.out.print(node.data + " ");
               if (node.left != null) queue.add(node.left);
               if (node.right != null) queue.add(node.right);
            }


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
         levelOrder(root);
      }
   }
}
