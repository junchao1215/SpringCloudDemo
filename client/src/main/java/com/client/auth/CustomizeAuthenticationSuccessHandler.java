package com.client.auth;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import entity.User;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;
import util.JwtUtil;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

@Component
public class CustomizeAuthenticationSuccessHandler implements AuthenticationSuccessHandler {
    @Resource
    private JwtUtil jwtUtils;
    @Override
    public void onAuthenticationSuccess(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Authentication authentication) throws IOException, ServletException {
        //设置客户端的响应的内容类型
        httpServletResponse.setContentType("application/json;charset=UTF-8");
        //获取当登录用户信息
        LoginUser user = (LoginUser) authentication.getPrincipal();

        String result = JSON.toJSONString(user, SerializerFeature.DisableCircularReferenceDetect);
        //获取输出流
        ServletOutputStream outputStream = httpServletResponse.getOutputStream();
        outputStream.write(result.getBytes(StandardCharsets.UTF_8));
        outputStream.flush();
        outputStream.close();



    }
}
