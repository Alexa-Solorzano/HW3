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
   * From the TreeSet Java Platform, we know
   *  1) .addAll(Collection c)
   *  2) .removeAll(Collection c)
   *  3) .retainAll(Collection c)
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
   *
   * In 3B Sets and Maps presentation, we learned that we can see the overview of a map as a collection through 3 methods
   * Set<KeyType> keyset () --> return simple collections (returns set of all keys in the map)
   * Collection<ValueType> values() --> return simple collections (returns a collection of all the values in the map, but no access to the keys)
   * Set<Map.Entry<KeyType,ValueType>> entrySet() --> results a set of entries (returns a set of Map.Entry<K, V> where each entry contains both the key & the value
   *
   * Set<Map.Entry<KeyType,ValueType>> entrySet() would be the most effective way to iterate over both the keys and values simultaneously
   * It would be most helpful in removing all the <key, value> pairs where the key is even
   * We know that an integer is even if when diving the integer by 2 results in a remainder of 0 
   * Iterating through TreeMap will be harder since Map doesn't provide a iterator
   * But as seen through the 3B Sets and Maps presentation, 
   * We can use:
   * // For-each loop for traversal over Map via entrySet() Method
   *    for (Map.Entry mapElement : tm.entrySet()) { 
   *
   * Use entrySet() to get both key and value while iterating 
   *    if(the key in the Map.Entry key is even){
   *       remove the entry with the even key 
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
   *
   * For two treeMpas to be equal,
   * 1) They both must contain the same # of key-value pairs
   * 2) They both must have the same keys 
   * 3) For every key, both treeMaps must have the same corresponding value
   * 
   * In order to accurately compare the keys & values of the two treeMaps, 
   * we can use these methods:
   * Object Map.Entry has the following methods
   * KeyType getKey()
   * ValueType getValue()
   * 
   * if the treeMap sizes are different, return false 
   * Iterate over tree1
   * Declare variables that represent the key & value and place the extracted key & value from tree1 into the variable
   * Now, we have the key-value pair from tree1
   * Check for matching key & valye in tree2
   * if(tree2 does not contain the same key value as tree1 or does not contain the same key value)
   * return false; 
   *
   * since no differences where found, 
   * return true;
   */

  public boolean treesEqual(Map<Integer, String> tree1,Map<Integer, String> tree2 ) {

    // INSERT CODE HERE

    return false;

  }

} // end treeProblems class
