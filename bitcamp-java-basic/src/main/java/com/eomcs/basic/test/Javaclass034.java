package com.eomcs.basic.test;

public class Javaclass034 {

  public static class Car {
    // 필드
    private int speed;
    private boolean stop;

    // 생성자

    // 메소드
    public int getSpeed() {
      return speed;
    }

    public void setSpeed(int speed) {
      if (speed < 0) {
        this.speed = 0;
        return;
      } else {
        this.speed = speed;
      }
    }

    public boolean isStop() {
      return stop;
    }

    public void setStop(boolean stop) {
      this.stop = stop;
      this.speed = 0;
    }

    // setter - 외부에서 값을 받아 필드를 변경하는 메소드
    // getter - 필드의 값을 외부로 리턴해주는 메소드
  }
  public static void main(String[] args) {
    Car myCar = new Car();


    // 잘못된 속도 변경
    // myCar.setSpeed(-50);

    System.out.println("현재 속도: " + myCar.getSpeed());

    // 올바른 속도 변경
    myCar.setSpeed(60);

    // 멈춤
    if (!myCar.isStop()) {
      myCar.setStop(true);
    } // isStop 리턴 값이 false일 경우
      // setStop 값을 true으로 변경하고 speed를 0으로 변경한다.

    System.out.println("현재 속도: " + myCar.getSpeed());
  }
}

/* 접근 제한자는 클래스 필드 생성자 메소드의 사용을 제한한다.
 *  - public, default만 클래스, 필드, 생성자, 메소드를 제한.
 *  - protected / private 필드, 생성자, 메소드 제한
 *
 *    public 접근 제한은 아무런 제한 없이 해당 요소를 사용할 수 있게 한다. o
 *    default 접근 제한은 해당 클래스 내부에서만 사용을 허가한다.x
 *    외부에서 접근하지 못하도록 하려면 private 접근 제한을 해야 한다. o
 */
