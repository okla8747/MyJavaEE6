package com.javaee.code.class2.service;

import com.javaee.code.class2.dao.HomeworkDao;
import com.javaee.code.class2.entity.Homework;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HomeworkService {

    @Autowired
    HomeworkDao homeworkDao;

    public boolean addHomework(Homework hw) throws Exception{
        return homeworkDao.addHomework(hw);
    }

    public List<Homework> selectAll() throws Exception{
        return homeworkDao.selectAll();
    }

    public Homework selectById(Long id) throws Exception{
        return homeworkDao.selectById(id);
    }
}
