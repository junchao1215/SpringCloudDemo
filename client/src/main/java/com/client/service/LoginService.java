package com.client.service;

import com.client.auth.ResponseResult;
import com.client.auth.User;

public interface LoginService {
    ResponseResult login(User user);
    ResponseResult logout();
}
