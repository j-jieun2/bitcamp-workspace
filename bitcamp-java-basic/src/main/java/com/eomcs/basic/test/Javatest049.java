// 중첩 for문을 이용하여 방적식 4x + 5y = 60의 모든 해를 구해서 (x, y)로 출력하라.
// 단 x, y는 10 이하의 자연수

package com.eomcs.basic.test;

public class Javatest049 {
  public static void main(String[] args) {
    int num1 = 4;
    int num2 = 5;

    for (int x = 0; x <= 10; x++) {
      for (int y = 0; y <= 10; y++) {
        if (((num1 * x) + (num2 * y)) == 60) {
          System.out.println("(x: " + x + " , y: " + y + ")");
        }
      }
    }
  }
}