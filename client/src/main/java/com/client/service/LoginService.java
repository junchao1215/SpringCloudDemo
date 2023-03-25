package com.client.service;

import com.client.auth.LoginUser;
import com.client.auth.User;
import common.Result;

public interface LoginService {
    Result<LoginUser> login(User user);
    Result<LoginUser> logout();
}
