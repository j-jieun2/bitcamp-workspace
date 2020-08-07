// 반복문: while (조건) 문장;
// do 문장 while(조건);
package com.eomcs.basic.ex06;

public class Exam0340 {
  public static void main(String[] args) {
    int i = 0;

    // 1부터 10까지 출력하기

    do
      System.out.println(++i);
    while (i < 10);

    System.out.println("-------------------------");

    i = 0;
    do {
      i += 1;
      System.out.println(i);
    } while (i < 10);

  }
}

/*
# do ~ while
- 최소 한 번은 반복한다.
- 한 번 이상 반복하면 do ~ while
- 0 번 이상 반복하면 while

  do
    문장1;
  while (조건);

  do {
    문장1;
    문장2;
    문장3;
  } while (조건);
 */

