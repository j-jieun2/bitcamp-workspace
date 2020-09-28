// while문과 Math.random() 메소드를 이용하여 2개의 주사위를 던졌을 때 나오는 눈을 출력
// 합이 5가 아니면 계속 주사위를 던지고, 합이 5면 실행을 멈춰라.
// (1, 4) (4, 1) (2, 3) (3, 2)

package com.eomcs.basic.test;

public class Javatest048 {
  public static void main(String[] args) {


    while(true) {
      int r = (int) (Math.random() * 6) + 1;
      int i = (int) (Math.random() * 6) + 1;
      System.out.println("(" + r + ", " + i + ")");
      if ((i + r) == 5) {
        break;
      }
    }
  }
}