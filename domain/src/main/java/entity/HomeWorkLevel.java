package entity;

import com.baomidou.mybatisplus.annotation.*;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Builder;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
@Builder
@TableName("home_work_level")
public class HomeWorkLevel {
    @TableId(type = IdType.ASSIGN_ID)
    private Long id;
    private Long homeWork;
    private Long level;


}
