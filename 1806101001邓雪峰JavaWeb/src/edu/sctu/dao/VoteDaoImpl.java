package edu.sctu.dao;

import edu.sctu.model.Teacher;
import edu.sctu.utils.DatabaseManager;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class VoteDaoImpl implements VoteDao {
    private DatabaseManager databaseManager = new DatabaseManager();



    @Override
    public void voteTeacher(String tno) {
        Teacher teacher = findByTno(tno);
        teacher.setVoteNum(teacher.getVoteNum()+1);

        String sql = "update votes(voteNum) set voteNum ="+teacher.getVoteNum()+"  whre tno = '"+tno+"'";
        Statement statement = databaseManager.open();
        try {
            statement.executeUpdate(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Teacher> selectAll() {
        Statement statement = databaseManager.open();
        String sql = "select * from votes";
        List<Teacher> teacherList = new ArrayList<>();

        try {
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()){
                int id = resultSet.getInt(1);
                String tno =resultSet.getString(2);
                String realName = resultSet.getCursorName();
                int voteNum = resultSet.getInt(4);

                Teacher teacher = new Teacher();
                teacher.setVoteNum(voteNum);
                teacher.setRealName(realName);
                teacher.setTno(tno);
            }

        }catch (SQLException e){

        }

        return teacherList;
    }

    @Override
    public Teacher findByTno(String tno) {

        String sql = "select * from votes where tno ="+tno;
        Statement statement = databaseManager.open();
        Teacher teacher = new Teacher();
        try {
            ResultSet resultSet = statement.executeQuery(sql);
            teacher.setTno(resultSet.getString(2));
            teacher.setRealName(resultSet.getString(3));
            teacher.setVoteNum(resultSet.getInt(4));

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
