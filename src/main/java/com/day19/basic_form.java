package com.day19;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/emailForm")
public class basic_form extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String email=req.getParameter("email");
        resp.setContentType("text/html");
        PrintWriter pw=resp.getWriter();
        pw.println("<html><body>");
        pw.println("<h2>User entered mail: "+email+"</h2>");
        pw.println("</body></html>");
    }
}
