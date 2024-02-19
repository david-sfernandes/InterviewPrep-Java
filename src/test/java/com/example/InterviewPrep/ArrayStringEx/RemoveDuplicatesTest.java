package com.example.InterviewPrep.ArrayStringEx;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.InterviewPrep.utils.Slicer;

@SpringBootTest
public class RemoveDuplicatesTest {
  RemoveDuplicates remove = new RemoveDuplicates();

  @Test
  void ShouldSucess() {
    int[] nums = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
    int k = remove.better_removeDuplicates(nums);
    assertEquals(5, k);
    assertArrayEquals(new int[] { 0, 1, 2, 3, 4 }, Slicer.slice(nums, 0, k));
  }

  @Test
  void ShouldSucess_2() {
    int[] nums = { 1, 1, 2 };
    int k = remove.better_removeDuplicates(nums);
    assertEquals(2, k);
    assertArrayEquals(new int[] { 1, 2 }, Slicer.slice(nums, 0, k));
  }
}
