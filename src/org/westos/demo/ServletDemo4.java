package org.westos.demo;

import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.net.URLDecoder;

/**
 * @Author: ShenMouMou
 * @CreateTime: 2019-12-18 13:52
 * @Company:西部开源教育科技有限公司
 * @Description:爱生活，爱Java!
 */
@WebServlet(name = "ServletDemo4",value = "/haha2")
public class ServletDemo4 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       //POST 获取请求体里面的请求参数
      //  ServletInputStream inputStream = request.getInputStream();
        BufferedReader reader = request.getReader();
        String s = reader.readLine();
        System.out.println(s);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //GET 请求 获取请求参数
        String queryString = request.getQueryString();
        System.out.println(queryString);
        //username = zhangsan & password = 123456
        // URL 编解码
        // username =%E5 % BC % A0 % E4 % B8 % 89 & password = 123456
        String decode = URLDecoder.decode("%E5%BC%A0%E4%B8%89", "utf-8");
        //this.doPost(request, response);
    }
}
