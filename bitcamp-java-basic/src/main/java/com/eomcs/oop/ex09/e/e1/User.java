package com.eomcs.oop.ex09.e.e1;

import com.eomcs.oop.ex09.e.e1.project1.FirstComputer;
import com.eomcs.oop.ex09.e.e1.project2.SecondComputer;
import com.eomcs.oop.ex09.e.e1.project3.ThirdComputer;
import com.eomcs.oop.ex09.e.e1.project4.NewComputer2;

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

  }

  static void play(Computer computer) {
    computer.computer();
    computer.touch();
    System.out.println("---------------");
  }
}
