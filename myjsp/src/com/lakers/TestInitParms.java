package com.lakers;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

/**
 * Created by wr on 2018/10/10.
 */
@WebServlet(name = "TestInitParms")
public class TestInitParms extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("Text/html");
        PrintWriter out  = response.getWriter();
        out.println("test init parameters<br>");

        Enumeration e = getServletConfig().getInitParameterNames();
        while(e.hasMoreElements()){
            out.println("<br>param name = "+ e.nextElement() + "<br>");
        }
        out.println("main enail id" + getServletConfig().getInitParameter("mainEmail"));
        out.println("<br>");
        out.println("adimn email is" + getServletConfig().getInitParameter("adminEmail"));

    }
}
