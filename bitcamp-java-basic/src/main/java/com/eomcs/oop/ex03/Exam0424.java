package com.eomcs.oop.ex03;

class SmartPhone {
  int volume;
  int bright;
  int contrast;

  private SmartPhone() {
    System.out.println("SmartPhone() 생성자 호출됨!");
  }

  public SmartPhone(int volume) {
    System.out.println("SmartPhone(int) 생성자 호출됨!");
    this.volume = volume;
    this.bright = 50;
    this.contrast = 50;
  }

  public SmartPhone(int volume, int bright) {
    System.out.println("SmartPhone(int, int) 생성자 호출됨!");
    this.volume = volume;
    this.bright = bright;
    this.contrast = 50;
  }

  public SmartPhone(int volume, int bright, int contrast) {
    System.out.println("SmartPhone(int, int, int) 생성자 호출됨!");
    this.volume = volume;
    this.bright = bright;
    this.contrast = contrast;
  }

  void m1() {
    // 일반 메서드에서 생성자를 임의로 호출할 수 없다.
    // this();
  }
}

public class Exam0424 {

  public static void main(String[] args) {
    // private 으로 접근을 제한한 경우 다른 클래스가 생성자를 지정할 수 없다.
    // SmartPhone obj1 = new SmartPhone();
    SmartPhone obj1 = new SmartPhone(100);
  }
}
