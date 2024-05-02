package dev.leetcode.problems.containerWithMostWater;

public class ContainerWithMostWater {
    public static int maxArea(int[] height) {
    var max = 0;
    var l = height.length;
    if (l == 0 || l == 1)
      return max;

    var left = 0;
    var right = l - 1;

    while (left < right) {
      var currentMax = Math.min(height[left], height[right]) * (right - left);
      max = Math.max(max, currentMax);
      if (height[left] <= height[right])
        left++;
      else
        right--;
    }

    return max;

  }


}
