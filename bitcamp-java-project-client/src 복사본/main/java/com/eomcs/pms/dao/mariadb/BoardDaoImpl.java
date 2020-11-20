package com.eomcs.pms.dao.mariadb;

import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import com.eomcs.pms.domain.Board;


//  Mybatis 적용
// => SqlSessionFactory를 자체적으로 주지않고
//
public class BoardDaoImpl implements com.eomcs.pms.dao.BoardDao{

  SqlSessionFactory sqlSessionFactory;

  public BoardDaoImpl(SqlSessionFactory sqlSessionFactory) {
    this.sqlSessionFactory = sqlSessionFactory;
  }

  @Override
  public int insert(Board board) throws Exception {
    try (SqlSession sqlSession = sqlSessionFactory.openSession(true)) {
      // => SqlSession 객체에게 insert SQL 문을 실행하라고 명령한다.
      return sqlSession.insert("BoardDao.insert", board);
    }
  }

  @Override
  public int delete(int no) throws Exception {
    try (SqlSession sqlSession = sqlSessionFactory.openSession(true)) {

      return sqlSession.delete("BoardDao.delete", no);
    }
  }

  @Override
  public Board findByNo(int no) throws Exception {
    try (SqlSession sqlSession = sqlSessionFactory.openSession(true)) {

      Board board = sqlSession.selectOne("BoardDao.findByNo", no); // 매퍼의네임스페이스명.SQL아이디
      sqlSession.update("BoardDao.updateViewCount", no);
      return board;
    }
  }

  @Override
  public List<Board> findAll(String keyword) throws Exception {
    try (SqlSession sqlSession = sqlSessionFactory.openSession()) {

      // => SqlSession 객체를 통해 별도 파일에 분리한 SQL을 찾아 실행하라고 명령한다.
      return sqlSession.selectList("BoardDao.findAll", keyword);
    }
  }

  @Override
  public int update(Board board) throws Exception {
    try (SqlSession sqlSession = sqlSessionFactory.openSession(true)) {
      return sqlSession.update("BoardDao.update", board);
    }
  }
}