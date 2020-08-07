package com.eomcs.basic.util;

 // 다른 파일에 소스 공개를 위해 public 기재
public class Calculator {

  // 리턴값이 없는 메소드의 리턴 타입은 void로 기술
  public void powerOn() {
    System.out.println("전원을 켭니다.");
  }

  // 값을 리턴해야하기때문에 매개변수 = result 가 필요
  public int plus(int x, int y) {
    int result = x + y;
    return result;
  }

  public double divide(int x, int y) {
    double result = (double) x / (double) y;
    return result;
  }

  public void powerOff() {
    System.out.println("전원을 끕니다.");
  }

}
