
package com.lakers;

import com.model.BeerExpert;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

/**
 * Created by wr on 2018/10/9.
 */
@WebServlet(name = "SelectBeer.do")
public class BeerSelect extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

//        response.setContentType("text/html");
//        PrintWriter out = response.getWriter();
//        out.println("Beer Select Advice<br>");
        String c = request.getParameter("color");
        //out.println("<br>Got beer color "+ c);
        BeerExpert be = new BeerExpert();
        List result = be.getbrands(c);

        request.setAttribute("styles",result);

        RequestDispatcher view = request.getRequestDispatcher("result.jsp");
        view.forward(request,response);


//        Iterator it = result.iterator();
//        while(it.hasNext()) {
//            out.print("<br>try: " + it.next());
//        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
