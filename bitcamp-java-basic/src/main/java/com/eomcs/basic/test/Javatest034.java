// if ~ else 주사위 번호 뽑기

package com.eomcs.basic.test;

public class Javatest034 {
  public static void main(String[] args) {
    int num = (int) (Math.random() * 6) + 1; // 주사위 번호 뽑기 식
    // Math.random 메소드
    //  - 0.0 ~ 1.0 사이에 속하는 double 타입의 난수 하나를 리턴,
    //  - 이때 0.0 범위는 포함되고 1.0 범위는 포함되지않음.
    //  - 0.0 <= Math.random() < 1.0
    //      - 1 ~ 10 까지의 정수를 얻기 위해선 *10 을 해주면 된다.
    //      - int 타입으로 변환 후, Math의 값을 10까지로 만들기 위해서 +1을 해준다.

    if (num == 1) {
      System.out.println("1번이 나왔습니다.");
    } else if (num == 2) {
      System.out.println("2번이 나왔습니다.");
    } else if (num == 3) {
      System.out.println("3번이 나왔습니다.");
    } else if (num == 4) {
      System.out.println("4번이 나왔습니다.");
    } else if (num == 5) {
      System.out.println("5번이 나왔습니다.");
    } else {
      System.out.println("6번이 나왔습니다.");
    }
  }
}