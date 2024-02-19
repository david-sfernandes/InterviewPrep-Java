package com.example.InterviewPrep.utils;

import java.util.stream.IntStream;

public class Slicer {
  public static int[] slice(int[] arr, int start, int end) {
    int[] slice = IntStream
        .range(start, end)
        .map(i -> arr[i])
        .toArray();
    return slice;
  }
}
