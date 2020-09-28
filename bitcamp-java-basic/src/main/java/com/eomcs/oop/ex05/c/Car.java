// 기존의 Car 클래스에 코드를 추가했다.
package com.eomcs.oop.ex05.c;

public class Car {
  public String model;
  public String maker;
  public  int capacity;

  public Car() {
    // 생성자
  }

  public Car(String model, String maker, int capacity) { // 파라미터 생성자
    this.model = model;
    this.maker = maker;
    this.capacity = capacity;
  }
}
