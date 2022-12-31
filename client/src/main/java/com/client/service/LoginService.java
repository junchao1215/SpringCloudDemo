package com.client.service;

import com.client.auth.LoginResult;
import com.client.auth.SysUser;

public interface LoginService {
    LoginResult login(SysUser user);
}
