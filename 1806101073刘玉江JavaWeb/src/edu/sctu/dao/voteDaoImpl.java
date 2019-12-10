package edu.sctu.dao;

import edu.sctu.model.Teacher;
import edu.sctu.utils.DatabaseManager;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class voteDaoImpl implements voteDao {
    private DatabaseManager databaseManager = new DatabaseManager();
    @Override
    public void voteTeacher(String tno)  {
        //先根据工号查到这个老师
        Teacher teacher = findByTno(tno);

        teacher.setVoteNum(teacher.getVoteNum()+1);

        String sql = "update t_votes set voteNum = "+teacher.getVoteNum()+" where tno = '"+tno+"' ";

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

        String sql = "select * from t_votes";

        List<Teacher> teacherList = new ArrayList<>();
        try {
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()){
                int id = resultSet.getInt(1);
                String tno = resultSet.getString(2);
                String realName = resultSet.getString(3);
                int voteNum = resultSet.getInt(4);

                Teacher teacher = new Teacher();
                teacher.setVoteNum(voteNum);
                teacher.setRealName(realName);
                teacher.settNo(tno);

                teacherList.add(teacher);
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }
        return teacherList;
    }

    @Override
    public Teacher findByTno(String tno)  {
        String sql = "select * from t_votes where tno = '"+tno+"' ";
        Statement statement = databaseManager.open();
        Teacher teacher = new Teacher();
        ResultSet resultSet = null;
        try {
            resultSet = statement.executeQuery(sql);
            resultSet.next();
            teacher.settNo(resultSet.getString(2));
            teacher.setRealName(resultSet.getString(3));
            teacher.setVoteNum(resultSet.getInt(4));
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return teacher;
    }

}
