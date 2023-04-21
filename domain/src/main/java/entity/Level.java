package entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.util.List;

@Data
public class Level {
    @TableId(type = IdType.ASSIGN_ID)
    private Long id;
    //年级
    private String gradeLevel;
    //班
    private String classLevel;
    //描述
    private String remark;
    //学校
    private String organId;
    @TableField(exist = false)
    private List<Teacher> teachers;
    @TableField(exist = false)
    private List<HomeWork> homeWorks;
    @TableField(exist = false)
    private List<Student> students;
}
