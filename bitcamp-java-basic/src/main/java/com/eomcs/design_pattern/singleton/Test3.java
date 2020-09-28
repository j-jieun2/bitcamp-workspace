// Singleton 연습: 김밥 인스턴스를 한 개만 생성하도록 Singleton 패턴을 적용하라.
package com.eomcs.design_pattern.singleton;

class Kimbap {
  // 클래스 안에 코드를 완성하시오.

  // 생성자
  private static Kimbap instance;

  // 1) 생성자를 정의하고 private으로 선언하여 비공개로 만들어라.
  // => 비공개 생성자를 외부에서 호출할 수 없다.
  // => 오직 내부에서만 호출할 수 있다.
  private Kimbap() {}

  // 메서드
  public static Kimbap getInstans() {
    if (Kimbap.instance == null) {
      // 아직 인스턴스를 생성한 적이 없다면 즉시 인스턴스를 생성한다.
      Kimbap.instance = new Kimbap();
    }
    // 기존에 변수에 저장된 인스턴스 주소를 리턴한다.
    return Kimbap.instance;
  }
}

public class Test3 {
  public static void main(String[] args) {
    // 다음 코드는 컴파일 오류를 발생시켜야 한다.
    Kimbap bap1 = new Kimbap();

    Kimbap bap2 = Kimbap.getInstans();
    Kimbap bap3 = Kimbap.getInstans();
    System.out.println(bap2 == bap3);

  }
}








