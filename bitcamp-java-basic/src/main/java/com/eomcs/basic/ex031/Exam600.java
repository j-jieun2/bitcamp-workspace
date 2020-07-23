// Exam500.java
// 주제: 문자 리터럴

package com.eomcs.basic.ex031;

public class Exam600 {
  public static void main(String[] args) {
    
    // 문자열 리터럴 기본 예
    System.out.println("홍길동");
    
    // 두 문자열을 합쳐 새 문자열이 생성된다.
    // "Hello," + "world!" = "Hello,world!"
    System.out.println("Hello," + "world!");
    
    // 새 문자열을 만들어 숫자를 붙인다.
    // "나이:" + 20 = "나이:20"
    System.out.println("나이:" + 20);
    
    // 새 문자열을 만들어 논리 값을 붙인다.
    // false + "<== 재직자 여부" = "false<== 재직자 여부"
    System.out.println(false + "<== 재직자 여부");
    
    // 새 문자열을 만들어 문자를 붙인다.
    // "성별:" + '여' = "성별:여"
    System.out.println("성별:" + '여');
    
    // 새 문자열을 만들어 부동소수점을 붙인다.
    // "키:" + 170.5f = "키:175.5" <== 부동소수점 접미사 f 는 새로 만든 문자열에 붙지 않는다.
    System.out.println("키:" + 170.5f);
    
    }
}
