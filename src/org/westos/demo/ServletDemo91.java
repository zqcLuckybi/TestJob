package org.westos.demo;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author: ShenMouMou
 * @CreateTime: 2019-12-18 15:48
 * @Company:西部开源教育科技有限公司
 * @Description:爱生活，爱Java!
 */
@WebServlet(name = "ServletDemo91", value = "/haha91")
public class ServletDemo91 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //request 请求对象
        //  request 同时也是一个域对象，请求域
        //  请求域 ：代表的范围是一次请求和响应 可以在一次请求和响应间共享数据
       // ServletContext servletContext = this.getServletContext();
        //servletContext.setAttribute("msg", "这是一串数据");
        request.setAttribute("msg", "这是一串数据");
        //response.sendRedirect(request.getContextPath()+"/demo92");
        //转发过去
        request.getRequestDispatcher("/demo92").forward(request,response);
       /* 7. 域对象:
        请求域的范围中共享数据
                在一次请求的多个资源之间共享数据
        request.setAttribute("name", "zhangsan");
        request.getAttribute("name");
        request.removeAttribute("name");
        什么时候使用重定向 ? 什么时候使用转发 ?
        1. 如果需要在请求的多个资源中共享数据, 则使用转发
        2. 如一次性的数据存入请求域中*/
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
