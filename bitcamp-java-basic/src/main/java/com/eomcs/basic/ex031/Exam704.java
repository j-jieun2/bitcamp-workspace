// Exam500.java
// 주제: 문자 리터럴

package com.eomcs.basic.ex031;

public class Exam704 {
  public static void main(String[] args) {
    String a = "Java의그림책"; // a의 문자열
    int len = a.length(); // a 문자열의 길이 = 8
    String b = a.substring(len-2, len); // a의 문자열 일부.. 
    int c = b.compareTo("그림책");

    System.out.println("["+a+"]의 마지막 3문자는 ["+b+"]");
    System.out.println("그림책" + (c==0 ? "입니다" : "이 아닙니다."));
    
    int a1 [] = {1, 2, 3, 4, 5};
    System.out.println(a1[3]);
    System.out.println(a1[4]);
    
    int t [] = new int [10] ;
    int r = 1;
    t[0]= 1;
    t[1]= 2;
    t[2]= 3;
    t[3]= 4;
    t[4]= 5;
    t[5]= 6;
    t[6]= 7;
    t[7]= 8;
    System.out.println(t[5]);
    
    int j [] = { 11, 22, 33, 44, 55 };
    System.out.println(j[3]);
    
    
    
    
    
    }
}
