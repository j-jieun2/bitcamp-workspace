// 반복문: while (조건) 문장;
// do 문장 while(조건);
package com.eomcs.basic.ex06;

public class Exam0320 {
  public static void main(String[] args) {
    int count = 0;
    int sum = 0;

    while (count < 100) {
      sum += ++count;
    }
    System.out.printf("count=%d, sum=%d\n", count,sum);
  }
}
