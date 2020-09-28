package com.eomcs.oop.ex09.e;

import com.eomcs.oop.ex09.e.project1.FirstComputer;
import com.eomcs.oop.ex09.e.project2.SecondComputer;
import com.eomcs.oop.ex09.e.project3.ThirdComputer;
import com.eomcs.oop.ex09.e.project4.NewComputer2;

public class User {
  public static void main(String[] args) {
    // 1970년대:
    play(new FirstComputer());

    // 1980년대:
    play(new SecondComputer());

    // 1990년대:
    play(new ThirdComputer());

    // 2000년대:
    play(new NewComputer2());

    // => 새로 만든 컴퓨터는 새 규칙에 따라서 만들었기 때문에
    //    기존 레퍼런스로 참조하게 되면 기존 기능만 사용할 수 있다.
    // play(new NewComputer1());

    // => 새 컴퓨터의 완전한 기능을 사용하려면 새로 정의한 규칙의 레퍼런스를 사용해야 한다.

  }

  static void play(Computer computer) {
    computer.compute();
    computer.touch();
    System.out.println("--------------------------------");
  }
}
