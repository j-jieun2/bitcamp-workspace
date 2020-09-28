// 제네릭(Generic) - 사용 전
package com.eomcs.generic.ex01;

public class Exam0110 {

  // 제네릭 문법이 없다면 각 타입의 객체를 저장하기 위해
  // 다음과 같이 각 타입에 대한 클래스를 정의해야 한다.
  //
  static class MemberBox {
    Member value;

    public void set(Member value) {
      this.value = value;
    }

    public Member get() {
      return value;
    }
  }

  static class StringBox {
    String value;

    public void set(String value) {
      this.value = value;
    }

    public String get() {
      return value;
    }
  }

  static class IntegerBox {
    Integer value;

    public Integer get() {
      return value;
    }

    public void set(Integer value) {
      this.value = value;
    }
  }

  public static void main(String[] args) {

    // Member 객체를 저장하려면 MemberBox를 사용해야 한다.
    MemberBox box1 = new MemberBox();
    box1.set(new Member("홍길동", 20)); // 값 저장
    Member m = box1.get(); // 값 꺼내기
    System.out.println(m);

    StringBox box2 = new StringBox();
    box2.set(new String("Hello"));
    String str = box2.get();
    System.out.println(str);

    IntegerBox box3 = new IntegerBox();
    box3.set(100); // outo-boxing // Integer.valueOf 생략 되어있음
    int i = box3.get();
    System.out.println(i);
  }
}
