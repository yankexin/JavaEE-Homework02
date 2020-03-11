package com.java.code.servlet;

import com.java.code.jdbc.shjdbc;
import com.java.code.model.homework;
import com.java.code.model.stuhom;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("allsh")
public class allStuHomServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<stuhom> list = shjdbc.allSH();
        req.setAttribute("list", list);
        req.getRequestDispatcher("jsp/allStuHom.jsp").forward(req, resp);
    }
}
