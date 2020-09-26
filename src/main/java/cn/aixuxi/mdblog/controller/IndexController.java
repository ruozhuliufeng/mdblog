package cn.aixuxi.mdblog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 类描述 首页控制
 *
 * @author ruozhuliufeng
 * @version 1.0
 * @date 2020/9/21 13:55
 */
@Controller
public class IndexController {

    @ResponseBody
    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }
}
