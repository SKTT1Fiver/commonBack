package org.example.commonback.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author SKTT1Fiver
 */
@RestController
public class LoginController  {

    // 登录
    @GetMapping("/hello")
    public String login(){

        return "登录成功";
    }
}
