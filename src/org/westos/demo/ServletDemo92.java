package org.westos.demo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author: ShenMouMou
 * @CreateTime: 2019-12-18 15:51
 * @Company:西部开源教育科技有限公司
 * @Description:爱生活，爱Java!
 */
@WebServlet(name = "ServletDemo92",value = "/demo92")
public class ServletDemo92 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       // Object msg = this.getServletContext().getAttribute("msg");
        Object msg = request.getAttribute("msg");
        System.out.println(msg);

      //  this.getServletContext().removeAttribute("msg");



        //是否要加上 Application context 这个路径
        //所有在页面上 .jsp .html  都得写上项目路径
        //<a href="">  <img src="">  form action=""
        // 重定向 就得写上项目路径

        //内部转发：不用写项目路径
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
