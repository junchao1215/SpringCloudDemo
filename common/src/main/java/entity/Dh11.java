package entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class Dh11 {
    @TableId(type = IdType.ASSIGN_ID)
    private Long id;
    //温度
    private float temperature;
    //湿度
    private float humidity;
    //开关
    private boolean powerSwich;
}
