package entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.util.List;

@Data
public class Parent  {
    @TableId(type = IdType.ASSIGN_ID)
    private Long id;
    //父母名称
    private String parentNm;
    //身份证号
    private String idNo;
    //关系
    private String relation;
    //头像
    private String url;

    @TableField(exist = false)
    private List<Student> student;
}
