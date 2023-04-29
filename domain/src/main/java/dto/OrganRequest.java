package dto;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class OrganRequest {
    @TableId(type = IdType.ASSIGN_ID)
    private Long id;
    private String organDesc;
    private Long parentId;
    private String type;
    private String remark;
    private String regeditUserId;
}
