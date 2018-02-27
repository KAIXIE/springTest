package com.qianliying.service;

import com.qianliying.po.UserEntity;

import java.util.List;

public interface UserService {
    /**
     * 获取所有的用户信息
     *
     * @return
     */
    List<UserEntity> getAllUsers();
}
