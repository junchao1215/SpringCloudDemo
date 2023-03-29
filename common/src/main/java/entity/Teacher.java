package entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class Teacher {
    @TableId(type = IdType.ASSIGN_ID)
    private Long id;
    private String studentNo;
    private String teacherNm;
    private int sex;
    private String teacherNo;
    /**
     * 职务：
     * 班主任
     * 校长
     * 普通老
     */
    private int post;
    /**
     * 课别
     * 英文  数学  政治  书法
     */
    private String classType;
    @TableField(exist = false)
    private List<Student> studentList;
}
