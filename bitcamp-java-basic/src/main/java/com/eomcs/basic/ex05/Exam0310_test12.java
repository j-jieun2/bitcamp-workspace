package com.eomcs.basic.ex05;


public class Exam0310_test12 {
  public static void main(String[] args) {

    // AND 연산자
    // 두개의 논리 값이 모두 true 일 때 결과가 true가 된다.
    System.out.println(true && true); // true
    System.out.println(true && false); // false
    System.out.println(false && true); // false
    System.out.println(false && false); //false
    
    System.out.println("-------------------------");
    
    // OR 연산자
    // 두개의 논리 값 중 한 개라도 true이면 결과가 true가 된다.
    System.out.println(true || true); // true
    System.out.println(true || false); // true
    System.out.println(false || true); // true
    System.out.println(false || false); // false
    
    System.out.println("-------------------------");
    
    // NOT 연산자
    // true 는 false으로, false는 true으로 바꾼다.
    System.out.println(!true);
    System.out.println(!false);
    
    System.out.println("-------------------------");
    
    // exclusive-OR(XOR)연산자
    // - 배타적 비교 연산자라 부른다.
    // - 두 개의 값이 다를 때 true 이다.
    System.out.println(true ^ true);
    System.out.println(false ^ true);
    System.out.println(true ^ false);
    
  }
}
