package com.eomcs.basic.ex07;

public class Exam0260 {

  // 가변 파라미터
  static void hello(String... names) {
    for (int i = 0; i < names.length; i++) {
      System.out.printf("%s님 반갑습니다.\n", names[i]);
    }
  }

  // 배열 파라미터
  static void hello2(String[] names) {
    for (int i = 0; i < names.length; i++) {
      System.out.printf("%s님 반갑습니다.\n", names[i]);
    }
  }

  public static void main(String[] args) {

    // 가변파라미터는 낱개의 여러 개 갑슬 줄 수도 있고,
    // 배열에 담아서 전달할 수도 있다.
    hello("홍길동", "임꺽정", "유관순");
    System.out.println("---------------------");

    String[] arr = {"김구", "안중근", "윤봉길", "유관순"};

    hello(arr);
    System.out.println("---------------------");

    // 배열파라미터의 메서드를 호출할 때는
    // 가변파라미터와 달리 값을 여러 개 줄 수 없다.
    // 오직 배열에 담아서 전달해야한다.

    String[] arr2 = {"김구", "안중근", "윤봉길", "유관순"};
    hello2(arr2);
    System.out.println("---------------------");
  }
}
