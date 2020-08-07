package com.eomcs.basic.ex04;

public class Exam433 {
  public static void main(String[] args) {

    // a. += 더한 값을 대입.
    // b. -= 뺸 값을 대입.
    // c. *= 곱한 값을 대입.
    // d. /= 나눈 값을 대입.
    // e. %= 나눈 뒤 나머지 값을 대입.
    
    // a는 10보다 크거나 같고 50보다 작다.
    // a는 1 또는 100이다.
    // a는 100이 아니다.
    
    // b=0 또는 b=1이 아니다. = !((b==0)||(b==1))
    // b=0이 아니고 b=1도 아니다. = !((b==0)&&(b==1))
    // b\0이고 b\1이다. = (b!=0) && (b!=1)
    
    // a. x=(int)3.6 + (int) 3.3:
    // b. x=(int)((2.3)*10.5);
    // c. x=3/5*22.0;
    
    double x = 0;
    
    x=(int) 3.6 + (int) 3.3;
    System.out.println("a. 실수 : " + x + ", 정수 : " + (int)x);
    
    x = (int)((2 + 3) * 10.5);
    System.out.println("b. 실수 : " + x + ", 정수 : " + (int)x);
    
    x = 3/5 * 22.0;
    System.out.println("c. 실수 : " + x + ", 정수 : " + (int)x);
    
    }
  }
