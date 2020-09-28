package com.eomcs.corelib.ex03;

import java.util.ArrayList;

public class MyArrayListTest4 {
  public static void main(String[] args) {

    ArrayList list1 = new ArrayList();
    // aaa, bbb, ccc, ddd, eee
    list1.add("aaa"); //0, aaa
    list1.add("bbb"); //1, aaa, bbb
    list1.add("ccc"); //2, aaa, bbb, ccc
    list1.add("ddd"); //3, aaa, bbb, ccc, ddd
    list1.add("eee"); //4, aaa, bbb, ccc, ddd, eee
    list1.add("fff");
    list1.add("ggg");
    list1.add("hhh");
    print(list1);

    System.out.println("-----------------------");

    ArrayList list2 = new ArrayList();
    // fff, ggg, hhh, iii
    list2.add("fff"); //5, eee, fff
    list2.add("ggg"); //6, eee, fff, ggg
    list2.add("hhh"); //7, eee, fff, ggg, hhh
    list2.add("iii"); //8, eee, fff, ggg, hhh, iii
    list2.add("jjj");
    list2.add("kkk");
    list2.add("lll");
    print(list2);


  }

  static void print(MyArrayList list) {
    for (int i = 0; i < list.size(); i++) {
      String str = (String) list.get(i);
      System.out.print(str + ",");
    }
    System.out.println();
  }
}
