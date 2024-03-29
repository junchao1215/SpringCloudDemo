package entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Organ {
    @TableId(type = IdType.ASSIGN_ID)
    private Long id;
    private String organDesc;
    private Long parentId;
    private String type;
    private String remark;
    private String regeditUserId;
}
