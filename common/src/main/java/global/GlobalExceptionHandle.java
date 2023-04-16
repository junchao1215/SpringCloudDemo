package global;

import common.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author Yoko
 * @date 2021/11/19
 */
@Slf4j
@RestControllerAdvice(annotations = RestController.class)
public class GlobalExceptionHandle {

    /**
     * 业务异常处理
     */
    @ExceptionHandler(value = ExceptionDefine.class)
    @ResponseBody
    public Result exceptionHandler(ExceptionDefine e) {
        return Result.fail(e.getCode(), e.getMessage());
    }




}