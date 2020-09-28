package com.eomcs.algorithm.data_structure.linkedlist;

// 1) LinkedList 클래스 정의
// 2) 값을 담을 노드 클래스를 설계한다.
// 3) 첫 번째 노드와 마지막 노드의 주소를 담을 필드를 추가한다.
//    목록 크기를 저장할 필드를 추가한다.
// 4) 목록에 값을 추가하는 add() 메서드를 정의한다.
// 5) 목록에서 값을 조회하는 get() 메서드를 정의한다.
// 6) 목록에서 특정 인덱스 위치에 값을 삽입하는 add(int, Object) 메서드를 정의한다.
// 7) 목록에서 특정 인덱스에 값을 제거하는 remove(int) 메서드를 정의한다.
//   - Node의 생성자를 추가한다.
// 8) 목록에서 특정 인덱스의 값을 바꾸는 ser(int, Object) 메서드를 정의한다.
// 9) 목록의 데이터를 새 배열에 담아 리턴하는 toArray() 메서드를 정의한다.
// 10) 인스턴스 필드에 대해 캡슐화를 적용한다.
//      - 목록 크기를 리턴하는 size()를 추가로 정의한다.

public class MyLinkedList10 {

  // 값을 찾을 때는 첫 번째 노드부터 따라간다.
  private Node first;

  // 값을 추가할 때는 마지막 노드에 연결한다.
  private Node last;

  // 목록 크기를 보관한다.
  private int size;

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

    if (first == null) { // Heap 메모리에서 frist 값이 null 일 경우 node 주소를 frist에 넘긴다.
      first = node;
    } else { // first 값이 null이 아닐 때 실행됨.last.next는 node 주소를 가진다.
      last.next = node;
    }
    last = node; // last에 node 주소를 넣는다.주소의 객체가 last의 값이 된다.

    size++; // 목록의 크기를 증가한다.

    return true;
  }

  public Object get(int index) {
    if (index < 0 || index >= this.size) { // index가 0보다 작거나, index가 size보다 같거나 클 경우
      throw new IndexOutOfBoundsException("인덱스가 유효하지 않습니다");
    }

    Node cursor = this.first;
    for (int i = 1; i <= index; i++) { // get(indext - 1) 위치가 주어질 때, (0 일때는 실행안됨)
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

  public Object remove(int index) {
    if (index < 0 || index >= this.size) { // index가 0보다 작거나, index가 size보다 클 경우
      throw new IndexOutOfBoundsException("인덱스가 유효하지 않습니다");
    }

    size--;

    if (index == 0) {
      Node old = first;
      first = old.next; // 넥스트 값을 old에 넣는다.
      old.next = null;  // 가비지가 다른 인스턴스를 가리키지 않게 한다.
      return old.value;
    }

    Node cursor = this.first;
    for (int i = 1; i <= index - 1; i++) { // get(indext - 1) 위치가 주어질 때,
      cursor = cursor.next; // 현재 cursor가 가르키는 next 변수값을 cursor에 넣는다.
    }

    Node old = cursor.next;
    cursor.next = old.next; // 삭제하려는 객체의 다음 객체를 넣음
    old.next = null; // 가비지가 다른 인스턴스를 가리키지 않게 한다.
    // Object old = cursor.next.value; // 현재 커서의 넥스트가 가르키는 노드를 벨류에 저장.
    // cursor.next = cursor.next; // 커서의 넥스트로 가서 다시 커서의 넥스트


    if (cursor.next == null) {
      last = cursor;
    }

    return old.value;

  }
  public Object set(int index, Object element) {
    if (index < 0 || index >= this.size) { // index가 0보다 작거나, index가 size보다 같거나 클 경우
      throw new IndexOutOfBoundsException("인덱스가 유효하지 않습니다");
    }

    Node cursor = this.first;
    for (int i = 1; i <= index; i++) { // get(indext - 1) 위치가 주어질 때,
      cursor = cursor.next; // 현재 cursor가 가르키는 next 변수값을 cursor에 넣는다.
    }

    Object old = cursor.value;
    cursor.value = element;

    return old;
  }

  public Object[] toArray() {
    Object[] arr = new Object[this.size];

    int i = 0;
    Node cursor = first;

    while (cursor != null) {
      arr[i++] = cursor.value;
      cursor = cursor.next;
    }

    return arr;
  }

  public int size() {
    return this.size;
  }
}
