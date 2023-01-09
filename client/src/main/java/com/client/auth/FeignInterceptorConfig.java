package com.client.auth;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * Feign请求拦截器配置.
 *
 * @author linzp
 * @version 1.0.0
 * @date 2021/4/16 21:19
 */
@Configuration
public class FeignInterceptorConfig implements RequestInterceptor {

    public FeignInterceptorConfig() {}

    @Override
    public void apply(RequestTemplate template) {
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        //设置token到请求头
        template.header("token",request.getHeader("token"));
      ;
    }
}
