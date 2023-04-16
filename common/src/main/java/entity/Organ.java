package entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class Organ {
    @TableId(type = IdType.ASSIGN_ID)
    private Long id;
    private String organDesc;
    private String parentId;
    private String type;
    private String remark;
    private String regeditUserId;
}
