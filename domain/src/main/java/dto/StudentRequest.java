package dto;

import entity.Level;
import entity.Parent;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Data
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
