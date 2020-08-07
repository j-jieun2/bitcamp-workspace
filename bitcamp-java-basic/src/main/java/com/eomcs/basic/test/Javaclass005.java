package com.eomcs.basic.test;

import com.eomcs.basic.util.Car001;

public class Javaclass005 {
  public static void main(String[] args) {
    Car001 myCar = new Car001();

    myCar.keyTurnOn();
    myCar.run();
    int speed = myCar.gerSpeed();
    System.out.println("현재속도: " + speed + "km/h");

  }
}
