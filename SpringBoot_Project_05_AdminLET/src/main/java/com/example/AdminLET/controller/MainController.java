package com.example.AdminLET.controller;

import com.example.AdminLET.domain.Message;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {

    @GetMapping({"/", "login"})
    public String login() {
        return "login";
    }

    @PostMapping({"/login.do"})
    public String login(
            @RequestBody(required = false) String username,
            @RequestBody(required = false) String password) {
        System.out.println("username:" + username);
        System.out.println("password:" + password);
        return "redirect:/index";
    }

    @GetMapping({"/index"})
    public String index() {
        return "index";
    }





    @ResponseBody
    @PostMapping({"/{uuid}/msg"})
    public Message recentMessage(@PathVariable String uuid){
//        System.out.println(uuid);   /*模拟获取uuid*/
        Message message = new Message();
        message.setMessage("hello");/*模拟获取json数据*/
        return message;
    }



    /* for test! */
    @GetMapping({"/500"})
    public String fiveZeroZero() {
        return "/error/500";
    }
}