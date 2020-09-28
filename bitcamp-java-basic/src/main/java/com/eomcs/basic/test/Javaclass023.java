package com.eomcs.basic.test;

public class Javaclass023 {

  static class Car {
    // 필드
    String company = "현대자동차";
    String model;
    String color;
    int maxSpeed;

    // 생성자
    Car() {
    }

    // 생성자
    Car(String model) {
      this.model = model;
    }

    // 생성자
    Car(String model, String color) {
      this.model = model;
      this.color = color;
    }

    // 생성자
    Car(String model, String color, int maxSpeed) {
      this.model = model;
      this.color = color;
      this.maxSpeed = maxSpeed;
    }
  }
  public static void main(String[] args) {
    Car car1 = new Car(); // 생성자 선택
    System.out.println("car1.company: " + car1.company);
    System.out.println();

    Car car2 = new Car("자가용"); // 생성자 선택
    System.out.println("car2.company: " + car2.company);
    System.out.println("car2.model: " + car2.model);
    System.out.println();

    Car car3 = new Car("자가용", "빨강"); // 생성자 선택
    System.out.println("car3.company: " + car3.company);
    System.out.println("car3.model: " + car3.model);
    System.out.println("car3.color: " + car3.color);
    System.out.println();

    Car car4 = new Car("택시", "검정", 200); // 생성자 선택
    System.out.println("car4.company: " + car4.company);
    System.out.println("car4.model: " + car4.model);
    System.out.println("car4.color: " + car4.color);
    System.out.println("car4.maxSpeed: " + car4.maxSpeed);
    System.out.println();

    }
}
