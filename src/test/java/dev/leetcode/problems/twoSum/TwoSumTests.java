package dev.leetcode.problems.twoSum;

import static dev.leetcode.problems.twoSum.TwoSum.twoSum;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class TwoSumTests {

  @Test
  void addingTo9() {
    var result = twoSum(new int[] { 2, 7, 11, 15 }, 9);
    assertTrue(result[0] == 0 && result[1] == 1);
  }

  @Test
  void addingTo6() {
    var results = twoSum(new int[] { 3, 2, 4 }, 6);
    assertTrue(results[0] == 1 && results[1] == 2);
  }

  @Test
  void adding3And3To6() {
    var results = twoSum(new int[] { 3,3}, 6);
    assertTrue(results[0] == 0 && results[1] == 1);
  }
}
