package com.java.code.servlet;

import com.java.code.jdbc.shjdbc;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/addstudent")
public class addStudentServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        String name = req.getParameter("name");
        shjdbc.addStudent(id,name);
        req.getRequestDispatcher("jsp/teacher.jsp").forward(req, resp);
    }
}
