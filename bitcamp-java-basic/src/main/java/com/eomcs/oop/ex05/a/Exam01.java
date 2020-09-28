// 상속 - 사용 전
package com.eomcs.oop.ex05.a;

public class Exam01 {
  public static void main(String[] args) {
    Car c1 = new Car(); // Car()이라는 배열을 Heap에 생성하여 해당 주소를 c1에 넣음
    c1.maker = "비트자동차";
    c1.model = "티코";
    c1.capacity = 5;

    Car c2 = new Car("비트자동차", "소나타", 5);
  }
}
