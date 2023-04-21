package com.client.dto;

import entity.Level;
import entity.Parent;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Setter
@Getter
public class StudentRequest implements Serializable {
    private Long id;
    /**to
     * 学生姓名
     */
    private String studentNm;
    /**
     * 学号
     * 业务唯一主键
     */
    private String studentNo;

    /**
     * 性别
     */
    private int sex;
    /**
     * 年龄
     */
    private int age;
    /**
     * 删除状态
     */
    private int stat;
    private Date updateDt;
    /**
     * 家长
     */
    private List<Parent> parentList;
    /**
     * 班级
     */
    private List<Level> levels;

    private String url;


}
