package com.day19;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/FormSubmissionPost")
public class Form_Submission_POST extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String email=req.getParameter("email");
        int age=Integer.parseInt(req.getParameter("age"));
        req.setAttribute("email",email);
        req.setAttribute("age",age);
        RequestDispatcher rqd=req.getRequestDispatcher("result.jsp");
        rqd.forward(req,resp);
    }
}
