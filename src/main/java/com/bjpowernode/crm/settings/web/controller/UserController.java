package com.bjpowernode.crm.settings.web.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author 郑镐
 * @version 1.0
 * @date 2021/7/9 0009 19:22
 */
public class UserController extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("进入到用户控制器");

        String path = request.getServletPath();
        if ("/settings/user/xxx.do".equals(path)){
            // xxx(request,reponse);
        }else if ("/settings/user/xxx.do".equals(path)){
            // xxx(request,reponse);
        }
    }
}
