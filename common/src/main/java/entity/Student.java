package entity;

import com.baomidou.mybatisplus.annotation.*;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Setter
@Getter
public class Student implements Serializable {
    @TableId(type=IdType.ASSIGN_ID)
    private Long id;
    /**
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
    @TableLogic(value = "0",delval = "1")
    private int stat;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updateDt;
    /**
     * 家长
     */
    @TableField(exist = false)
    private List<Parent> parentList;
    /**
     * 班级
     */
    @TableField(exist = false)
    private List<Level> levels;

    private String url;


}
