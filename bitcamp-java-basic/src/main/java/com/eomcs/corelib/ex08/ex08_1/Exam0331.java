// Hashtable과 Iterator
package com.eomcs.corelib.ex08.ex08_1;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;
import com.eomcs.corelib.ex08.Member;

public class Exam0331 {
  public static void main(String[] args) {
    Member v1 = new Member("홍길동", 20);
    Member v2 = new Member("임꺽정", 30);
    Member v3 = new Member("유관순", 16);
    Member v4 = new Member("안중근", 20);
    Member v5 = new Member("윤봉길", 25);

    Hashtable table = new Hashtable();
    table.put("s01", v1);
    table.put("s02", v2);
    table.put("s03", v3);
    table.put("s04", v4);
    table.put("s05", v5);

    Set keys = table.keySet();
    Iterator iterator = keys.iterator();

    // 값을 iterator에 저장 후 목록 값을 변경하면 오류
    table.remove("s01");
    table.remove("s02");
    table.remove("s03");

    while (iterator.hasNext()) {
      System.out.println(iterator.next());
    }
  }

}


