package com.itdr.controller;

import com.itdr.service.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/home/*")
public class UserServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
    ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
    ServiceImpl bean = ac.getBean(ServiceImpl.class);

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String requestURI = request.getRequestURI();
        String[] split = requestURI.split("/");
        switch(split[split.length-1]){
            case "denglu":
                dengLu(request,response);
                break;
            case "jieguo":
                jieGuo(request,response);
                break;
        }
    }

    private void dengLu(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String s = bean.dengLu(username, password);
        request.getRequestDispatcher("/WEB-INF/yx.jsp").forward(request,response);
    }

    private void jieGuo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String ming = request.getParameter("ming");
        String yue = request.getParameter("yue");
        String dong = request.getParameter("dong");
        String s = bean.jieGuo(ming, yue, dong);
        System.out.println(s);
        request.setAttribute("jie",s);
        request.getRequestDispatcher("/WEB-INF/jie.jsp").forward(request,response);

    }
}
