package com.example.demo.controller;

import com.example.demo.core.response.DataRespone;
import com.example.demo.db.model.StudentHomework;
import com.example.demo.db.service.StudentHomeworkService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author fuyongle
 * @version 1.0
 * @date 2020-517
 */
@RestController
@RequestMapping("/api")
public class ApiController {
    private final StudentHomeworkService studentHomeworkService;

    public ApiController(StudentHomeworkService studentHomeworkService){
        this.studentHomeworkService=studentHomeworkService;
    }

    @RequestMapping("/studenthomework/list")
    public DataRespone<List<StudentHomework>> studenthomeworkList(){
        DataRespone<List<StudentHomework>> respone=new DataRespone<>();
        List<StudentHomework> list= studentHomeworkService.findAll();
        respone.setData(list);

        return respone;
    }
}
