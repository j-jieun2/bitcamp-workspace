// String - 다형적 변수와 형변환
package com.eomcs.corelib.ex02.ex02_2;

public class Exam0142 {
  public static void main(String[] args) {

    Object obj = new String("Hello");

    // obj가 String 객체를 가르키더라도
    // obj 타입이 Object 이기 때문에 Objcet에 선언한 멤버(필드와 메서드)만 사용할 수 있다.
    // obj가 가리키는 원래 클래스의 메서드를 호출하고 싶다면
    // 다음과 같이 원래 타입으로 형변환하라.
    String str = ((String) obj).toLowerCase();
    System.out.println(str);

    // 또는 다음과 같이 원래 타입의 레퍼런스에 저장한 다음 사용하라.
    String x1 = (String) obj;
    str = x1.toLowerCase();
    System.out.println(str);
  }
}


