// while문과 Math.ramdom() 메소드를 이용하여 눈의 합이 5가되면 실행을 멈추는 코드 작성
package com.eomcs.basic.test;

public class Javatest057 {
  public static void main(String[] args) {

    while (true) {
      int r1 = (int) (Math.random() * 6) + 1;
      int r2 = (int) (Math.random() * 6) + 1;
      System.out.println(r1 + ", " + r2);
      if (r1 + r2 == 5) {
        break;
      }
    }
    System.out.println("프로그램 종료");
  }
}