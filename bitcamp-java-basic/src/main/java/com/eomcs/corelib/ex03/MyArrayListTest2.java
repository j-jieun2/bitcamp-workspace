package com.eomcs.corelib.ex03;

public class MyArrayListTest2 {
  public static void main(String[] args) {

    MyArrayList.add("aaa"); //0, aaa
    print();
    MyArrayList.add("bbb"); //1, aaa, bbb
    print();
    MyArrayList.add("ccc"); //2, aaa, bbb, ccc
    print();
    MyArrayList.add("ddd"); //3, aaa, bbb, ccc, ddd
    print();
    MyArrayList.add("eee"); //4, aaa, bbb, ccc, ddd, eee
    print();
    MyArrayList.add("fff"); //5, aaa, bbb, ccc, ddd, eee, fff
    print();
    MyArrayList.add("ggg"); //6, aaa, bbb, ccc, ddd, eee, fff, ggg
    print();
    MyArrayList.add("hhh"); //7, aaa, bbb, ccc, ddd, eee, fff, ggg, hhh
    print();

    MyArrayList.add(8, "iii"); //8, aaa, bbb, ccc, ddd, eee, fff, ggg, hhh, iii
    print();

    Object old = MyArrayList.remove(5); //7 aaa, bbb, ccc, ddd, eee, ggg, hhh, iii
    print();
    System.out.println(old);

    MyArrayList.set(7, "xxx");
    print();

    System.out.println(MyArrayList.get(7));

  }

  static void print() {
    for (int i = 0; i < MyArrayList.size; i++) {
      String str = (String) MyArrayList.get(i);
      System.out.print(str + ",");
    }
    System.out.println();
  }
}
