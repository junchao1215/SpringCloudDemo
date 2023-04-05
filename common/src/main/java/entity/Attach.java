package entity;

import com.baomidou.mybatisplus.annotation.*;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Builder;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
@Builder
@TableName("attachment")
public class Attach {
    @TableId(type = IdType.ASSIGN_ID)
    private Long id;
    private Long busiId;
    private String url;
    @TableLogic(value = "0",delval = "1")
    private int isDel;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updateDt;

}
