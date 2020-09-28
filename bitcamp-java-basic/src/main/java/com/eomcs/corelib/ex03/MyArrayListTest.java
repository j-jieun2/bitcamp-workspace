package com.eomcs.corelib.ex03;

public class MyArrayListTest {
  public static void main(String[] args) {
    MyArrayList.add("aaa"); //0, aaa
    MyArrayList.add("bbb"); //1, aaa, bbb
    MyArrayList.add("ccc"); //2, aaa, bbb, ccc
    print();

    MyArrayList.add(1, "xxx"); // aaa, xxx, bbb, ccc
    print();

    Object old = MyArrayList.set(2, "yyy"); // aaa, xxx, yyy, ccc
    print();
    System.out.println(old); // 교체하기 전 이전의 값 출력

    old = MyArrayList.remove(1); // 1번을 지운다.
    print(); // aaa, yyy, ccc
    System.out.println(old); // xxx

  }

  static void print() {
    for (int i = 0; i < MyArrayList.size; i++) {
      String str = (String) MyArrayList.get(i);
      System.out.print(str + ",");
    }
    System.out.println();
  }
}
