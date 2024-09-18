package com.hoanghai.Ecommerce.service.interf;

import com.hoanghai.Ecommerce.dto.LoginRequest;
import com.hoanghai.Ecommerce.dto.Response;
import com.hoanghai.Ecommerce.dto.UserDto;
import com.hoanghai.Ecommerce.entity.User;

public interface UserService {
    Response registerUser(UserDto registrationRequest);
    Response loginUser(LoginRequest loginRequest);
    Response getAllUsers();
    User getLoginUser();
    Response getUserInfoAndOrderHistory();
}
