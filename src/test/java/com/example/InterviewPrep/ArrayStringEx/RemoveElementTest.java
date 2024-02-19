package com.example.InterviewPrep.ArrayStringEx;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class RemoveElementTest {
  RemoveElement remover = new RemoveElement();

  @Test
  void ShouldSuccess() {
    int[] nums = {3,2,2,3};
    int[] expected = {2, 2, 0, 0};
    int val = 3;

    int k = remover.removeElement(nums, val);
    assertEquals(2, k);
    assertArrayEquals(expected, nums);
  }

  @Test
  void ShouldSuccess2() {
    int[] nums = { 0, 1, 2, 2, 3, 0, 4, 2};
    int[] expected = {0, 1, 4, 0, 3, 0, 0, 0};
    int val = 2;

    int k = remover.removeElement(nums, val);
    assertEquals(5, k);
    assertArrayEquals(expected, nums);
  }

  @Test
  void ShouldSuccess_OnLength1() {
    int[] nums = { 1 };
    int[] expected = { 0 };
    int val = 1;

    int k = remover.removeElement(nums, val);
    assertEquals(0, k);
    assertArrayEquals(expected, nums);
  }
}
