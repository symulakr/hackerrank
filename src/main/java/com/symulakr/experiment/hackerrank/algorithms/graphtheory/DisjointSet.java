package com.symulakr.experiment.hackerrank.algorithms.graphtheory;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DisjointSet<E> {

   private Map<E, Set<E>> sets = new HashMap<>();

   public void addSingleton(E element){
      addSet(element);
   }

   public void union(E e1, E e2){
      mergeSets(e1, e2);
   }

   private Set<E> addSet(E element){
      Set<E> set = sets.getOrDefault(element, new HashSet<>());
      set.add(element);
      sets.put(element, set);
      return set;
   }

   private Set<E> findSet(E element){
      Set<E> set = sets.get(element);
      return set != null ? set : addSet(element);
   }

   private void mergeSets(E e1, E e2){
      Set<E> set1 = findSet(e1);
      Set<E> set2 = findSet(e2);
      if (set1 != set2) {
         if (set1.size() >= set2.size()) {
            mergeSets(set1, set2);
         }
         else {
            mergeSets(set2, set1);
         }
      }
   }

   private void mergeSets(Set<E> set1, Set<E> set2){
      set1.addAll(set2);
      set2.forEach(e -> sets.put(e, set1));
   }

   public Set<Set<E>> getSets(){
      return new HashSet<>(sets.values());
   }

}
