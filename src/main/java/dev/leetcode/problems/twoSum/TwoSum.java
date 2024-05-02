package dev.leetcode.problems.twoSum;

import java.util.HashMap;

class TwoSum {
  public static int[] twoSum(int[] nums, int target) {
    var map = new HashMap<Integer, Integer>();

    for (var i = 0; i < nums.length; i++) {
      var difference = target - nums[i];
      if (map.containsKey(difference))
        return new int[] { map.get(difference), i };
      else
        map.put(nums[i], i);

    }
    return new int[] {};
  }

}
