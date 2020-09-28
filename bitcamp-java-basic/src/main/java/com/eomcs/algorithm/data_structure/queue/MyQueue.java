package com.eomcs.algorithm.data_structure.queue;

import com.eomcs.algorithm.data_structure.linkedlist.MyLinkedList;

// 1) Queue 를 구현하기 위해 기존에 작성한 MyLinkedList를 상속 받는다.
// 2) Queue의 값을 추가하는 offer(Object)를 정의한다.
// 3) Queue에서 값을 꺼내는 poll()을 정의한다.
// 4) Queue에서 제일 앞에 있는 값을 조회하는 peek()을 정의한다.
//  테스트2: MyQueueTest2
// 5) Object.clone()을 오버라이딩 : deep copy
//  테스트3: MyQueueTest3
// 6) 제네릭 정의
//
public class MyQueue<E> extends MyLinkedList<E> implements Cloneable {

  public boolean offer(E e) {
    return add(e); // this가 생략되어있다.
  }

  public E poll() {
    if (size() == 0) { // 헤드 또는 이 대기열이 비어 있는 경우 null
      return null;
    }
    return remove(0);
  }

  public E peek() {
    if (size() == 0) {
      return null;
    }
    return get(0);
  }

  @Override
  public MyQueue<E> clone() throws CloneNotSupportedException {
    MyQueue<E> newQueue = new MyQueue<>();
    // Object[] values = this.toArray();
    for (Object value : this.toArray()) {
      newQueue.offer((E) value);
    }
    return newQueue;
  }
}
