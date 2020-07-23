// Exam500.java
// 주제: 문자 리터럴

package com.eomcs.basic.ex031;

public class Exam700 {
  public static void main(String[] args) {
    
    System.out.println("Hello,world!"); 
    System.out.println("Hello,\nworld!"); // 줄바꿈 문자
    System.out.println("Hello,\rabc"); // 커서(cursor)를 처음으로 돌리는 문자
    // 커서란? 문자를 출력할 위치를 가리키는 것.

    System.out.println("Hello,\b\b\bworld!"); // 커서를 뒤로 한 칸 이동시키는 문자
    System.out.println("Hello,\tworld!"); // 탭 공간을 추가시키는 문자
    System.out.println("Hello,\fworld!"); // 
    System.out.println("Hello,\"w\"orld!"); // " 문자를 출력시키는 문자
    System.out.println("Hello,'w'orld!"); //"" 안에서 ' 문자는 그냥 적는다.
    System.out.println('\''); // ' 문자를 출력시키는 문자
    System.out.println('"'); // '' 안에서 " 문자는 그냥 적는다.
    System.out.println("c:\\Users\\user\\git"); // \ 문자를 출력시키는 문자
    
    }
}
