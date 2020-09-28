// 기존의 Car 클래스에 코드를 추가했다.
package com.eomcs.oop.ex05.b;

public class Car {
  public String model;
  public String maker;
  public  int capacity;
  boolean sunroof;
  boolean auto;

  public Car() {
    // 생성자
  }

  // 이전 프로그램(ex1.Exam01)에서 다음 생성자를 사용하기 때문에
  // 이 생성자에 파라미터를 덧붙일 수는 없다.
  public Car(String model, String maker, int capacity) { // 파라미터 생성자
    this.model = model;
    this.maker = maker;
    this.capacity = capacity;
  }

  // 새로운 생성자를 추가해야 한다.

  public Car(String model, String maker, int capacity,
      boolean sunroof, boolean auto) {
    this(model, maker, capacity);

    this.sunroof = sunroof;
    this.auto = auto;
  }
}
