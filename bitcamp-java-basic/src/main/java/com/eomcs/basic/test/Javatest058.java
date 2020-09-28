// 중첩 for문을 이용하여 방적식 4x + 5y = 60 모든 해를 구하라.
package com.eomcs.basic.test;

public class Javatest058 {
  public static void main(String[] args) {

    for (int x = 0; x <= 10; x++) {
      for (int y = 0; y <= 10; y++) {
        if ((4 * x) + (5 * y) == 60) {
          System.out.printf("%d, %d\n", x, y);
          break;
        }
      }
    }
  }
}