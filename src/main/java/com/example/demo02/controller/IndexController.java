package com.example.demo02.controller;

import com.example.demo02.entity.User;

import com.sun.deploy.net.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
//import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpServletRequest;

@Controller

public class IndexController {
@GetMapping(value = {"/","/login"})
public String loginPage(){

    return "login";
}
@PostMapping("/login")
public String indexPage(User user, HttpServletRequest request, Model model){
    System.out.println(user);
    if (!StringUtils.isEmpty(user.getUserName())&&StringUtils.hasLength(user.getPassword())){

        request.setAttribute("user",user);
        return "redirect:/main.html";
    }else {
        model.addAttribute("msg","请重新输入密码！");
        return "login";
    }
}
@GetMapping("/main.html")
public String mainPage(){

    return "main";
}
}
