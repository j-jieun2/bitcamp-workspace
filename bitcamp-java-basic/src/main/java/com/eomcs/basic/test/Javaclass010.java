package com.eomcs.basic.test;

import java.util.Scanner;

/* 두 정수 A와 B가 주어졌을 때, A와 B를 비교하는 프로그램을 작성하시오
 * 첫째 줄에 A와 B가 주어진다. A와 B는 공백 한 칸으로 구분되어져 있다.
 * 첫째 줄에 다음 세 가지 중 하나를 출력한다.
 * A가 B보다 큰 경우에는 '>'를 출력한다.
 * A가 B보다 작은 경우에는 '<'를 출력한다.
 * A와 B가 같은 경우에는 '=='를 출력한다.
 * 예제1) 1, 2 / <
 * 예제2) 10, 2 / >
 * 예제3) 5, 5 / ==
 */
public class Javaclass010 {
  public static void main(String[] args) {
    Scanner keyInput = new Scanner(System.in);

    System.out.print("입력? ");
    int A = keyInput.nextInt();
    System.out.print("입력? ");
    int B = keyInput.nextInt();

    if (A < B) {
      System.out.println("<");
    } if (A > B) {
      System.out.println(">");
    } if (A == B) {
      System.out.println("==");
    }
  }
}
