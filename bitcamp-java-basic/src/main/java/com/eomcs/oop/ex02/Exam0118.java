package com.eomcs.oop.ex02;

import com.eomcs.oop.ex02.util.Score3;

public class Exam0118 {

  public static void main(String[] args) {

    Score3 s1;// Score 메모리에 있는 주소를 Stack에 불러옴
    s1  = new Score3(); // Heap에 순서대로 메모리를 만듬, 인스턴스

    // 배열은 같은 타입의 메모리만 여러개 만들 수 있고
    // 인스턴스는 여러 종류의 메모리를 만들 수 있다.

    s1.init("홍길동", 100, 90, 87);

    Score3 s2 = new Score3();
    s2.init("임꺽정", 90, 100, 100);

    printScore(s1);

    System.out.println("-------------------------");

    printScore(s2);

  }


  static void printScore(Score3 s) {
    System.out.printf("%s: %d, %d, %d, %d, %.1f\n",
        s.name, s.kor, s.eng, s.math, s.sum, s.aver);
  }
}
