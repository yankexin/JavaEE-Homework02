package com.java.code.servlet;

import com.java.code.jdbc.shjdbc;
import com.java.code.model.homework;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;
import java.util.List;

@WebServlet("/addhomework")
public class addHomeworkServlet  extends HttpServlet {
    @Override

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String title = req.getParameter("title");
        String content = req.getParameter("content");
        shjdbc.addHomework(title,content);
        req.getRequestDispatcher("jsp/teacher.jsp").forward(req, resp);
    }


}
