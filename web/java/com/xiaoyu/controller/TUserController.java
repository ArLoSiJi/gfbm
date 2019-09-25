package com.xiaoyu.controller;

import com.xiaoyu.domain.TUser;
import com.xiaoyu.service.TUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author shkstart@create 2019-09-22 20:36
 */
@Controller
@RequestMapping("/tuser")
public class TUserController {

    @Autowired
    private TUserService tUserService;

    @RequestMapping("/welcome")
    public ModelAndView welcome(){
        return new ModelAndView("main/html/user_login");
    }

    @RequestMapping("/insert")
    @ResponseBody
    public ModelAndView inserUser(@RequestParam TUser tUser){
        return new ModelAndView("main/user_login");
    }

    /**
     * 用户登陆
     * @return
     */
    @RequestMapping("/login")
    public @ResponseBody TUser userLogin(@RequestBody TUser tUser){
        ModelAndView modelAndView = new ModelAndView();

//        tUserService.

        modelAndView.addObject("code","0");
        return null;
    }


    /**
     * 跳转注册页面
     */
    @RequestMapping("/jump/registry")
    public ModelAndView jumpRegister(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("main/html/user_register");
        return modelAndView;
    }

    /**
       用户注册
     */
    @RequestMapping("/register")
    @ResponseBody
    public TUser register(@RequestBody TUser tUser){
        TUser user = new TUser();
        System.out.println("tise="+tUser);

        tUserService.regosterTUser(tUser);
        user.setUpdatebyid("1");
        return user;
    }

}
