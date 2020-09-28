package com.eomcs.algorithm.data_structure.linkedlist;

public class MyLinkedListTest03 {
  public static void main(String[] args) {
    MyLinkedList<String> list = new MyLinkedList<>();

    list.add("aaa");
    list.add("bbb");
    list.add("ccc");
    list.add("ddd");

    System.out.println(list.get(0));
    System.out.println(list.get(1));
    System.out.println(list.get(2));
    System.out.println(list.get(3));
    // System.out.println(list.get(-1));
    // System.out.println(list.get(4));
    System.out.println("--------------------------");

    print(list); // aaa, bbb, ccc, ddd

    System.out.println("--------------------------");

    list.add(2, "eee"); // aaa, bbb, eee, ccc, ddd
    list.add(0, "fff"); // fff, aaa, bbb, eee, ccc, ddd
    list.add(6, "ggg"); // fff, aaa, bbb, eee, ccc, ddd, ggg
    list.add("hhh"); // fff, aaa, bbb, eee, ccc, ddd, ggg, hhh
    print(list);

    System.out.println("--------------------------");

    System.out.println(list.remove(4)); // fff, aaa, bbb, eee, ddd, ggg, hhh
    print(list);

    System.out.println(list.remove(0)); // aaa, bbb, eee, ddd, ggg, hhh
    print(list);

    System.out.println(list.remove(5)); // aaa, bbb, eee, ddd, ggg
    print(list);

    System.out.println("--------------------------");
    System.out.println(list.set(1, "xxx")); // aaa, xxx, eee, ddd, ggg
    print(list);
    System.out.println(list.set(0, "yyy")); // yyy, xxx, eee, ddd, ggg
    print(list);
    System.out.println(list.set(4, "zzz")); // yyy, xxx, eee, ddd, zzz
    print(list);

    System.out.println("--------------------------");

    print2(list.toArray());

    System.out.println("---------------------");

    print3(list);


  }

  static void print(MyLinkedList<String> list) {
    for (int i = 0; i < list.size(); i++) { // list.size만큼 반복
      System.out.print(list.get(i) + ",");
    }
    System.out.println();
  }

  static void print2(Object[] arr) {
    for (Object obj : arr) { // list.size만큼 반복
      System.out.print(obj + ",");
    }
    System.out.println();
  }

  static void print3(MyLinkedList<String> list) {
    // String[] arr = new String[list.size()];
    // String[] arr2 = list.toArray(arr);

    // String[] arr = new String[2];
    //String[] arr2 = list.toArray(arr);

    String[] arr2 = list.toArray(new String[] {});

   // System.out.println(arr == arr2);

    for (Object obj : arr2) { // list.size만큼 반복
      System.out.print(obj + ",");
    }
    System.out.println();
  }
}
