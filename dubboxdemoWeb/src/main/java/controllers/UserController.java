package controllers;

import Service.IUserService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserController {
    @Reference
    private IUserService userService;

    @RequestMapping("/showname")
    @ResponseBody
    public String GetName() {
        System.out.println(11111);
        return userService.GetName();
    }
}
