package com.client.auth;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.client.common.JsonResult;
import com.client.common.ResultTool;
import io.jsonwebtoken.Jwts;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

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
//        //设置客户端的响应的内容类型
//        httpServletResponse.setContentType("application/json;charset=UTF-8");
//        //获取当登录用户信息
//        User user = (User) authentication.getPrincipal();
//
//        //生成token
//        String token = jwtUtils.generateToken(user);
//        //设置token的签名密钥以及过期时间
//        long expireTime = Jwts.parser()
//                .setSigningKey(jwtUtils.getSecret())  //设置签名密钥
//                .parseClaimsJws(token.replace("jwt_", ""))
//                .getBody().getExpiration().getTime();//设置火气时间
//
//        //创建LoginResult登陆结果对象
//        LoginResult loginResult = new LoginResult(user.getId(), ResultCode.SUCCESS,token,expireTime);
//
//        //消除循环引用
//        String result = JSON.toJSONString(loginResult, SerializerFeature.DisableCircularReferenceDetect);
//        //获取输出流
//        ServletOutputStream outputStream = httpServletResponse.getOutputStream();
//        outputStream.write(result.getBytes(StandardCharsets.UTF_8));
//        outputStream.flush();
//        outputStream.close();



    }
}
