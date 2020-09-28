// String으로 switch
package com.eomcs.basic.test;

public class Javatest038 {
  public static void main(String[] args) {
    String position = "과장";

    switch (position) {
      case "부장":
        System.out.println("700만원");
        break;
      case "과장":
        System.out.println("500만원");
        break;
      default:
        System.out.println("300만원");
    }
  }
}

/* if, switch
 * if문은 조건식의 결과에 따라 실행 흐름을 달리할 수 있다. o
 * if문은 조건식이 true이면 블록을 실행하고 false이면 블록을 실행하지 않는다.x - o
 * if문의 블록 내부에는 또 다른 if 문을 사용할 수 있다. o
 * switch문에서의 사용할 수 있는 변수의 타입은 int만 가능하다. x
 *
 * B입니다.
 *
 * 우수 회원 혜택을 받으실 수 있습니다.
 * 일반 회원 혜택을 받으실 수 있습니다.
 * 감사합니다.
 */