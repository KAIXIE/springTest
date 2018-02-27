package com.qianliying.service.impl;

import com.qianliying.mapper.UserEntityMapper;
import com.qianliying.po.UserEntity;
import com.qianliying.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Desc:用户表相关的servie接口实现类
 *
 * Created by hafiz.zhang on 2016/8/27.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserEntityMapper mapper;

    public List<UserEntity> getAllUsers() {
        return mapper.getAllUsers();
    }
}
