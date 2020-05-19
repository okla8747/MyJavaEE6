package com.javaee.code.class2.service;

import com.javaee.code.class2.dao.StudentDao;
import com.javaee.code.class2.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentDao studentDao;

    public List<Student> selectAll() throws Exception{
        return studentDao.selectAll();
    }

    public boolean addStudent(Student student) throws Exception{
        return studentDao.addStudent(student);
    }

    public Student selectById(long id) throws Exception{
        return studentDao.selectById(id);
    }
}
