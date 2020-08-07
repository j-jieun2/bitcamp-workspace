// 반복문: while (조건) 문장;
// do 문장 while(조건);
package com.eomcs.basic.ex06;

public class Exam0322 {
  public static void main(String[] args) {
    int count = 0;
    int sum = 0;

 // 1부터 100까지의 카운트를 하는데 단 합은 50까지만 계산한다.
    count = 0;
    sum = 0;

    while (count < 100) {
      count++;
      if (count > 50)
        sum += count;
    }
    System.out.printf("count%d, sum%d\n", count,sum);
    System.out.println("----------------------------");


    count = 0;
    sum = 0;
    while (count < 100) {
      count++;
      if (count > 50) // 50을 넘어가면 합을 수행하지 않지만 100까지 계속 반복한다.
        break;
      sum += count;
    }
    System.out.printf("count=%d, sum%d\n", count, sum);
  }
}
