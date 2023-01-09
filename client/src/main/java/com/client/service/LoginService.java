package com.client.service;

import com.client.auth.User;
import com.client.common.Result;

public interface LoginService {
    Result login(User user);
    Result logout();
}
