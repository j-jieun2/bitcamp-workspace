// 조건문
package com.eomcs.basic.ex06;

public class Exam160_test4 {
  public static void main(String[] args) {
    int a[][] = new int[3][3]; // 0,1,2 / 0,1,2

    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a[i].length; j++) {a[i][j] = i * 10 +2;
        System.out.println("a[" + i + "][" + j + "] =" + a[i][j]);
      }
    }
  }
}
