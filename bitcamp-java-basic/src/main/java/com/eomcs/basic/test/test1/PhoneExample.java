package com.eomcs.basic.test.test1;

public class PhoneExample {
  public static void main(String[] args) {
    // Phone는 추상 클래스이다.
    // 인스턴스를 생성할 수 없음.
    // Phone phone = new Phone();

    SmartPhone smartPhone = new SmartPhone("홍길동");

    smartPhone.turnOn(); // Phone의 메소드
    smartPhone.internetSearch();
    smartPhone.turnOff(); // Phone의 메소드
  }
}
