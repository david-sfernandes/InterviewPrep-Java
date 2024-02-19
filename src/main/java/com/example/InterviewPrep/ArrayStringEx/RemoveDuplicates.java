package com.example.InterviewPrep.ArrayStringEx;

public class RemoveDuplicates {
  public int removeDuplicates(int[] nums) {
    int k = 1;
    int i = 0;
    int temp = nums[0];
    while (k < nums.length) {
      if (nums[k] <= temp) {
        k++;
      } else {
        nums[++i] = nums[k];
        temp = nums[k];
        k = i + 1;
      }
    }
    return i + 1;
  }

  public int better_removeDuplicates(int[] nums) {
    int k = 1;
    for (int i = 1; i < nums.length; i++)
      if (nums[i] != nums[i - 1])
        nums[k++] = nums[i];
    return k;
  }

}
