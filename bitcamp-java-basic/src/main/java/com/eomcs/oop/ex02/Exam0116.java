package com.eomcs.oop.ex02;

import com.eomcs.oop.ex02.util.Score;

public class Exam0116 {

  public static void main(String[] args) {

    Score s1;// Score 메모리에 있는 주소를 Stack에 불러옴
    s1  = new Score(); // Heap에 순서대로 메모리를 만듬, 인스턴스

    // 배열은 같은 타입의 메모리만 여러개 만들 수 있고
    // 인스턴스는 여러 종류의 메모리를 만들 수 있다.

    s1.name = "홍길동"; // s1(레퍼런스) name(인스턴스,객체)에 이름을 넣는다.
    s1.kor = 100;
    s1.eng = 90;
    s1.math = 87;
    s1.compute();

    Score s2 = new Score();
    s2.name = "임꺽정";
    s2.kor = 90;
    s2.eng = 100;
    s2.math = 100;
    s2.compute();

    printScore(s1);

    System.out.println("-------------------------");

    printScore(s2);

  }


  static void printScore(Score s) {
    System.out.printf("%s: %d, %d, %d, %d, %.1f\n",
        s.name, s.kor, s.eng, s.math, s.sum, s.aver);
  }
}
