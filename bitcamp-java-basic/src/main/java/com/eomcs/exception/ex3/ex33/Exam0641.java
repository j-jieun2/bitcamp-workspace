// 예외 처리 후 마무리 작업 - try-with-resources 실행 순서
package com.eomcs.exception.ex3.ex33;

public class Exam0641 {

  static class B implements AutoCloseable {

    public void m(int value) throws Exception {
      if (value < 0) {
        throw new Exception("음수입니다!");
      }
      System.out.println("m() 호출!");
    }

    @Override
    public void close() throws Exception {
      System.out.println("close() 호출!");
    }
  }

  public static void main(String[] args) throws Exception {
    try(B obj = new B()) {
      System.out.println("try 블록 실행.. 시작");
      obj.m(-100);

      System.out.println("try 블록 실행..종료");
    } catch (Exception e) {
      System.out.println("예외 발생!: " + e.getMessage());
    }
  }
}
