package com.javaee.code.class2.dao;

import com.javaee.code.class2.entity.StudentHomework;

import java.util.List;

/**
 * @author fuyongle
 * @version 1.0
 * @date 2020-5-17
 */
public interface StudentHomeworkDao {
    /**
     * 查询所有学生作业
     * @return
     */
    public List<StudentHomework> selectAll() throws Exception;

    /**
     * 根据ID查询学生作业
     * @param id
     * @return
     */
    public  List<StudentHomework> selectByHwId(long id) throws Exception;

    /**
     * 提交作业
     * @param sh
     * @return
     */
    public  boolean submit(StudentHomework sh) throws Exception;

}
