package com.javaee.code.class2.jdbc;

import com.javaee.code.class2.entity.StudentHomework;
import org.springframework.stereotype.Service;

import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

@Service
public class StudentHomeworkJDBC {

    public  List<StudentHomework> selectAll() {//查看所有作业
        //查询语句
        String sqlString = "select * from s_student_homework";

        List<StudentHomework> list =new ArrayList<StudentHomework>();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try (Connection conn = DatabasePool.getHikariDataSourse().getConnection()) {//获得数据库连接
            try (Statement st = conn.createStatement()) {
                try (ResultSet rs = st.executeQuery(sqlString)) {//执行查询语句
                    //打印查询结果
                    while (rs.next()) {
                        StudentHomework sh=new StudentHomework();
                        sh.setId(rs.getLong(1));
                        sh.setStudentId(rs.getLong(2));
                        sh.setHomeworkId(rs.getLong(3));
                        sh.setHomeworkTitle(rs.getString(4));
                        sh.setHomeworkContent(rs.getString(5));
                        sh.setSubmitTime(simpleDateFormat.format(rs.getDate(6)));
                        list.add(sh);
                        System.out.println(sh.toString());
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    public  List<StudentHomework> selectByHwid(long id){//根据作业ID查看所有学生提交的作业
        //查询语句
        String sqlString = "select * from s_student_homework where homework_id="+id;

        List<StudentHomework> list =new ArrayList<StudentHomework>();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try (Connection conn = DatabasePool.getHikariDataSourse().getConnection()) {//获得数据库连接
            try (Statement st = conn.createStatement()) {
                try (ResultSet rs = st.executeQuery(sqlString)) {//执行查询语句
                    //打印查询结果
                    while (rs.next()) {
                        StudentHomework sh=new StudentHomework();
                        sh.setId(rs.getLong(1));
                        sh.setStudentId(rs.getLong(2));
                        sh.setHomeworkId(rs.getLong(3));
                        sh.setHomeworkTitle(rs.getString(4));
                        sh.setHomeworkContent(rs.getString(5));
                        /*sh.setSubmitTime(simpleDateFormat.format(rs.getDate(6)));*/
                        sh.setSubmitTime(rs.getString(6));
                        list.add(sh);
                        System.out.println(sh.toString());
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    public  boolean submit(StudentHomework sh){//提交作业
        //查询语句
        String sqlString = "insert into s_student_homework value("+sh.getId()+","+sh.getStudentId()+","+sh.getHomeworkId()+","+"'"+sh.getHomeworkTitle()+"'"+","+"'"+sh.getHomeworkContent()+"'"+","+"'"+sh.getSubmitTime()+"'"+")";
        try (Connection conn = DatabasePool.getHikariDataSourse().getConnection()) {//获得数据库连接
            try (Statement st = conn.createStatement()) {
                try  {//执行插入语句
                    st.executeUpdate(sqlString);
                    conn.commit();
                    return true;
                }catch (SQLException e){
                    conn.rollback();
                    e.printStackTrace();
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}
