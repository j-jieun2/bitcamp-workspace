//
package com.eomcs.basic.test;

import java.util.Scanner;

public class Javatest055 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("입력? ");
    int a = sc.nextInt();
    System.out.print("입력? ");
    int b = sc.nextInt();
    System.out.printf("%d %d", a, b);
  }
}