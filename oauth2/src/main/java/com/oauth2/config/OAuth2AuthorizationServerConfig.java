package com.oauth2.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;

@EnableAuthorizationServer
@Configuration
public class OAuth2AuthorizationServerConfig extends AuthorizationServerConfigurerAdapter {
    private static final String JWT_SINGING_KEY = "my-sign-key-xxxxxx";

    @Autowired
    AuthenticationManager authenticationManager;
//
//    @Autowired
//    UserDetailsService userDetailsService;
    @Autowired
    PasswordEncoder passwordEncoder;




    @Override
    public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
        clients.inMemory()
                //配置client-id
                .withClient("client")
                //配置client-secret
                .secret(passwordEncoder.encode("123456"))
                .resourceIds("oauth2-server")
                //配置访问token的有效期
//                .accessTokenValiditySeconds(3600)
                //配置redirect_uri,用于授权成功后跳转
                .redirectUris("http://www.baidu.com")
                //配置申请的权限范围
                .scopes("all")
                .autoApprove(true)
                //配置grant_type,表示授权类型
                .authorizedGrantTypes("authorization_code", "password", "implicit","client_credentials","refresh_token");

    }

    @Override
    public void configure(AuthorizationServerEndpointsConfigurer endpoints) throws Exception {
        endpoints.authenticationManager(authenticationManager);
    }







}
