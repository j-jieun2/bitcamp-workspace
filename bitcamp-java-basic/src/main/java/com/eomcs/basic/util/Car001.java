package com.eomcs.basic.util;

public class Car001 {

  public int speed;

  public int gerSpeed() {
    return speed;
  }

  public void keyTurnOn() {
    System.out.println("키를 돌립니다.");
  }

  public void run() {
    for (int i = 10; i <= 50; i += 10) {
      speed = i;
      System.out.println("달립니다.(시속:" + speed + "km/h)");
    }
  }
}
