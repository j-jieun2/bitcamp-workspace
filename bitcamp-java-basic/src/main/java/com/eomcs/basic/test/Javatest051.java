// * 출력..

package com.eomcs.basic.test;

import java.util.Scanner;

public class Javatest051 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("입력 ?");
    int N = sc.nextInt();
    sc.close();

    for (int i = 1; i <= N; i++) {
      for (int y = 1; y <= N - i; ++y) {
        System.out.print(" ");
      }
      for (int y = 1; y <= i; y++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}