package com.javaee.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

public class CookieServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        Cookie lastVisit = null;
        for (Cookie c : req.getCookies()) {
            if (c.getName().equals("present")) {
                lastVisit = c;
                break;
            }
        }
        if (lastVisit != null) {
            out.println("Your last visit have been place on day " + lastVisit.getValue());
        } else {
            out.println("Since today you don't visit our page.");
            lastVisit = new Cookie("present", new Date().toString());
        }
        resp.addCookie(lastVisit);

    }
}
