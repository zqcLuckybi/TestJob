package org.westos.demo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author: ShenMouMou
 * @CreateTime: 2019-12-18 13:32
 * @Company:西部开源教育科技有限公司
 * @Description:爱生活，爱Java!
 */
/*
* 一个Servlet 可以配置多个映射
* 一个映射路径只能对应一个Servlet
* */
@WebServlet(name = "ServletDemo",urlPatterns ={"/demo1","/demo2","/demo3"})
public class ServletDemo extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("请求来了");
        //response
       // response.setContentType("text/html;charset=utf-8");
        //响应文本数据 处理响应中文乱码问题
        //响应字节数据
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
