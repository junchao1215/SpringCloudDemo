package entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@TableName("parent_student")
public class ParentStudent {
    @TableId(type = IdType.ASSIGN_ID)
    private Long id;
    private Long parent;
    private Long student;
}
