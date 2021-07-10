package com.bjpowernode.crm.settings.service;

import com.bjpowernode.crm.exception.LoginException;
import com.bjpowernode.crm.settings.domain.User;

/**
 * @author 郑镐
 * @version 1.0
 * @date 2021/7/9 0009 19:15
 */
public interface UserService {
    User login(String loginAct, String loginPwd, String ip) throws LoginException;
}
