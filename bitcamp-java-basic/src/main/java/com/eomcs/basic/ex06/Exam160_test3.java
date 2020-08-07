// 조건문
package com.eomcs.basic.ex06;

public class Exam160_test3 {
  public static void main(String[] args) {
        int Hsum = 0;
        int Jsum = 0;

        for (int i = 1; i <= 10; i++) {
          if ((i % 2) == 0) {
            Jsum += i;
          } else {
            Hsum +=i;
          }
        }

        System.out.println("1부터 10까지의 짝수의 합 :" + Jsum);
        System.out.println("1부터 10까지의 홀수의 합 :" + Hsum);
  }
}
