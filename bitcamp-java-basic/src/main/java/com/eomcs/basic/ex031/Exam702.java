// Exam500.java
// 주제: 문자 리터럴

package com.eomcs.basic.ex031;

public class Exam702 {
  public static void main(String[] args) {
    String a = "Java의 그림책"; // a의 문자열
    int len = a.length(); // a 문자열의 길이 = 8
    String b = a.substring(len-3, len); // a의 문자열 일부.. 
    int c = b.compareTo("그림책");

    System.out.println("["+a+"]의 마지막 3문자는 ["+b+"]");
    System.out.println("그림책" + (c==0 ? "입니다" : "이 아닙니다."));
    
    
    
    }
}
