package com.eomcs.basic.test;

public class Javaclass021 {
  static class Car {
    // 생성자
    Car(String color, int cc) {

    }
  }
  public static void main(String[] args) {
    Car myCar = new Car("검정", 3000);
    // Car myCar = new Car(); 기본 생성자는 호출할 수 없음!
    }
}
