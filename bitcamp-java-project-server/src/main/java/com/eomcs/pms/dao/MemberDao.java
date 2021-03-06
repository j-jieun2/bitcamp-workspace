package com.eomcs.pms.dao;

import java.util.List;
import java.util.Map;
import com.eomcs.pms.domain.Member;

public interface MemberDao {
  int insert(Member member) throws Exception;
  int delete(int no) throws Exception;
  Member findByNo(int no) throws Exception;
  List<Member> findByName(String name) throws Exception;
  List<Member> findAll() throws Exception;
  int update(Member member) throws Exception;
  List<Member> findByProjectNo(int projectNo) throws Exception;
  Member findByEmailPassword(Map<String,Object> params) throws Exception;
  Member findByEmail(String email);
}




