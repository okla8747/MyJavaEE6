package com.example.demo.db.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;

/**
 * @author fuyongle
 * @version 1.0
 * @date 2020-517
 */
@Entity
@Table(name = "s_student_homework")
@Data
public class StudentHomework {
    @Id
    private Long id;

    private Long studentId;

    private Long homeworkId;

    private String homeworkTitle;

    private String homeworkContent;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:SS")
    private Date submitTime;



}
