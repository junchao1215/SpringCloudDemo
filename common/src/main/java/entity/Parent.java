package entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Parent  {
    @TableId(type = IdType.ASSIGN_ID)
    private Long id;
    private String studentNo;
    @TableField(exist = false)
    private Student student;
    private String parentNm;
    private String idNo;
    private String relation;
}
