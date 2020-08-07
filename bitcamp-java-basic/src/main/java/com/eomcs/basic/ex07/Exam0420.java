//# 메서드 : Heap 메모리 영역

package com.eomcs.basic.ex07;

public class Exam0420 {

  static int[] getArray() {
    int[] arr = new int[] {100, 200, 300};
    return arr;
  }

  public static void main(String[] args) {

  int[] arr;
  arr = getArray(); // 배열을 main() 밖에서 줄 경우 리턴값은 이렇게 출력


  System.out.println(arr[1]); // 200

  }
}