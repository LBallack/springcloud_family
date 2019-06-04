package com.huawei.cn.serviceribbon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloControler {
    @Autowired
    LPbService lPbService;

    @GetMapping(value = "lpb")
    public String lpb(@RequestParam String name) {
        return lPbService.lpbService(name);
    }
    public String hiError(String name){
        return "hi,"+name+",sorry,error";
    }
}
