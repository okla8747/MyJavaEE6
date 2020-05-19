package com.javaee.code.class2.service;

import com.javaee.code.class2.dao.StudentHomeworkDao;
import com.javaee.code.class2.entity.StudentHomework;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentHomeworkService {

    @Autowired
    StudentHomeworkDao studentHomeworkDao;

    /**
     * 查询所有作业
     * @return
     * @throws Exception
     */
    public List<StudentHomework> selectAll() throws Exception{
        return studentHomeworkDao.selectAll();
    }

    /**
     * 根据id查询学生作业
     * @param id
     * @return
     * @throws Exception
     */
    public List<StudentHomework> selectByHwId(long id) throws Exception{
        return studentHomeworkDao.selectByHwId(id);
    }

    /**
     * 学生提交作业（）
     * @param sh
     * @return
     * @throws Exception
     */
    public  boolean submit(StudentHomework sh) throws Exception{
        return studentHomeworkDao.submit(sh);
    }

}
