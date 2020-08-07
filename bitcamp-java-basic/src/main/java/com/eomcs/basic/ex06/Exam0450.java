// 반복문(for)
package com.eomcs.basic.ex06;

import java.util.ArrayList;
import java.util.Date;

public class Exam0450 {
  public static void main(String[] args) {

    ArrayList scores = new ArrayList();
    scores.add(100);
    scores.add(90);
    scores.add(80);
    scores.add(70);
    scores.add(60);
    scores.add(new Date());

    for (int i = 0; i < scores.size(); i++) {
      // (Object value : scores) {
      // Sytem.out.println(value);
      System.out.println(scores.get(i));
    }

//    loop:
//      for (int i = 2; i <= 9; i++) {
//        for (int j = 1; j <= 9; j++) {
//          System.out.printf("%d x %d = %d\n", i, j, i * j);
//          if (i == 5 && j == 5) {
//            continue loop;
//        }
//      }
//        System.out.println("-------------------------------");
//    }


//    int[] scores = new int[5];
//    scores[0] = 100;
//    scores[1] = 90;
//    scores[2] = 80;
//    scores[3] = 70;
//    scores[4] = 60;
//
//    for (int value : scores) {
//      // for (int i = 0; i < scores.length; i++) {
//      // int value = scores[i] }
//      System.out.println(value);
//    }



  }
}
