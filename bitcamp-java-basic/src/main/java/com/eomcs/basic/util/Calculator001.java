package com.eomcs.basic.util;

public class Calculator001 {

  public int plus(int x, int y) {
    int result = x + y;
    return result;
  }

  public double avg(int x, int y) {
    double sum = plus(x, y);
    double result = sum / 2;
    return result;
  }

  public void execute() {
    double result = avg(7, 10);
    println("실행결과: " + result);

  }
  public void println(String message) {
    System.out.println(message);
  }

}
