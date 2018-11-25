package com.javaee.servlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class SessionServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        if(req.getSession(false) == null) {
            out.println("Welcome on our page first time.");
            req.getSession();
        } else {
            out.println("Welcome again!");
            ServletConfig config = getServletConfig();
            out.println("Our autor: " + config.getInitParameter("autor"));
        }
    }
}
