package entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Builder;
import lombok.Data;

@Data
@TableName("teacher_level")
@Builder
public class TeacherLevel {
    @TableId(type = IdType.ASSIGN_ID)
    private Long id;
    private Long level;
    private Long teacher;
}
