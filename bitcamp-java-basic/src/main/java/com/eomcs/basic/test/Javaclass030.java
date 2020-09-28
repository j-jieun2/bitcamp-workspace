package com.eomcs.basic.test;

public class Javaclass030 {
  int getMax(int...nums) {
    int max = 0;
    for (int i = 0; i < nums.length; i++) { // i < 3
      if (i == 0) { //만약 i가 0일 경우
        max = nums[0]; // max = 100
      }
      if (max < nums[i]) { // 100 < nums[i]
        max = nums[i];
      }
    }
    return max;
  }
  public static void main(String[] args) {

    Javaclass030 java = new Javaclass030();

    System.out.println("(100, 54, 1) 최댓값: " + java.getMax(100, 54, 1));

  }
}
