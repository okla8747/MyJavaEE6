package com.javaee.code.class2.dao;

import com.javaee.code.class2.entity.Student;

import java.util.List;

/**
 * @author fuyongle
 * @version 1.0
 * @date 2020-5-17
 */
public interface StudentDao {
    /**
     * 老师添加学生
     * @param student
     * @return
     */
    public  boolean addStudent(Student student) throws Exception;

    /**
     * 查询学生名单
     * @return
     */
    public List<Student> selectAll() throws Exception;

    /**
     * 根据id查询学生
     * @param id
     * @return
     * @throws Exception
     */
    public  Student selectById(long id) throws Exception;
}
