package com.eomcs.basic.test;

import java.util.Arrays;

// 배열의 데이터를 정렬하자.

public class Javaclass027 {
  public static void main(String[] args) {
    int a[] = {210, 19, 72, 129, 34}; // a에 해당 배열을 넣음

    Arrays.sort(a);

    for (int i : a) {
      System.out.println("[" +i+ "]");
    }
  }
}
