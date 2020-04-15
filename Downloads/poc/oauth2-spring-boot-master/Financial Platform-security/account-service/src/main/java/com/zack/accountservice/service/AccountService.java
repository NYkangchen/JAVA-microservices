package com.zack.accountservice.service;

import com.zack.accountservice.dto.UserDto;
import com.zack.accountservice.dto.UserRegistrationDto;

public interface AccountService {

    /**
     * Invokes Auth Service user creation
     *
     * @param user
     * @return created account
     */
    UserDto create(UserRegistrationDto user);
}
