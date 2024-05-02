package dev.leetcode.problems.containsDuplicat;

import static dev.leetcode.problems.containsDuplicate.ContainsDuplicate.containsDuplicate;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class TwoSumTests {

  @Test
  void null_returns_false() {
    assertFalse(containsDuplicate(new int[] {}));
  }

  @Test
  void exampleOne() {
    assertTrue(containsDuplicate(new int[]{ 1, 2, 3,1}));
  }

  @Test
  void exampleTwo() {
    assertFalse(containsDuplicate(new int[] { 1, 2, 3, 4 }));
  }

  @Test
  void exampleThree() {
    assertTrue(containsDuplicate(new int[]{ 1, 1, 1, 3, 3, 4, 3, 2, 4,2}));
  }

}
