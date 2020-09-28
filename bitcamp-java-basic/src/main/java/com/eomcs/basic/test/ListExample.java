package com.eomcs.basic.test;

import java.util.List;
import com.eomcs.basic.test.Exam003.BoardDao;

public class ListExample {
  public static void main(String[] args) {

    BoardDao dao = new BoardDao();
    List<Board> list = dao.getBoardList();
    for (Board board : list) {
      System.out.println(board.getTitle() + " - " + board.getContent());
    }
  }
}
