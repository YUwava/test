package com.csdj.erpserviceimpl;


import com.csdj.erpcommon.pojo.name;
import com.csdj.erpcommon.pojo.qh;
import com.csdj.erpdao.UserMapper;
import com.csdj.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public List<qh> getAllUser() {
        return userMapper.getAllUser();
    }
}
