package com.example.springbootdemo2.servlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Writer;

@WebServlet(name = "myServlet", urlPatterns = "/myServlet", initParams = {@WebInitParam(name = "myName", value = "myValue")})
public class MyServlet extends HttpServlet {

    private String value;

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        value = servletConfig.getInitParameter("myName");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Writer writer = resp.getWriter();

        writer.write("<html><body>Hello     " + value + "        Servlet<body></html>");
    }
}

// http://localhost:8080/myServlet  访问
























