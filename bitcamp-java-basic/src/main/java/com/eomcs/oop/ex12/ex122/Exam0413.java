// 리턴 문장에 람다(lambda) 활용
package com.eomcs.oop.ex12.ex122;

public class Exam0413 {

  static interface Interest {
    double computer(int money);
  }

  static Interest getInterest(final double rate) {
    // 익명 클래스로 인터페이스 구현한 후 객체 리턴하기
    Interest i = new Interest() {
      @Override
      public double computer(int money) {
        return money + (money * rate / 100);
      }
    };
    return i;
  }

  public static void main(String[] args) {
    Interest i1 = getInterest(1.5);
    System.out.printf("금액: %.2f\n", i1.computer(1_0000_0000));

    Interest i2 = getInterest(2.5);
    System.out.printf("금액: %.2f\n", i2.computer(1_0000_0000));
  }
}
