package com.javaee.servlet;

import com.javaee.util.Hash;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class HashServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String textToHash = req.getParameter("textToHash");
        System.out.println(textToHash);
        String hash = Hash.hashText(textToHash);
        req.setAttribute("md5hash",hash);
        req.getRequestDispatcher("/showhash.jsp").forward(req,resp);

    }
}
