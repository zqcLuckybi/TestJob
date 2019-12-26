package org.westos.demo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sound.midi.Soundbank;
import java.io.IOException;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Map;
import java.util.Set;

/**
 * @Author: ShenMouMou
 * @CreateTime: 2019-12-18 14:46
 * @Company:西部开源教育科技有限公司
 * @Description:爱生活，爱Java!
 */
@WebServlet(name = "ServletDemo6",value = "/haha6")
public class ServletDemo6 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //请求中文乱码的解决
        //tomcat8.0 以上版本  GET请求不需要解决请求中文乱码问题，不会乱码
        //
        //post请求 中文乱码问题，需要解决
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
      /*  //通用的获取请求参数的值
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String sex = request.getParameter("sex");
        //获取爱好 针对复选框
        String[] hobbies = request.getParameterValues("hooby");
        System.out.println(Arrays.toString(hobbies));*/
      //一次性获取完所有的表单项
        Map<String, String[]> map = request.getParameterMap();

        System.out.println(map);
        Set<String> strings = map.keySet();
        for (String string : strings) {
            System.out.println(string+"=="+Arrays.toString(map.get(string)));
        }
        System.out.println("======================");
       /* //获取所有请求参数的键的枚举
        Enumeration<String> parameterNames = request.getParameterNames();
        while (parameterNames.hasMoreElements()){
            String key = parameterNames.nextElement();
            String parameter = request.getParameter(key);
            System.out.println(parameter);
        }*/




    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
