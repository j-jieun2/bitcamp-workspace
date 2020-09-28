//
package com.eomcs.basic.test;

import java.util.Scanner;

public class Javatest067 {
  public static void main(String[] args) {
    boolean run = true;
    int studentNum = 0;
    int[] scores = null;
    Scanner scanner = new Scanner(System.in);

    while (run) {
      System.out.println("--------------------------------------------------------------");
      System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
      System.out.println("--------------------------------------------------------------");
      System.out.print("선택> ");

      int selectNo = Integer.parseInt(scanner.nextLine());

      if (selectNo == 1) {
        System.out.print("학생수> ");
        studentNum = Integer.parseInt(scanner.nextLine());
        scores = new int[studentNum];
      } else if (selectNo == 2) {
        System.out.print("점수입력> ");
        for (int i = 0; i < scores.length; i++) {
          System.out.println("scores [" + i + "]");
          scores[i] = Integer.parseInt(scanner.nextLine());
        }
      }

    }
  }
}