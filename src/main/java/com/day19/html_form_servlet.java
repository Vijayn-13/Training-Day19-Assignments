package com.day19;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/basicHtmlForm")
public class html_form_servlet extends HttpServlet {
    private String message;
    public void init(){
        message="Hello,";
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String user=req.getParameter("username");
        resp.setContentType("text/html");
        PrintWriter pw=resp.getWriter();
        pw.println("<html><body>");
        pw.println("<h1>"+message+" "+user+"!</h1>");
        pw.println("</body></html>");
    }

}
