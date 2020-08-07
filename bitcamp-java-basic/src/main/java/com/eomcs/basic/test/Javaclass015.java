package com.eomcs.basic.test;

import java.util.Scanner;

/* 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
 * 첫째 줄에 테스트 케이스의 개수 T가 주어진다.
 * 각 테스트 케이스는 한 줄로 이루어져 있으며,
 * 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
 * 각 테스트 케이스마다 A+B를 출력한다.
 * 예제1)
 * 5
 * 1 1
 * 2 3
 * 3 4
 * 9 8
 * 5 2
 */
public class Javaclass015 {
  public static void main(String[] args) {
    Scanner keyInput = new Scanner(System.in);

    System.out.print("입력? ");
    int T = keyInput.nextInt();

    for (int i = 0; i < T; i++) {
      System.out.print("입력? ");
      int A = keyInput.nextInt();
      System.out.print("입력? ");
      int B = keyInput.nextInt();
      System.out.println(A + B);
    }

  }
}