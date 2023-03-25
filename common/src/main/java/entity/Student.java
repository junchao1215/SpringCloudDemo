package entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Getter;
import lombok.Setter;
@Setter
@Getter
public class Student {
    @TableId(type=IdType.ASSIGN_ID)
    private Long id;
    private String studentNm;
    private String studentNo;
    private int sex;
    private int age;
}
