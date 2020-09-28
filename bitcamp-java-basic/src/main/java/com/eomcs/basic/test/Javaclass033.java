package com.eomcs.basic.test;

public class Javaclass033 {
  // 싱글톤
  // 전체 프로그램에서 단 하나의 객체만 만들도록 보장해야하는 경우가 있다.
  // 싱글톤을 만들려면 클래스 외부에서 new 연산자로 호출할 수 없도록 막아야한다.

  static class ShopService {
    // 정적 필드
    private static ShopService shopservice = new ShopService();

    // 생성자
    private ShopService() {}

    // 정적 메소드
    static ShopService getInsatance() {
      return shopservice;
    }
  }
  public static void main(String[] args) {

    ShopService obj1 = ShopService.getInsatance();
    ShopService obj2 = ShopService.getInsatance();

    if (obj1 == obj2) {
      System.out.println("같은 ShopService 객체입니다.");
    } else {
      System.out.println("다른 ShopService 객체입니다.");
    }
  }
}

/* 정적 멤버는 static 으로 선언된 필드와 메소드를 말한다. o
 * 인스턴스 필드는 생성자에서 초기화될 수 없다. x  - 생성자에서 초기화 가능
 * 정적 필드와 메소드는 객체 생성 없이 클래스를 통해 접근할 수 있다. o
 * 인스턴스 필드와 메소드는 객체를 생성하고 사용해야 한다. o
 *
 * final 필드와 상수는 초기값이 저장되면 값을 변경할 수 없다. o
 * final 필드와 상수는 생성자에서 초기화 될 수 있다. x - 불가, 필드에서 초기화 되어야함.
 * 상수의 이름은 대문자로 작성하는 것이 관례이다. o
 * 상수는 객체 생성 없이 클래스를 통해 사용할 수 있다. o
 *
 *
 *
 */
