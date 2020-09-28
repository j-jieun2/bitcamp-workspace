package com.eomcs.algorithm.data_structure.queue;

public class MyQueueTest2 {
  public static void main(String[] args) throws Exception {
    MyQueue queue = new MyQueue();

    queue.offer("aaa");
    queue.offer("bbb");
    queue.offer("ccc");
    queue.offer("eee");
    queue.offer("ddd");
    print(queue);

    MyQueue queue2 = queue.clone();
    print(queue);

    System.out.println(queue2.poll());//aaa
    System.out.println(queue2.poll());//bbb
    System.out.println(queue2.poll());//ccc
    print(queue2); // ddd,eee

    System.out.println("--------------------");
    print(queue);
  }

  static void print(MyQueue queue) {
    for (int i = 0; i < queue.size(); i++) {
      System.out.print(queue.get(i) + ",");
    }
    System.out.println();
  }
}
