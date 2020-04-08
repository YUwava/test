package com.csdj;


import com.csdj.erpcommon.pojo.name;
import com.csdj.erpcommon.pojo.qh;
import com.csdj.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("qh")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("show")
    public List<qh> getAllUser(){
        return userService.getAllUser();
    }
}
