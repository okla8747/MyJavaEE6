package com.javaee.code.class2.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Homework {

    private long id;

    private String title;

    private String content;

    private String createTime;

    private String deadline;

//    public Homework(long id, String title, String content, String createTime, String deadline) {
//        this.id = id;
//        this.title = title;
//        this.content = content;
//        this.createTime = createTime;
//        this.deadline = deadline;
//    }
//    public Homework() {
//
//    }
//
//    public long getId() {
//        return id;
//    }
//
//    public String getTitle() {
//        return title;
//    }
//
//    public String getContent() {
//        return content;
//    }
//
//    public String getCreateTime() {
//        return createTime;
//    }
//
//    public String getDeadline() {
//        return deadline;
//    }
//
//    public void setId(long id) {
//        this.id = id;
//    }
//
//    public void setTitle(String title) {
//        this.title = title;
//    }
//
//    public void setContent(String content) {
//        this.content = content;
//    }
//
//    public void setCreateTime(String createTime) {
//        this.createTime = createTime;
//    }
//
//    public void setDeadline(String deadline) {
//        this.deadline = deadline;
//    }

    @Override
    public String toString() {
        return "homework{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", createTime=" + createTime +
                ", deadline=" + deadline +
                '}';
    }
}
