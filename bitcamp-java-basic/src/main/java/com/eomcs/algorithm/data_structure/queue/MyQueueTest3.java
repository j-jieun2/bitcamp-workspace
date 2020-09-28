package com.eomcs.algorithm.data_structure.queue;

public class MyQueueTest3 {
  public static void main(String[] args) throws Exception {
    MyQueue<String> queue = new MyQueue<>();

    queue.offer("aaa");
    queue.offer("bbb");
    queue.offer("ccc");
    queue.offer("eee");
    queue.offer("ddd");
    // queue.offer(new Integer(100)); // 컴파일 오류!
    print(queue);

    MyQueue<String> queue2 = queue.clone();
    print(queue2);

    System.out.println(queue2.poll());//aaa
    System.out.println(queue2.poll());//bbb
    System.out.println(queue2.poll());//ccc
    print(queue2); // ddd,eee

    System.out.println("--------------------");
    print(queue);
  }
  static void print(MyQueue<?> queue) {
    for (int i = 0; i < queue.size(); i++) {
      System.out.print(queue.get(i) + ",");
    }
    System.out.println();
  }
}
