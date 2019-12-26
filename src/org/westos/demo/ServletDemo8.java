package org.westos.demo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author: ShenMouMou
 * @CreateTime: 2019-12-18 15:25
 * @Company:西部开源教育科技有限公司
 * @Description:爱生活，爱Java!
 */
@WebServlet(name = "ServletDemo8",value = "/haha8")
public class ServletDemo8 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("haha8收到请求了");

        //再内部转发
       // request.getRequestDispatcher("/haha9").forward(request,response);
        request.getRequestDispatcher("/index.jsp").forward(request, response);
        System.out.println("回到888888");

        //内部转发
        //1.一次请求一次响应
        //2.url不发生变化
        //3.内部转发只能跳转内部资源
        //4.可以跳转到WEB-INF下的资源

        //重定向
        //1.两次请求，两次响应
        //2.url 会发生变化
        //3.既能跳转内部资源也能跳转外部资源
        //4.不能跳转到WEB-INF下的资源
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
