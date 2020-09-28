// 별찍기
package com.eomcs.basic.test;

public class Javatest060 {
  public static void main(String[] args) {

    for (int x = 1; x < 5; x++) {
      for (int y = 4; y > 0; --y) {
        if (x < y) {
          System.out.print(" ");
        } else {
          System.out.print("*");
        }
      }
      System.out.println();
    }
  }
}