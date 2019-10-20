package com.ssm.controller;

import com.ssm.model.Country;
import com.ssm.model.User;
import com.ssm.service.IUserService;
import com.ssm.service.impl.UserServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class MainController {
    private IUserService service = new UserServiceImpl();

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String index(User user) {
        return "index";
    }

    @RequestMapping(value = "/nice", method = RequestMethod.GET)
    @ResponseBody
    public List<User> nice(Model model) {
        return service.getAllUsers();
    }

    @RequestMapping(value = "/toJson", method = RequestMethod.POST)
    @ResponseBody
    public User toJson(User user) {
        service.addUser(user); //一起测试了
        return service.findUserById(2);
    }

    @RequestMapping(value = "/getCountry", method = RequestMethod.POST)
    @ResponseBody
    public Country getCountry(Country contry) {
//        service.getCountry(contry);
        return service.getCountry(contry);
    }

}
