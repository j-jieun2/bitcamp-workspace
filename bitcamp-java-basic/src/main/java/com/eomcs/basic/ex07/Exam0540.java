// # 메서드 : main() 메서드 - 프로그램 아규먼트 응용 II
//
package com.eomcs.basic.ex07;

public class Exam0540 {

  public static void main(String[] args) {
    // 학생의 이름과 국영수 점수를 입력 받아 총점과 평균을 출력하라
    // $ java -cp ./bin/main com.eomcs.basic.ex07.Exam0540 홍길동 100 100 90
    // 이름: 홍길동
    // 총점: 290
    // 평균: 96.9
    //

    if (args.length < 4) {
      System.out // main(args)에 0,1,2,3개까지 입력 받고 리턴한다.
      .println("실행 형식: java -cp bin/main com.eomcs.basic.ex07.Exam0540 이름 국어점수 영어점수 수학점수");
    return;
    }

    // {홍길동, 100, 100, 90}
    int sum = 0;
    for (int i = 1; i < args.length; i++) // 이건 왜 1부터 입력 받는거지?
      // 이유 알았음... 0번 배열은 String 값이기때문에 출력안됨 ㅜㅜㅜㅜㅜ
      sum += Integer.parseInt(args[i]);

    System.out.printf("이름: %s\n", args[0]);
    System.out.printf("총점: %d\n", sum);
    System.out.printf("평균: %.1f\n", sum / 3f);

  }
}