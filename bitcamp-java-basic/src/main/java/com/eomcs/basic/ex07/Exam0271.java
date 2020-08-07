package com.eomcs.basic.ex07;

public class Exam0271 {
  // 메서드 : 가변 파라미터의 단점

  static void m2(int a, String... names) {
    for (int i =0; i < names.length; i++) {
      System.out.printf("%s 오늘은 %d 입니다.\n", names[i],a);
    }
  }

  static void x1(String[] names, String[] emails) {
    System.out.printf("%s, %s\n", names[0], emails[0]);
    System.out.printf("%s, %s\n", names[1], emails[1]);
    System.out.printf("%s, %s\n", names[2], emails[2]);
    System.out.printf("%s, %s\n", names[3], emails[3]);
  }

  static void x2(String[] names, int a) {
    System.out.printf("우리나라는 %s %s %s %s %d 계절 입니다.\n",
        names[0],
        names[1],
        names[2],
        names[3],
        a);
  }

  public static void main(String[] args) {

    m2(803,"안녕하세요", "반갑습니다");

    x1(new String[] {"봄", "여름", "가을", "겨울"}, new String[] {"Spring", "Summer", "Fall", "Winter"});
    x2(new String[] {"봄","여름", "가을", "겨울"}, 4);

  }
}
