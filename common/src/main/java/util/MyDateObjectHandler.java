package util;


import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.reflection.MetaObject;

import java.util.Date;

/**
 * 创建时间和更新时间自动更新
 */
@Slf4j
public class MyDateObjectHandler implements MetaObjectHandler {

    public void insertFill(MetaObject metaObject) {
//        log.info("come to insert fill .........");
        //setFieldValByName(String fieldName, Object fieldVal, MetaObject metaObject)
        this.setFieldValByName("createTime",new Date(),metaObject);
        this.setFieldValByName("updateDt",new Date(),metaObject);
    }

    public void updateFill(MetaObject metaObject) {
//        log.info("come to update fill .......");

        this.setFieldValByName("updateDt",new Date(),metaObject);

    }
}
