

package com.eomcs.basic.test;

public class Javatest6 {
  public static void main(String[] args) {
    char c1 = 'A'; // 문자를 직접 저장
    char c2 = 65; // 10진수를 저장
    char c3 = '\u0041'; // 16진수로 저장

    char c4 = '가'; // 문자를 직접 저장
    char c5 = 44032; // 10진수를 저장
    char c6 = '\uac00'; // 16진수를 저장

    System.out.println(c1);
    System.out.println(c2);
    System.out.println(c3);
    System.out.println(c4);
    System.out.println(c5);
    System.out.println(c6);

    String name = "홍길동";
    String job = "프로그래머";
    System.out.println(name);
    System.out.println(job);

    String str = "나는 \"자바\"를 좋아합니다.";
    System.out.println(str);

    String str1 = "번호\t이름\t나이";
    String str2 = "홍길동\n감자바";
    System.out.println(str1);
    System.out.println(str2);

    System.out.println("번호\t이름\t나이");
    System.out.println("행 단위 출력\n");
    System.out.println("행 단위 출력\n");
    System.out.println("우리는 \"개발자\" 입니다.");
    System.out.println("봄\\여름\\가을\\겨울");

  }
}