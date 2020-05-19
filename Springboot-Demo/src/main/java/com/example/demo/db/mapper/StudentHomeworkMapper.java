package com.example.demo.db.mapper;

import com.example.demo.db.model.StudentHomework;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.Id;
/**
 * @author fuyongle
 * @version 1.0
 * @date 2020-517
 */
public interface StudentHomeworkMapper extends JpaRepository<StudentHomework,Long> {


}
