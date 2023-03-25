package entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Setter
@Getter
public class Teacher implements Serializable {
    @TableId(type = IdType.ASSIGN_ID)
    private Long id;
    private String teacherNm;
    private int sex;
    private String teacherNo;
    private int post;
}
