// * 출력..

package com.eomcs.basic.test;

public class Javatest050 {
  public static void main(String[] args) {

    for (int i = 1; i < 5; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
        // i = 1, j = 1 경우 * 출력.
        // i = 2, j = 2 경우 ** 출력

        if (j == i) {
          System.out.println();
        }
      }
    }
  }
}