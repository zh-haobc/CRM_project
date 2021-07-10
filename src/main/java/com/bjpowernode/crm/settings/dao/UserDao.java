package com.bjpowernode.crm.settings.dao;

import com.bjpowernode.crm.settings.domain.User;

import java.util.Map;

/**
 * @author 郑镐
 * @version 1.0
 * @date 2021/7/9 0009 19:08
 */
public interface UserDao {
    User login(Map<String, String> map);
}
