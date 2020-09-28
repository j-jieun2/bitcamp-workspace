package com.eomcs.oop.ex09.e.e1.project1;

import com.eomcs.oop.ex09.e.e1.Computer;

public class FirstComputer implements Computer {
  @Override
  public void computer() {
    System.out.println("단순히 계산을 수행한다.");
  }
}
