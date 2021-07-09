package com.bjpowernode.settings.test;

import com.bjpowernode.crm.utils.DateTimeUtil;
import com.bjpowernode.crm.utils.MD5Util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author 郑镐
 * @version 1.0
 * @date 2021/7/9 0009 20:11
 */
public class Test1 {
    public static void main(String[] args) {
        // 验证失效时间
//        String expireTime = "2019-10-10 10:10:10";
//        // 当前系统时间
//        String str = DateTimeUtil.getSysTime();
//        int count = expireTime.compareTo(str);
//        System.out.println(count);
//        String lockState = "0";
//        if ("0".equals(lockState)){
//            System.out.println("账号已锁定");
//        }
        String pwd = "1203";
        String pwd1 = MD5Util.getMD5(pwd);
        System.out.println(pwd1);
        }
}
