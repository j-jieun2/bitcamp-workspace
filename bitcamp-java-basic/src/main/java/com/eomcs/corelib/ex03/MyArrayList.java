package com.eomcs.corelib.ex03;

import java.util.Arrays;

//테스트1 - MyArrayListTest
//1) 인스턴스/객체 (의 주소)를 담을 레퍼런스 배열을 준비한다.
//2) 인스턴스를 추가하는 add(Object) 메서드 정의한다.
//3) 특정 인덱스에 인스턴스를 리턴하는 get(int) 메서드 정의한다.
//4) 인스턴스를 특정 위치에 삽입하는 add(int,Object) 메서드를 정의한다.
//5) 특정 위치의 항목을 다른 인스턴스로 교체하는 set(int, Object) 메서드를 정의한다.
//6) 특정 위치의 항목을 제거하는 remove(int) 메서드를 정의한다.
//
//테스트2 - MyArrayListTest2
//7) add()할 때 배열의 크기를 넘는 경우, 배열의 크기를 늘린다. (배열을 복사하고 기존 배열은 가비지가된다.)
//8) add(int, Object)으로 임의의 위치에 삽입할 때
//  - 배열의 크기가 작으면 늘린다,
//  - 인덱스가 유효성하지 않으면 예외를 발생시킨다.
//9) get(int)으로 유효하지 않은 인덱스의 값을 꺼낼 때 예외를 발생시킨다.
//10) remov()를 수행한 다음에 맨 끝에 남아있는 주소를 null로 설정하여
//  - 인스턴스의 레퍼런스 카운트를 한개 줄인다.
//11) set()을 호출할 때 인덱스가 유효하지 않으면 예외를 발생시킨다.
//
//테스트3 - MyArrayListTest3
//12) 여러개의 목록을 동시에 관리할 수 있도록
//    MyArrayList에 선언된 레퍼런스 배열을 스태틱 대신 인스턴스로 전환한다.
//  - 개별적으로 관리해야 할 데이터는 인스턴스 변수를 사용해야 한다.
//13) 캡슐화를 적용하여 공개할 멤버와 공개하지 말아야 할 멤버를 구분한다.
//14) ArrayList 인스턴스를 생성할 때 배열의 초기 크기를 설정할 수 있도록 생성자를 추가한다.
//15) ArrayList 인스턴스를 생성할 때 초기 크기를 지정하지 않고 생성할 수 있도록 기본 생성자를 추가한다.
//16) 배열 크기를 지정할 때 기본 크기보다 큰 값이 되도록 생성자를 변경한다.
//17) 배열의 기본 크기를 직접 숫자로 지정하지말고 상수를 사용하여 지정한다.
//18) 배열의 크기를 늘릴 때 자바에서 제공하는 Arrays를 사용하여 처리한다.
//19) 배열의 특정 항목을 삭제할 때 배열 복사 기능을 이용하여 처리한다.
//20) ArrayList에 보관되어 있는 인스턴스 목록에 배열로 리턴하는 toArray() 메소드를 추가한다.
//21) toArray()에서 배열을 복사할 때 Arrays.copyOf) 메서드를 활용해보자
public class MyArrayList {

  // 1. 필드
  private static final int DEFAULT_CAPACITY = 5; // 클래스 내부에서만 공개
  private Object[] elementData;   // 오브젝트 레퍼런스 배열을 만들어서 elementData에 배열 주소를 저장!
  private int size;   // 배열의 갯수를 늘린다.

  // 2. 생성자
  public MyArrayList() {
    elementData = new Object[DEFAULT_CAPACITY];
  }

  public MyArrayList(int initialCapacity) {
    if (initialCapacity < 5) {
      elementData = new Object[DEFAULT_CAPACITY];
    }
    else {
      elementData = new Object[initialCapacity];
    }
  }


  public boolean add(Object e) { // 주어진 인스턴스(객체)의 맨 끝을 추가함.
    if (size == elementData.length) { // 만약 사이즈가 배열의 길이와 같다면 새로운 배열을 생성해라. 기존 배열 +  새 배열.
      grow();
    }
    elementData[size++] = e; // elementDate 레퍼런스 배열을 size++(증가) 시킨다.
    return true;
  }

  private void grow() {
    //System.out.println("오호라! 배열을 늘리자!");
    int newCapacity = elementData.length + (elementData.length >> 1) ;
    elementData = Arrays.copyOf(elementData, newCapacity); // 복제하고자하는 오리지널 배열주소에 늘어날 배열주소를 넣고 카피하여 리턴해준다.

    /*
    Object[] newArray = new Object[elementData.length + (elementData.length >> 1)]; // 1비트를 오른쪽으로 이동.
    for (int i = 0; i < elementData.length; i++) {
      newArray[i] = elementData[i];
    }
    elementData = newArray; // 반복문이 끝났을 경우 기존 배열에서 newArray으로 교체한다. */
  }

  public void add(int index, Object element) {
    if (size == elementData.length) {
      grow();
    }
    if (index < 0 || index > size) { // 만약 인덱스가 0보다 작거나, size보다 클 때는 예외를 준다.
      throw new ArrayIndexOutOfBoundsException("인덱스가 유효하지 않습니다");
    }
    for (int i = size; i > index ; i--) { // i 값은 들어가려는 곳(index, 0) 보다 커야한다.
      elementData[i] = elementData[i - 1];
    }
    elementData[index] = element; // 현재 인덱스 위치에 넣어라.
    size++;
  }

  public Object get(int index) {
    if (index < 0 || index >=size) {// index 배열 전체 크기
      // 배열의 전체 크기가 0보다 작거나, size보다
      throw new ArrayIndexOutOfBoundsException("인덱스가 유효하지 않습니다");
    }
    return elementData[index];
  }

  public Object set(int index, Object element) {
    if (index < 0 || index >= size) {
      throw new ArrayIndexOutOfBoundsException("인덱스가 유효하지 않습니다");
    }
    Object old = elementData[index]; // 배열에서 현재 교체하려는 값을 다른 변수에 담는다.
    elementData[index] = element; // 현재 위치에 파라미터로 받은 값을 새로 세팅한다.
    return old; // 리턴값은 이전(변경하기 전 값) 인스턴스의 주소를 리턴.
  }

  public Object remove(int index) {
    Object old = elementData[index];

    System.arraycopy(
        elementData, // 복사 대상
        index + 1, // 복사할 항목의 시작 인덱스
        elementData, // 목적지
        index, // 복사 목적지 인덱스
        this.size - (index + 1)); // 복사 할 항목의 개수

    /* for (int i = index; i < size - 1; i++) { // index 최대 배열에서 -1 까지.
      elementData[i] = elementData[i + 1]; // 현재 위치에서 i값에 +1해서 세팅한다.
    } */

    size--; // 배열을 줄인다.
    elementData[size] = null;
    // 쓰지 않는 인스턴스의 주소를 제거하여
    // 가비지가 될 수 있게 한다.
    return old;
  }

  public Object[] toArray() {
    Object[] arr = Arrays.copyOf(elementData, this.size);
    // System.out.println(elementData == arr);
    return arr;

    /* Object[] arr = new Object[this.size];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = elementData[i];
    }
    return arr;*/
  }

  public int size() {
    return this.size;
  }

}
