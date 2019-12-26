package org.westos.demo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author: ShenMouMou
 * @CreateTime: 2019-12-18 14:33
 * @Company:西部开源教育科技有限公司
 * @Description:爱生活，爱Java!
 */
@WebServlet(name = "LoginServlet",value = "/login")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       // String queryString = request.getReader().readLine();

        getParmter(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      //  String queryString = request.getQueryString();
       // getParmter(request,response);
        this.doPost(request,response);
    }

    private void getParmter(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String queryString=null;
        if(request.getMethod().equals("GET")){
             queryString = request.getQueryString();
        }else if(request.getMethod().equals("POST")){
            queryString = request.getReader().readLine();
        }
        String[] msgs = queryString.split("&");
        String[] one = msgs[0].split("=");
        System.out.println(one[0]);
        System.out.println(one[1]);
        String[] two = msgs[1].split("=");
        System.out.println(two[0]);
        System.out.println(two[1]);
    }
}
