// 메서드 레퍼런스 - 스태틱 메서드 레퍼런스 구현 원리
package com.eomcs.oop.ex12.ex122;

public class Exam0520 {

  static class MyCalulator {
    public static int plus(int a, int b) {
      return a + b;
    }

    public static int minus(int a, int b) {
      return a - b;
    }

    public static int multiple(int a, int b) {
      return a * b;
    }

    public static int divide(int a, int b) {
      return a / b;
    }
  }

  static interface Calulator {
    int computer(int a, int b);
  }

  public static void main(String[] args) {
    // 스태틱 메서드 레퍼런스로 Calculator 구현체를 만드는 방법
    //
    // Calculator c1 = MyCalculator::plus;

    // 위의 코드는 내부적으로 다음과 같다.
    //
    Calulator c1 = new Calulator() {
      @Override
      public int computer(int a, int b) {
        // 기존 메서드가 메서드 레퍼런스로 전달 가능한지 여부는
        // 다음 코드를 참고하라.
        // 인터페이스에 정의된 메서드(예: compute())가 호출되었을 때,
        //
        // 그 파라미터 값은 메서드 레퍼런스로 지정된
        // 스태틱 메서드(예: plus())에게 전달될 것이다.
        // => 그래서 스태틱 메서드의 파라미터는 항상
        // 인터페이스 메서드에 정의된 파라미터 값을 받을 수 있어야 한다.
        //
        // 스태틱 메서드의 리턴 값은
        // 인터페이스 메서드에 정의된 대로 리턴할 수 있어야 한다.
        // => 그래서 스태틱 메서드의 리턴 타입은
        // 인터페이스 메서드의 리턴 타입과 일치하거나
        // 그 타입으로 바꿀 수 있어야 한다.
        //
        return MyCalulator.plus(a, b);
      }
    };

    System.out.println(c1.computer(100, 16));
  }
}
