package com.javaee;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        String name = req.getParameter("name");
        PrintWriter out = resp.getWriter();
        out.println("<html>");
        out.println("<head><title>Servlet com.javaee.HelloServlet</title></head>");
        out.println("<body><h1>Hello my  " + name + "</h1></body>");
        out.println("</html>");
    }
}
