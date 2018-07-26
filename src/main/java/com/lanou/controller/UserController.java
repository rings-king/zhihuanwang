package com.lanou.controller;

import com.lanou.model.User;
import com.lanou.service.Userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    private Userservice userservice;
    @RequestMapping("insert")
    @ResponseBody
    public String insert(User user){
        int i = userservice.insert(user);
        if (i!=0)

        return "success";
      else
          return  "false";
    }
    @RequestMapping("search")
    public String  selectAll(Model model){
      List<User> users = userservice.selectAll();
      model.addAttribute("users",users);
      return "success";

    }
    @RequestMapping("login")
    public String login(){
        System.out.println("hahayyha");
        return "login";
    }

    public void afd(){
        System.out.println("afdhaobangbang");
    }





}
