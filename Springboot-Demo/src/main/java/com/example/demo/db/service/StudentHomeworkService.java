package com.example.demo.db.service;

import com.example.demo.db.mapper.StudentHomeworkMapper;
import com.example.demo.db.model.StudentHomework;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author fuyongle
 * @version 1.0
 * @date 2020-517
 */
@Service
public class StudentHomeworkService {

    @Autowired
    private StudentHomeworkMapper studentHomeworkMapper;
    public List<StudentHomework> findAll(){
       return studentHomeworkMapper.findAll();
    }

}
