package org.westos.demo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author: ShenMouMou
 * @CreateTime: 2019-12-18 14:22
 * @Company:西部开源教育科技有限公司
 * @Description:爱生活，爱Java!
 */
@WebServlet(name = "ServletDemo5",value = "/haha5")
public class ServletDemo5 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获取请求头的值
        String header = request.getHeader("User-Agent");
        System.out.println(header);
      /*  Mozilla / 5.0 (Windows NT 10.0;
        Win64;
        x64)AppleWebKit / 537.36 (KHTML, like Gecko)Chrome / 70.0 .3538 .102 Safari / 537.36 Edge / 18.18363*/

       /* Mozilla / 5.0 (Windows NT 10.0;
        Win64;
        x64;
        rv:
        71.0)Gecko / 20100101 Firefox / 71.0*/

      /*  Mozilla / 5.0 (Windows NT 10.0;
        WOW64)AppleWebKit / 537.36 (KHTML, like Gecko)Chrome / 74.0 .3729 .169 Safari / 537.36*/
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
