package com.client.feign.error;

import common.ResultCode;
import feign.Response;
import feign.RetryableException;
import feign.codec.ErrorDecoder;
import global.ExceptionDefine;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignErrorDecoder extends ErrorDecoder.Default{
    @Override
    public Exception decode(String methodKey, Response response) {
       Exception exception= super.decode(methodKey, response);
       if(exception instanceof RetryableException){
            return exception;
       }
       else {
            exception = new ExceptionDefine(ResultCode.FEIGN_ERROR);
       }
        return exception;
    }
}
