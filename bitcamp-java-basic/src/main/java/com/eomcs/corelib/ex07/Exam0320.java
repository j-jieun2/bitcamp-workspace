// HashSet과 사용자 정의 데이터 타입 - equals()만 오버라이딩
package com.eomcs.corelib.ex07;

import java.util.HashSet;
import java.util.Iterator;

public class Exam0320 {

  // 사용자 정의 데이터 타입
  static class Member {


    String name;
    int age;

    // 생성자
    public Member(String name, int age) {
      this.name = name;
      this.age = age;
    }

    @Override
    public String toString() {
      return "Member [name = " + name + ", age = " + age + "]";
    }

    @Override
    public boolean equals(Object obj) {
      if (this == obj)
        return true;
      if (obj == null)
        return false;
      if (getClass() != obj.getClass())
        return false;
      Member other = (Member) obj;
      if (age != other.age)
        return false;
      if (name == null) {
        if (other.name != null)
          return false;
      } else if (!name.equals(other.name))
        return false;
      return true;
    }
  }

  public static void main(String[] args) {
    Member v1 = new Member("홍길동", 20);
    Member v2 = new Member("임꺽정", 30);
    Member v3 = new Member("유관순", 16);
    Member v4 = new Member("안중근", 20);
    Member v5 = new Member("유관순", 16);

    System.out.printf("equlas(): %b\n", v3.equals(v5));
    System.out.println("------------------------------");

    HashSet set = new HashSet();
    set.add(v1);
    set.add(v2);
    set.add(v3);
    set.add(v4);
    set.add(v5);

    Iterator 값 = set.iterator();
    while (값.hasNext()) {
      System.out.println(값.next() + " ");
    }
    System.out.println();

  }
}
