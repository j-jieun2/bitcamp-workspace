package com.eomcs.oop.ex04;

import java.util.Calendar;
import java.util.Date;

public class Exam120 {
  public static void main(String[] args) throws Exception {

    Date d1 = new Date(); // 실행하는 시점의 날짜와 시분초로 초기화시킨다.
    System.out.println(d1.toString());
    System.out.println(d1); // d1.toString()
    // 아규먼트가 primitive type 이나 String 타입이 아니면
    // 인스턴스에 대해 toString()을 호출하여 그 리턴 값을 출력한다.

    int[] arr = new int[] {100, 200, 300};
    System.out.println(arr.toString());
    System.out.println(arr); // arr.toString()

    int a = 100;
    System.out.println(a);

    Date d2 = new Date(100000);
    System.out.println(d2);

    Date d3 = new Date(120, 8, 10);
    System.out.println(d3);

    // 클래스 중에서는 생성자를 공개하지 않은 경우가 있다.
    // 이런 생성자에 인스턴스를 만들려면 보통 다음 2가지 방법을 사용한다.
    // 1) 다른 클래스의 도움을 받는다.
    // 2) 해당 클래스에서 제공하는 클래스 메서드(스태틱 메서드)를 사용한다.
    // Calendar c1 = new Calendar();
    Calendar c1 = Calendar.getInstance();
    System.out.println(c1); // c1.toString()

    Car car1 = new Car();
    Car car2 = new Car();
    System.out.println(car1 == car2);

    car1.model = "티코";
    car1.cc = 980;
    car2.model = "소나타";
    car2.cc = 1980;
    System.out.println(car1.model);
    System.out.println(car2.model);

    // Car2 car3 = new Car2();
    Car2 car3 = Car2.getInstance();
    Car2 car4 = Car2.getInstance();
    System.out.println(car3 == car4);
    car3.model = "비트카";
    System.out.println(car4.model);
  }
}
class Car {
  String model;
  int cc;
}


class Car2 {
  String model;
  int cc;
  static Car2 obj;

  private Car2() {}

  static Car2 getInstance() {
    // 보통 생성자를 private으로 막는 경우는
    // 인스턴스를 한 개만 생성하도록 제한하고 싶을 때이다.
    if (obj == null) { // 만약 obj==null이면 새로운 Car2를 만들어라.
      obj = new Car2();
    }
    return obj;
  }
}
