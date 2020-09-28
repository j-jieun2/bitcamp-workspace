// 메서드 레퍼런스 - 인스턴스 메서드 레퍼런스 구현 원리
package com.eomcs.oop.ex12.ex122;

public class Exam0620 {

  static class Calulator {
    double rate;

    public Calulator(double rate ) {
      this.rate = rate;
    }

    public double year(int money) {
      return money * rate / 100;
    }

    public double month(int money) {
      return money * rate / 100 / 12;
    }

    public double day(int money) {
      return money * rate / 100 / 365;
    }
  }

  static interface Interest {
    double computer(int money);
  }

  public static void main(String[] args) {

    Calulator 보통예금 = new Calulator(0.5);

    // 인스턴스 메서드 레퍼런스로 Calculator 구현체를 만드는 방법
    //
    // Iterest i1 = 보통예금::year;

    // 위의 코드는 내부적으로 다음과 같다.
    //
    Interest i1 = new Interest() {
      @Override
      public double computer(int money) {
        return 보통예금.year(money);
      }
    };

    System.out.printf("년 이자 : %.1f\n", i1.computer(10_0000_0000));
  }
}
