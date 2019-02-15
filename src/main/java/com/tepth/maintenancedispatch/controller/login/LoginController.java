package com.tepth.maintenancedispatch.controller.login;

import com.tepth.maintenancedispatch.dto.UserLoginResponse;
import com.tepth.maintenancedispatch.dto.inner.BaseResponse;
import com.tepth.maintenancedispatch.service.login.ILoginService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dispatch")
@Slf4j
public class LoginController {


    @Autowired
    ILoginService loginService;

    @PostMapping("login")
    public BaseResponse login(String loginName, String pwd){

        UserLoginResponse response = loginService.login(loginName, pwd);

        //
        return response;
    }


}
