package com.lakers;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;

/**
 * Created by wr on 2018/10/6.
 */
@WebServlet(name = "hello")
public class HelloServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();    //
        Calendar cal = Calendar.getInstance();
        int hour=cal.get(Calendar.HOUR);//小时
        int minute=cal.get(Calendar.MINUTE);//分
        String remoteIp=request.getRemoteAddr();//获取客户端的ip
        String select=request.getParameter("select");//获取查询语句

        out.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");

        out.println("<HTML>");

        out.println("  <HEAD><TITLE>A Servlet</TITLE></HEAD>");

        out.println("  <BODY>");

        out.print("用户在"+hour+"点"+minute+"分，从"+remoteIp+"连接至服务器<br/>");

        out.println("查询字符串为："+select);

        out.println("  </BODY>");

        out.println("</HTML>");

        out.flush();

        out.close();





    }
}
