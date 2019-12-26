package org.westos.demo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author: ShenMouMou
 * @CreateTime: 2019-12-18 13:37
 * @Company:西部开源教育科技有限公司
 * @Description:爱生活，爱Java!
 */
@WebServlet(name = "ServletDemo2",value ="/hehe")
public class ServletDemo2 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      //请求对象：由服务器创建，管理 和销毁，你只是拿来用，请求对象里面放的是请求信息
        //请求信息：请求行 请求头 请求体
       /* 1. 获取请求行:
        GET / MyServlet / index.jsp ? name = zhangsan & age = 23 HTTP / 1.1*/
       //获取请求方式
        String method = request.getMethod();
        System.out.println(method);
        //URI 统一资源标识符
       //  /20191218_ Servlet__war_exploded / hehe
        String requestURI = request.getRequestURI();
        System.out.println(requestURI);
      //
    //   http://localhost:8080/20191218_Servlet__war_exploded/hehe
        //URL:统一资源定位符
        StringBuffer requestURL = request.getRequestURL();
        System.out.println(requestURL);
        ///20191218_Servlet__war_exploded
        //获取上下文路径
        String contextPath = request.getContextPath();
        System.out.println(contextPath);
        //HTTP / 1.1
        String protocol = request.getProtocol();
        System.out.println(protocol);


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
