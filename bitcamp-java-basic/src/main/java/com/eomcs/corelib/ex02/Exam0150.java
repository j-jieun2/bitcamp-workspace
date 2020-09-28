// String - equals(), hashCode()
package com.eomcs.corelib.ex02;

public class Exam0150 {

  static class Member {
    // 필드
    String name;
    int age;

    // 생성자
    public Member(String name, int age) {
      this.name = name;
      this.age = age;
    }
  }

  public static void main(String[] args) {

    Member m1 = new Member("홍길동", 20);
    Member m2 = new Member("홍길동", 20);

    System.out.println(m1 == m2); // false, 서로 다른 인스턴스

    // Object로부터 상속 받은 hashCode()는 인스턴스 마다 고유의 해시값을 리턴한다.
    System.out.printf("%x, %x\n", m1.hashCode(), m2.hashCode());

    // Object로부터 상속 받은 toString()은 "클래스명@해시값"을 리턴한다.
    System.out.printf("%s, %s\n", m1.toString(), m2.toString());

    // Object로부터 상속 받은 equals()는 인스턴스가 같은지 검사한다.
    System.out.printf("%b\n", m1.equals(m2)); // false

    // Member는 오버로딩을 하지않음.
    System.out.println("-------------------------------------");

    String s1 = new String("Hello");
    String s2 = new String("Hello");

    System.out.println(s1 == s2); // false, 서로 다른 인스턴스

    // String 클래스는 Object로부터 상속 받은 hashCode()를 오버라이딩 했다.
    // => 문자열이 같으면 같은 해시값을 리턴하게 만들었다.
    System.out.printf("%x, %x\n", s1.hashCode(), s2.hashCode());

    // String 클래스는 Object로부터 상속 받은 toString()을 오버라이딩 했다.
    // => 스트링 인스턴스에 보관된 문자열을 리턴하도록 만들었다.
    System.out.printf("%s, %s\n", s1.toString(), s2.toString());

    // String 클래스는 Object로부터 상속 받은 equals()를 오버라이딩 했다.
    // => 문자열이 같은지를 비교하도록 만들었다.
    System.out.println(s1.equals(s2)); // true
  }
}
