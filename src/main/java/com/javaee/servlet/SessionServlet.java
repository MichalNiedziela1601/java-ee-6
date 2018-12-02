package com.javaee.servlet;

import com.javaee.domain.User;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

public class SessionServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        if(req.getSession(false) == null) {
            out.println("Welcome on our page first time.");
            HttpSession session = req.getSession();
            session.setAttribute("user", new User());
        } else {
            out.println("Welcome again!");
            ServletConfig config = getServletConfig();
            out.println("Our autor: " + config.getInitParameter("autor"));
        }

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("Client.jsp");
        requestDispatcher.forward(req,resp);

    }
}
