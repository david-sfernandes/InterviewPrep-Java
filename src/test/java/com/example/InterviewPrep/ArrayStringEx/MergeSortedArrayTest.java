package com.example.InterviewPrep.ArrayStringEx;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MergeSortedArrayTest {
  MergeSortedArray mergeSortedArray = new MergeSortedArray();

  @Test
  void ShouldSuccess_ToMerge() {
    int[] nums1 = { 1, 2, 3, 0, 0, 0 };
    int[] nums2 = { 2, 5, 6 };
    int[] expected = { 1, 2, 2, 3, 5, 6 };

    mergeSortedArray.better_merge(nums1, 3, nums2, 3);

    assertArrayEquals(expected, nums1);
  }

  @Test
  void ShouldSuccess_WhenNIsZero() {
    int[] nums1 = { 1 };
    int[] nums2 = {};

    mergeSortedArray.better_merge(nums1, 1, nums2, 0);

    assertArrayEquals(nums1, new int[] { 1 });
  }

  @Test
  void ShouldSuccess_WhenMIsZero() {
    int[] nums1 = { 0 };
    int[] nums2 = { 1 };

    mergeSortedArray.better_merge(nums1, 0, nums2, 1);

    assertArrayEquals(nums1, new int[] { 1 });
  }
}
