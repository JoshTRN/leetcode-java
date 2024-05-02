package dev.leetcode.problems.ContainerWithMostWater;

import static dev.leetcode.problems.containerWithMostWater.ContainerWithMostWater.maxArea;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class ContainerWithMostWaterTests {

  @Test
  void maxAreaIs49() {
    var result = maxArea(new int[] { 1, 8, 6, 2, 5, 4, 8, 3, 7 });
    assertTrue(result == 49);
  }

  @Test
  void maxAreaIs1() {
    var result = maxArea(new int[] { 1,1});
    assertTrue(result == 1);
  }

}
