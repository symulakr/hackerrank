package com.symulakr.experiment.hackerrank.thirtydaysofcode;

public class Node<E extends Comparable<E>> {
   Node<E> left;
   Node<E> right;
   E data;

   Node (E data) {
      this.data = data;
      left = right = null;
   }

   public static <E extends Comparable<E>> Node<E> insert(Node<E> root, E data) {
      if (root == null) {
         return new Node<>(data);
      } else {
         Node<E> cur;
         if (data.compareTo(root.data) < 0) {
            cur = insert(root.left, data);
            root.left = cur;
         } else {
            cur = insert(root.right, data);
            root.right = cur;
         }
         return root;
      }
   }

}
