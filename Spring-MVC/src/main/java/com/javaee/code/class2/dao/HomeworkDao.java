package com.javaee.code.class2.dao;

import com.javaee.code.class2.entity.Homework;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author fuyongle
 * @version 1.0
 * @date 2020-5-17
 */
@Repository
public interface HomeworkDao {
    /**
     * 发布作业
     * @param hw
     * @return
     */
    public boolean addHomework(Homework hw) throws Exception;

    /**
     * 获得作业列表
     * @return
     */
    public List<Homework> selectAll() throws Exception;

    /**
     * 根据作业id获得查询作业
     * @param id
     * @return
     */
    public Homework selectById(Long id) throws Exception;
}
