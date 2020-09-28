// 삼항연산자

package com.eomcs.basic.test;

public class Javatest032 {
  public static void main(String[] args) {
    int score = 85;
    char grade = (score > 90) ? 'A' : ((score > 80) ? 'B' : 'C');
    // 스코어가 90점보다 높으면 A, 스코어가 80점보다 높으면 B, 그 이하면 C
    System.out.println(score + "점은 " + grade + "등급 입니다.");

    int var1 = 10;
    int var2 = 3;
    int var3 = 14;

    double var4 = var1 * var1 * Double.parseDouble(var2 + "." + var3);
    System.out.println("원의 넓이: " + var4);

    int value = 356;
    System.out.println(value / 100 * 100);
    boolean stop = true;
    while (!stop){
      case1 :
        System.out.println("멈쵸");

    }
  }
}

/* b = -b
 * 31?,,
 * int가 디폴드이기때문에.. (double) var1 / (double) var2 해줘야됨.
 *
*/