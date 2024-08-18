package com.day19;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/SS")
public class simple_servlet extends HttpServlet {
    private String message;
    public void init(){
        message="Hello, World!";
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter pw=resp.getWriter();
        pw.println("<html><body>");
        pw.println("<h1>"+message+"</h2>");
        pw.println("</body></html>");
    }
}
