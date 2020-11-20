package com.eomcs.basic.test;

public class MainClass01 {
  public static void main(String[] args) {

    int num1 = 10;
    int num2 = 20;

    if (num1 < num2) {
      System.out.println("num1은 num2보다 작다.");
    }

    if (num1 > num2) {
      System.out.println("num1은 num2보다 크다.");
    } else {
      System.out.println("num1은 num2보다 크지않다.");
    }

    if (num1 > num2) {
      System.out.println("num1은 num2보다 크다");
    } else if (num1 < num2) {
      System.out.println("num1은 num2보다 작다");
    } else if (num1 == num2) {
      System.out.println("num1은 num와 같다");
    } else {
      System.out.println("num1은 num2와 크지도 작지도 같지도 않다.");
    }
  }
}
