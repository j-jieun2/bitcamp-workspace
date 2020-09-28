package com.eomcs.oop.ex09.e.e1.project2;

import com.eomcs.oop.ex09.e.e1.Computer;

public class SecondComputer implements Computer {
  @Override
  public void computer() {
    System.out.println("멀티태스킹 기능도 수행한다!");
  }
}
