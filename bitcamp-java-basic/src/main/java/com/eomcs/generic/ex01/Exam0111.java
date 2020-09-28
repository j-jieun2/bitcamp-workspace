// 제네릭(Generic) - 사용 전: 다형적 변수 활용
package com.eomcs.generic.ex01;

public class Exam0111 {

  // 다양한 객체를 저장하는 Box를 만들기 위해
  // 인스턴스의 변수 타입을 Object로 선언한다.
  // => 그러면 다음과 같이 한 개의 Box 클래스만 정의하면 된다.
  //

  static class ObjectBox {
    Object value;

    public Object get() {
      return value;
    }

    public void set(Object value) {
      this.value = value;
    }
  }
  public static void main(String[] args) {

    ObjectBox box1 = new ObjectBox();
    box1.set(new Member("홍길동", 20)); // 값 저장
    Member m = (Member) box1.get(); // 값을 꺼낼 때 형변환해야 한다.
    System.out.println(m);

    ObjectBox box2 = new ObjectBox();
    box2.set(new String("Hello"));
    String str = (String) box2.get();
    System.out.println(str);

    ObjectBox box3 = new ObjectBox();
    box3.set(100); // Integer.value 생략 되어있음
    int i = (int) box3.get();
    System.out.println(i);


  }
}
