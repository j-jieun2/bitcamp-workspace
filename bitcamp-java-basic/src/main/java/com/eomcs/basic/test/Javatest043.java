// while문

package com.eomcs.basic.test;

public class Javatest043 {
  public static void main(String[] args) {
    int i = 0;
    while (i <= 10) {
      System.out.println(i);
      i++;
    }

    int sum = 0;
    int n = 1;

    while (n <= 100) {
      sum += n;
      n++;
    }

    System.out.println("1 ~ " + ( n - 1) + " 합: " + sum);

    while (true) {
      int num = (int) (Math.random() * 6) + 1;
      System.out.println(num);
      if (num == 6) {
        break;
      }
    }
    System.out.println("프로그램 종료");
  }
}