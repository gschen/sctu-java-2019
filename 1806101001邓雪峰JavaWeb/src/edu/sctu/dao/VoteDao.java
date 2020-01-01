package edu.sctu.dao;

import edu.sctu.model.Teacher;

import java.util.List;

public interface VoteDao {
    void voteTeacher(String tno);

    List<Teacher> selectAll();
    Teacher findByTno(String tno);
}
