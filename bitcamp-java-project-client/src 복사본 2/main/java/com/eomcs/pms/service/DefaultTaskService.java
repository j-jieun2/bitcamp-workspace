package com.eomcs.pms.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.eomcs.pms.dao.MemberDao;
import com.eomcs.pms.dao.ProjectDao;
import com.eomcs.pms.dao.TaskDao;
import com.eomcs.pms.domain.Task;

public class DefaultTaskService implements TaskService {
  TaskDao taskDao;
  MemberDao memberDao;
  ProjectDao projectDao;

  public DefaultTaskService(TaskDao taskDao, MemberDao memberDao, ProjectDao projectDao) {
    this.taskDao = taskDao;
    this.memberDao = memberDao;
    this.projectDao = projectDao;
  }

  @Override
  public List<Task> listByProject(int projectNo) throws Exception {
    HashMap<String,Object> map = new HashMap<>();
    map.put("projectNo", projectNo);
    return taskDao.findAll(map);
  }

  @Override
  public int add(Task task) throws Exception {
    return taskDao.insert(task);
  }

  @Override
  public Task get(int no) throws Exception {
    return taskDao.findByNo(no);
  }

  @Override
  public int delete(int no) throws Exception {
    return taskDao.delete(no);
  }

  @Override
  public List<Task> list(Map<String,Object> map) throws Exception {
    return taskDao.findAll(map);
  }

  @Override
  public int update(Task task) throws Exception {
    return taskDao.update(task);
  }
}
