package entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.List;

@Data
public class FinishHomeWork {
    @TableId(type = IdType.ASSIGN_ID)
    private Long id;
    //作业ID
    private Long PubWorkId;
    /**
     * 编辑
     * 发布
     * 线束
     */
    private int status;
    //学生
    private String finisher;
    //家长是否参与
    private boolean isJoin;
    //家长集合
    @TableField(exist = false)
    private List<Parent> list;
    //发布时间
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @TableField(fill = FieldFill.INSERT)
    private String finishDt;
    //标题
    private String title;
    //科目
    private String course;
    //内容
    private String content;
    //班级
    private String level;
    @TableField(exist = false)
    private List<String> url;

}
