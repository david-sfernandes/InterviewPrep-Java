package com.example.InterviewPrep.ArrayStringEx;

// From challeng: 
// https://leetcode.com/problems/merge-sorted-array/?envType=study-plan-v2&envId=top-interview-150
public class MergeSortedArray {
  // Version I build
  void merge(int[] nums1, int m, int[] nums2, int n) {
    if (n == 0) return;

    int[] merged = new int[m + n];
    int nums1Pos, nums2Pos;
    nums1Pos = nums2Pos = 0;

    for (int i = 0; i < (m + n); i++) {
      if (nums1[nums1Pos] < nums2[nums2Pos] && nums1[nums1Pos] != 0)
        merged[i] = nums1[nums1Pos++];
      else
        merged[i] = nums2[nums2Pos++];
    }
    System.arraycopy(nums1, 0, merged, 0, (m + n));
  }

  // Version from:
  // https://leetcode.com/problems/merge-sorted-array/solutions/29503/Beautiful-Python-Solution/comments/28606
  void better_merge(int[] nums1, int m, int[] nums2, int n) {
    while (n > 0) {
      if (m <= 0 || nums2[n - 1] >= nums1[m - 1])
        nums1[m + n - 1] = nums2[--n];
      else
        nums1[m + n - 1] = nums1[--m];
    }
  }
}
