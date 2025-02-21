/*
 * *** Alexa Solorzano COMP 272 Section 001 ***
 *
 * This java file contains several simple tree problems that need to be
 * codified. These routines  must use the TreeMap and TreeSet library
 * classes from the Java Collection Framework.
 *
 */

import java.util.*;

public class TreeProblems {

  /**
   * Method different()
   *
   * Given two TreeSets of integers, return a TreeSet containing all elements 
   * that are NOT in both sets. In other words, return a TreeSet of all the
   * elements that are in one set but not the other.
   *
   * Retain the common elements (the elements in both sets) by using method retainAll() one setA to keep only the elements that are also on setB
   * Create temporary sets (tempA and tempB) to hold the contents of setA and setB respectively 
   * Add elements to the temporary sets 
   * Remove common elements (since we are trying to return the a TreeSet with elements in setA and setB that are unique to each other) by using the method removeAll() on each temp set to remove the common elements
   * After modidying tempA and tempB we have to unite them into one single TreeSet --> create a result treeset and use method addAll between tempA and tempB 
   * return the new treeset
   * 
   */
  
  public static Set<Integer> different(Set<Integer> setA, Set<Integer> setB) {

    // INSERT CODE HERE - DO NOT FORGET TO PLACE YOUR NAME ABOVE
    //
    // This can be done numerous ways, but once such will only that
    // *several* lines of code. Hint: create two temporary TreeSets and utilize the
    // methods retainAll(), addAll(), and removeAll(). But in the end, get something to work.

    return setA;
  }


  /**
   * Method removeEven()
   *
   * Given a treeMap with the key as an integer, and the value as a String,
   * remove all <key, value> pairs where the key is even. 
   */

  public static void removeEven(Map<Integer, String> treeMap) {

    // INSERT CODE HERE.

    return;
  }


  /**
   * Method treesEqual()
   *
   * Given two treeMaps, each with the key as an integer, and the value as a String,
   * return a boolean value indicating if the two trees are equal or not.
   */

  public boolean treesEqual(Map<Integer, String> tree1,Map<Integer, String> tree2 ) {

    // INSERT CODE HERE

    return false;

  }

} // end treeProblems class
