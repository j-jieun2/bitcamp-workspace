package com.eomcs.oop.ex02.util;

// 같은 패키지에 소속되어있으면 public 를 붙이지않아도 됨
// public - 클래스를 공개하는 명령
//
public class Score {
  public String name;
  public int kor;
  public int eng;
  public int math;
  public int sum;
  public float aver;

  public void compute() { // 오퍼레이터. 연산자
    this.sum = this.kor + this.eng + this.math;
    this.aver = this.sum / 3f;
  }
}