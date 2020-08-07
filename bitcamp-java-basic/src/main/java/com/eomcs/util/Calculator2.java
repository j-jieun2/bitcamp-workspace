package com.eomcs.util;

public class Calculator2 {

  // 클래스 메소드
  // 외부에 메모리가 필요없을 경우 static을 붙임
  //    - Date.valueOf("");
  //    - System.cummtTimeMils();
  // 인스턴스(변수목록) 메소드
  // 클래스에 정의된 변수 목록. (static이 붙지않음)
  // heap에 메모리가 있고 메모리가 필요할 경우
  //    - c1.plus(100);
  //    c1 - 변수 / 100 - 값;
  // void는 리턴값이 필요없을 경우 붙인다.

    public int result = 0;

    public void plus(int value) {
      this.result += value;
    }

    public void minus( int value) {
      this.result -= value;
    }

    public void multiple(int value) {
      this.result *= value;
    }

    public void divide(int value) {
      this.result /= value;
    }
  }
