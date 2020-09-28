// if~else

package com.eomcs.basic.test;

public class Javatest033 {
  public static void main(String[] args) {
    int score = 75;

    if (score >= 90) { // score가 100~90까지 일 경우
      System.out.println("점수가 100~90 입니다.");
      System.out.println("등급은 A입니다."); // 여기까지를 실행
    } else if (score >= 80) { // score가 90~80까지 일 경우
      System.out.println("점수가 80~89 입니다.");
      System.out.println("등급은 B입니다."); // 여기까지를 실행
    } else if (score >= 70) { // score가 80~70까지 일 경우
      System.out.println("점수가 70~79 입니다.");
      System.out.println("등급은 C입니다."); // 여기까지를 실행
    } else { // score가 69~ 일 경우
      System.out.println("점수가 70 미만입니다.");
      System.out.println("등급은 D입니다."); // 여기까지를 실행
    }
  }
}