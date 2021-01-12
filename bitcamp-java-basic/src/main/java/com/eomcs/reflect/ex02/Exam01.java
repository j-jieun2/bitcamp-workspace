// 클래스 정보 추출 - 클래스 이름 알아내기
package com.eomcs.reflect.ex02;

public class Exam01 {

  public static void main(String[] args) throws Exception {
    // 1) 패키지 멤버 클래스
    Class<?> clazz = Class.forName("java.lang.String");

    // 클래스의 타입 객체를 통해 클래스 정보를 추출할 수 있다.
    System.out.println(clazz.getSimpleName()); // String
    System.out.println(clazz.getName()); // java.lang.String
    System.out.println(clazz.getCanonicalName()); // java.lang.String
    System.out.println(clazz.getTypeName()); // java.lang.String

    // 2) 중첩 클래
    Class<?> clazz2 = Class.forName("java.lang.String");

    // 클래스의 타입 객체를 통해 클래스 정보를 추출할 수 있다.
    System.out.println(clazz.getSimpleName()); // String
    System.out.println(clazz.getName()); // java.lang.String
    System.out.println(clazz.getCanonicalName()); // java.lang.String
    System.out.println(clazz.getTypeName()); // java.lang.String

    // 3) 익명 클래스
    Class<?> clazz3 = Class.forName("java.lang.String"); // 익명 클래스의 인스턴스로부터 클래스 정보 추출

    // 클래스의 타입 객체를 통해 클래스 정보를 추출할 수 있다.
    System.out.println(clazz.getSimpleName()); //
    System.out.println(clazz.getName()); // com.eomcs.reflect.ex02.Exam01$1
    System.out.println(clazz.getCanonicalName()); // null
    System.out.println(clazz.getTypeName()); // com.eomcs.reflect.ex02.Exam01$1


  }

}
