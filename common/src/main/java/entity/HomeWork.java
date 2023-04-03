package entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.List;

@Data
public class HomeWork {
    @TableId(type = IdType.ASSIGN_ID)
    private Long id;
    /**
     * 发布
     * 线束
     */
    private int status;
    //发布人
    private String publisher;
    //发布时间
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @TableField(fill = FieldFill.INSERT)
    private String createDt;
    //结束时间
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @TableField(fill = FieldFill.INSERT)
    private String endDt;
    //标题
    private String title;
    //科目
    private String course;
    //内容
    private String content;
    //附件
    private String files;
    //班级
    private String level;
    @TableField(exist = false)
    private List<String> urls;
}
