package com.example.InterviewPrep.ArrayStringEx;

// From challenge: 
// https://leetcode.com/problems/merge-sorted-array/?envType=study-plan-v2&envId=top-interview-150
public class RemoveElement {
  public int removeElement(int[] nums, int val) {
    int k = nums.length - 1;
    for (int i = 0; i < k; i++) {
      if (nums[i] != val)
        continue;
      nums[i--] = nums[k];
      nums[k--] = 0;
    }
    return k + 1;
  }
}
