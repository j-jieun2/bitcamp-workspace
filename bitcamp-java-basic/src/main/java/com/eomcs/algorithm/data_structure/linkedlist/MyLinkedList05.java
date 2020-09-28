package com.eomcs.algorithm.data_structure.linkedlist;

// 1) LinkedList 클래스 정의
// 2) 값을 담을 노드 클래스를 설계한다.
// 3) 첫 번째 노드와 마지막 노드의 주소를 담을 필드를 추가한다.
//    목록 크기를 저장할 필드를 추가한다.
// 4) 목록에 값을 추가하는 add() 메서드를 정의한다.
// 5) 목록에서 값을 조회하는 get() 메서드를 정의한다.
public class MyLinkedList05 {

  // 값을 찾을 때는 첫 번째 노드부터 따라간다.
  Node first;

  // 값을 추가할 때는 마지막 노드에 연결한다.
  Node last;

  // 목록 크기를 보관한다.
  int size;

  // 용도?
  // - Node 클래스는 목록에서 각 항목의 값을 보관하는 객체로 역할을 수행한다.
  // 스태틱 클래스?
  // - 여러 개 MyLinkedList 객체가 공유하는 클래스이므로
  //   스태틱으로 Node 클래스를 설계한다.
  static class Node {
    Object value;
    Node next;
  }

  public boolean add(Object e) {
    Node node = new Node();
    node.value = e;

    if (first == null) { // first 값이 null 일 경우 first/last 모두 같은 주소를 가진다.
      first = node;
      last = node;
    } else { // first 값이 null이 아닐 경우 다음 객체는 last를 가진다.
      last.next = node;
    }
    last = node; // 새로운 객체는 last를 가진다.

    size++; // 목록의 크기를 증가한다.

    return true;
  }

  public Object get(int index) {
    if (index < 0 || index >= this.size) {
      throw new IndexOutOfBoundsException("인덱스가 유효하지 않습니다");
    }

    Node cursor = this.first;
    for (int i = 1; i <= index; i++) { // get(값)
      cursor = cursor.next; // 현재 cursor가 가르키는 next 변수값을 cursor에 넣는다.
    }
    return cursor.value;
  }
}
