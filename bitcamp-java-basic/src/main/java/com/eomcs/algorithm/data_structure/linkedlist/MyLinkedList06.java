package com.eomcs.algorithm.data_structure.linkedlist;

// 1) LinkedList 클래스 정의
// 2) 값을 담을 노드 클래스를 설계한다.
// 3) 첫 번째 노드와 마지막 노드의 주소를 담을 필드를 추가한다.
//    목록 크기를 저장할 필드를 추가한다.
// 4) 목록에 값을 추가하는 add() 메서드를 정의한다.
// 5) 목록에서 값을 조회하는 get() 메서드를 정의한다.
// 6) 목록에서 특정 인덱스 위치에 값을 삽입하는 add(int, Object) 메서드를 정의한다.
//   - Node의 생성자를 추가한다.
public class MyLinkedList06 {

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

    public Node() {} // 기존에 생성자 없이 작성한 코드가 있기 때문에 아무것도 없는것도 함께 만든다.

    public Node(Object value) {
      this.value = value;
    }
  }

  public boolean add(Object e) {
    Node node = new Node();
    node.value = e; // aaa

    if (first == null) { // 값이 null 일 경우 해당 객체는 first를 가진다.
      first = node;
    } else { // first 값이 null이 아닐 경우 다음 객체는 last를 가진다.
      last.next = node;
    }
    last = node; // 새로운 객체는 last를 가진다. /

    size++; // 목록의 크기를 증가한다.

    return true;
  }

  public Object get(int index) {
    if (index < 0 || index >= this.size) { // index가 0보다 작거나, index가 size보다 같거나 클 경우
      throw new IndexOutOfBoundsException("인덱스가 유효하지 않습니다");
    }

    Node cursor = this.first;
    for (int i = 1; i <= index; i++) { // get(indext) 위치가 주어질 때,
      cursor = cursor.next; // 현재 cursor가 가르키는 next 변수값을 cursor에 넣는다.
    }
    return cursor.value;
  }

  public void add(int index, Object element) {
    if (index < 0 || index > this.size) { // index가 0보다 작거나, index가 size보다 클 경우
      throw new IndexOutOfBoundsException("인덱스가 유효하지 않습니다");
    }

    Node node = new Node(element);

    size++;
    if (index == 0) { // 만약 index가 0번일 경우는
      node.next = first; // 새로 만든 노드에 frist를 저장한다.
      first = node; // 새로 만든 노드를 frist에 저장한다.
      return;
    }

    Node cursor = this.first;
    for (int i = 1; i <= index - 1; i++) { // 현재 인덱스 위치가 주어질 때,
      cursor = cursor.next; // 현재 cursor가 가르키는 next 변수값을 cursor에 넣는다.
    }

    node.next = cursor.next; // 새로 만든 노드의 넥스트는 커서의 넥스트가 된다.
    cursor.next = node; // 커서의 넥스트에는 새로 만든 노드의 주소를 담는다. 새로 만든 노드는 null이 됨.

    if (node.next == null) { // 노드의 넥스트가(마지막이) null이면
      last = node; // last를 현재 노드로 바꿔주어야함.
    }
  }
}
