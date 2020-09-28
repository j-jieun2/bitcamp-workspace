// 별찍기
package com.eomcs.basic.test;

public class Javatest059 {
  public static void main(String[] args) {

    for (int i = 1; i <= 4; i++) {
      for (int y = 1; y <= i; y++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}