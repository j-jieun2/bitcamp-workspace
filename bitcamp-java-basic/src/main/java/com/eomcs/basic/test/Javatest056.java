// for문을 이용해서 1부터 100까지의 정수 중 3배수의 총합을 구하는 코드
package com.eomcs.basic.test;

public class Javatest056 {
  public static void main(String[] args) {
    int sum = 0;

    for (int i = 1; i <= 100; i++) {
      if (i % 3 == 0) {
        sum += i;
      }
    }
    System.out.println(sum);
  }
}