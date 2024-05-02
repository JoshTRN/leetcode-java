package dev.leetcode.problems.containsDuplicate;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
  public static boolean containsDuplicate(int[] nums) {
    return Arrays.stream(nums)
        .boxed()
        .collect(HashSet::new, Set::add, Set::addAll)
        .size() != nums.length;
  }
}
