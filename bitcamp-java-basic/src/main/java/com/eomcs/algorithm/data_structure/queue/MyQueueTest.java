package com.eomcs.algorithm.data_structure.queue;

public class MyQueueTest {
  public static void main(String[] args) {
    MyQueue queue = new MyQueue();

    queue.offer("aaa");
    queue.offer("bbb");
    queue.offer("ccc");
    System.out.println("==> " + queue.peek()); // aaa
    queue.offer("eee");
    queue.offer("ddd");
    print(queue);

    System.out.println(queue.poll());
    System.out.println(queue.poll());
    System.out.println("==> " + queue.peek()); // ccc
    System.out.println(queue.poll());
    System.out.println(queue.poll());
    System.out.println(queue.poll());
    System.out.println(queue.poll());
    System.out.println(queue.poll());
    System.out.println(queue.size());

  }


  static void print(MyQueue queue) {
    for (int i = 0; i < queue.size(); i++) {
      System.out.print(queue.get(i) + ",");
    }
    System.out.println();
  }
}
