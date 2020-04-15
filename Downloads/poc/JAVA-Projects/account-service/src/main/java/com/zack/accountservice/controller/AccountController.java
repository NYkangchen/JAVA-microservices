package com.zack.accountservice.controller;

import com.zack.accountservice.dto.UserDto;
import com.zack.accountservice.dto.UserRegistrationDto;
import com.zack.accountservice.service.AccountService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

    private final AccountService accountService;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @PostMapping
    public UserDto createNewAccount(@RequestBody UserRegistrationDto user) {
        return accountService.create(user);
    }

}
