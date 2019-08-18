package com.qfedu.controller;

import com.qfedu.common.JsonResult;
import com.qfedu.entity.User;

import com.qfedu.service.UserService;
import com.qfedu.utils.StrUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
public class LoginController {
    @Autowired
    private UserService userService;

    @RequestMapping("/login.do")
    @ResponseBody
    public JsonResult login(String username, String password, HttpSession session){
        User u = userService.findUserByName(username,password);
        session.setAttribute(StrUtils.LOGIN_USER, u);
        JsonResult result = new JsonResult(1, null);
        return result;
    }

}
