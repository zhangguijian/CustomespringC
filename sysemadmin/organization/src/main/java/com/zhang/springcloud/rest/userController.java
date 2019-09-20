package com.zhang.springcloud.rest;

import com.zhang.springcloud.common.entity.form.UserForm;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.zhang.springcloud.common.entity.Vo.Result;

import javax.validation.Valid;

@Slf4j
@RestController
@RequestMapping("/user")
public class userController {
    @PostMapping
    public Result add(@Valid @RequestBody UserForm userForm){

    }
}
