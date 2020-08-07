package com.eomcs.basic.test;

import com.eomcs.basic.util.Calculator002;

public class Javaclass006 {
  public static void main(String[] args) {
    Calculator002 myCalcu = new Calculator002();

    // 정사각형 넓이 구하기
    double result1 = myCalcu.areaRectangle(10);

    // 직사각형 넓이 구하기
    double result2 = myCalcu.areaRectangle(10, 20);

    // 결과 출력
    System.out.println("정사각형의 넓이 = " + result1);
    System.out.println("직사각형의 넓이 = " + result2);


  }
}

/*  마무리 문제
 * 리턴값이 없는 메소드는 리턴 타입을 (void)로 해야한다.
 * 리턴 타입이 있는 메소드는 리턴값을 지정하기 위해 반드시
 * (return) 문이 있어야 한다.
 * 매개값의 개수를 모를 경우(...)를 이용해서 매개 변수를 선언할 수 있다.
 * 같은 이름의 메소드를 여러 개 선언하는 것을 메소드(오버로딩)이라고
 * 한다.
 *
 * 동일한 이름의 메소드를 여러 개 선언하는 것을 말한다. O
 * 반드시 리턴 타입이 달라야 한다. X
 * 매개 변수의 타입, 개수, 순서를 다르게 선언해야 한다. O
 * 매개값이 타입 및 개수에 따라 호출될 메소드가 선택된다. O
 */
