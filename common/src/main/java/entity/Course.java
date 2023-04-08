package entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

@Data
public class Course {
    @TableId(type = IdType.ASSIGN_ID)
    private Long id;
    private String title;
    private String content;
    private String author;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date publishDate;
    private String level;
    @TableField(exist = false)
    private String urls;

}
