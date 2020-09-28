package com.eomcs.basic.test;

public class Javaclass024 {
  /*  static class Car {
    // 필드
    String company = "현대자동차";
    String model;
    String color;
    int maxSpeed;

    // 생성자
    Car() {
    }

    // 생성자
    Car(String model) {
      this(model, "은색", 250);
    }

    // 생성자
    Car(String model, String color) {
      this(model, color, 250);
    }

    // 생성자
    Car(String model, String color, int maxSpeed) { // 공통 실행 코드
      this.model = model;
      this.color = color;
      this.maxSpeed = maxSpeed;
    }
  }
  public static void main(String[] args) {
    Car car1 = new Car(); // 생성자 선택
    System.out.println("car1.company: " + car1.company);
    System.out.println();

    Car car2 = new Car("자가용"); // 생성자 선택
    System.out.println("car2.company: " + car2.company);
    System.out.println("car2.model: " + car2.model);
    System.out.println();

    Car car3 = new Car("자가용", "빨강"); // 생성자 선택
    System.out.println("car3.company: " + car3.company);
    System.out.println("car3.model: " + car3.model);
    System.out.println("car3.color: " + car3.color);
    System.out.println();

    Car car4 = new Car("택시", "검정", 200); // 생성자 선택
    System.out.println("car4.company: " + car4.company);
    System.out.println("car4.model: " + car4.model);
    System.out.println("car4.color: " + car4.color);
    System.out.println("car4.maxSpeed: " + car4.maxSpeed);
    System.out.println();

  }
} */

  /* 확인 문제
   * 객체를 생성하려면 생성자 호출이 반드시 필요한 것은 아니다. x
   * 생성자는 다른 생성자를 호출하기 위해 this()를 사용할 수 있다. o
   * 생성자가 선언되지 않으면 컴파일러가 기본 생성자를 추가한다. o
   * 매게 변수의 수, 타입, 순서가 다른 생성자를 여러 개 선언할 수 있다. x - o
   *
   * static class Member {
   * String name;
   * String id;
   *
   * static Member(String name, String id) {
   * this.name = name;
   * this.id = id;
   * }
   * }
   *
   *
   */

  public static class Board {
    // 필드
    String title;
    String content;
    String writer;
    String date;
    int hitcount;

    // 생성자
    Board(String title, String content) {
      this(title, content, "로그인한 회원아이디", "현재 컴퓨터 날짜", 0);
    }

    Board(String title, String content, String writer) {
      this(title, content, writer, "현재 컴퓨터 날짜", 0);
    }

    Board(String title, String content, String writer, String date) {
      this(title, content, writer, date, 0);
    }

    Board(String title, String content, String writer, String date, int hitcount) { // 참고
      this.title = title;
      this.content = content;
      this.writer = writer;
      this.date = date;
      this.hitcount = hitcount;
    }
  }

    public static void main(String[] args) {
      Board board1 = new Board("비트캠프", "안녕하세요");
      Board board2 = new Board("비트캠프2", "안녕하세요2", "반갑습니다2");
      Board board3 = new Board("비트캠프3", "안녕하세요3", "반갑습니다3", "현재 시간 오후6시");
      Board board4 = new Board("비트캠프3", "안녕하세요3", "반갑습니다3", "현재 시간 오후6시", 20200806);




  }
}
