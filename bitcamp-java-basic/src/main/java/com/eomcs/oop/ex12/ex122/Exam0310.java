// 아규먼트에 람다(lambda) 활용 II - 파라미터와 리턴 값이 있는 람다 만들기
package com.eomcs.oop.ex12.ex122;

public class Exam0310 {

  static interface Player {
    void play();
  }

  static void testPlayer(Player p) {
    p.play();
  }

  public static void main(String[] args) {
    // 로컬 클래스
    class MyPlayer implements Player {
      @Override
      public void play() {
       System.out.println("실행!");
      }
    }
    testPlayer(new MyPlayer());
  }
}
