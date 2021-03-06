// Exam500.java
// 주제: 문자 리터럴

package com.eomcs.basic.ex031;

public class Exam500 {
  public static void main(String[] args) {
    
  //참을 표현할 때는 true, 거짓을 표현할 때는 'false'이다.
    //자바는 대소문자를 구분하기 때문에 반드시 소문자로 작성해야 한다.
    System.out.println(true);
    System.out.println(false);
    
    //비교 연산의 결과는 논리값이다.
    System.out.println(4 < 5); 
    System.out.println(4 > 5); 

    //논리 연산의 결과는 논리값이다.
    System.out.println(true && false);
    System.out.println(true || false);
    
    // 작은 따옴표가 알려준 유니코드 값 비교하기
    System.out.println(65 == 'A');
    System.out.println(65 == 'B');
    
    // 숫자를 true/false로 변환할 수 없다.
    // System.out.println((boolean)1);
    
    }
}
