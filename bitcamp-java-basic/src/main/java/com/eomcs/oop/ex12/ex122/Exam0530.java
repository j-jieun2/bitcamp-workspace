// 메서드 레퍼런스 - 스태틱 메서드 레퍼런스
package com.eomcs.oop.ex12.ex122;

public class Exam0530 {

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

  static interface Calulator1 {
    double computer(int a, int b);
  }

  static interface Calulator2 {
    float computer(int a, int b);
  }

  static interface Calulator3 {
    short computer(int a, int b);
  }

  static interface Calulator4 {
    void computer(int a, int b);
  }

  static interface Calulator5 {
    Object computer(int a, int b);
  }

  static interface Calulator6 {
    String computer(int a, int b);
  }

  public static void main(String[] args) {

    // 리턴 타입 int ===> double
    Calulator1 c1 = MyCalulator::plus; // ok
    //    Calulator1 c1 = new Calulator1() {
    //      @Override
    //      public double computer(int a, int b) {
    //        return a + b;
    //      }
    //    };
    System.out.println(c1.computer(100, 200));

    // 리턴 타입 int ===> float
    Calulator2 c2 = MyCalulator::plus; // ok
    //    Calulator2 c2 = new Calulator2() {
    //      @Override
    //      public float computer(int a, int b) {
    //        return a + b;
    //      }
    //    };
    System.out.println(c2.computer(100, 200));

    // 리턴 타입 int ===> short
    // Calulator3 c3 = MyCalulator::plus; // 컴파일 오류!
    //    Calulator3 c3 = new Calulator3() {
    //      @Override
    //      public short computer(int a, int b) {
    //        return a + b;
    //      }
    //    };

    // 리턴 타입 int ===> void
    Calulator4 c4 = MyCalulator::plus; // ok
    //    Calulator4 c4 = new Calulator4() {
    //      @Override
    //      public void computer(int a, int b) {
    //        MyCalulator.plus(a, b);
    //      }
    //    };
    c4.computer(100, 200); // plus() 메서드의 리턴 값은 무시한다.

    // 리턴 타입 int ===> Object
    Calulator5 c5 = MyCalulator::plus; // ok
    //    Calulator5 c5 = new Calulator5() {
    //      @Override
    //      public Object computer(int a, int b) {
    //        return MyCalulator.plus(a, b);
    //      이유? plus()가 리턴한 int 값이 오토박싱 되기 때문이다.
    //      }
    //    };
    System.out.println(c5.computer(100, 200));

    // 리턴 타입 int ===> String
    //    Calulator6 c6 = MyCalulator::plus; // 컴파일 오류!
    //    Calulator6 c6 = new Calulator6() {
    //      @Override
    //      public String computer(int a, int b) {
    //        return MyCalulator.plus(a, b);
    //      }
    //    };


    // => 메서드 레퍼런스를 지정할 때 리턴 타입의 규칙:
    // 1) 같은 리턴 타입
    // 2) 암시적 형변환 가능한 타입
    // 3) auto-boxing 가능한 타입
    // 4) void
    // 결론,
    // 메서드 레퍼런스가 가리키는 실제 메서드를 호출한 후
    // 그 메서드가 리턴한 값이
    // 인터페이스에 정의된 메서드의 리턴 값으로 사용할 수 있다면
    // 문제가 없다.
    //
  }
}
