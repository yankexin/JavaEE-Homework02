package com.java.code.jdbc;

import com.java.code.model.homework;
import com.java.code.model.student;
import com.java.code.model.stuhom;

import java.sql.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class shjdbc {
    //JDBC链接数据库
    private static String driver="com.mysql.cj.jdbc.Driver";
    private static String url="jdbc:mysql://127.0.0.1:3306/homework?&useSSL=false&serverTimezone=UTC";
    private static String user="root";
    private static String password="17301019";

    public static List<stuhom> allSH() {
        //从学生作业表中读取信息
        try {
            //加载驱动
            Class.forName(driver);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        String sql = "SELECT * FROM s_h " ;

        List<stuhom> list = new ArrayList<>();
        try (Connection connection = DriverManager.getConnection(url,user,password)) {
            try (Statement statement = connection.createStatement()) {
                try (ResultSet resultSet = statement.executeQuery(sql)) {
                    //执行结果
                    while (resultSet.next()) {
                       stuhom sh = new stuhom();
                        sh.setId(resultSet.getLong("id"));
                        sh.setSId(resultSet.getLong("s_id"));
                        sh.setHId(resultSet.getLong("h_id"));
                        sh.setTitle(resultSet.getString("h_title"));
                        sh.setHContent(resultSet.getString("h_content"));
                        sh.setTime(resultSet.getTimestamp("time"));
                        list.add(sh);
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    public static List<homework> allHomework() {
        //从作业表中读取信息
        try {
            //加载驱动
            Class.forName(driver);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        String sqlString = "SELECT * FROM homework";

        List<homework> list = new ArrayList<>();
        try (Connection connection = DriverManager.getConnection(url,user,password)) {
            try (Statement statement = connection.createStatement()) {
                try (ResultSet resultSet = statement.executeQuery(sqlString)) {
                    //执行结果
                    System.out.println("链接成功");
                    while (resultSet.next()) {
                        homework h = new homework();
                        h.setId(resultSet.getLong("id"));
                        h.setTitle(resultSet.getString("title"));
                        h.setContent(resultSet.getString("content"));
                        h.setTime(resultSet.getTimestamp("time"));
                        list.add(h);
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    public static homework getHomework(String id) {
        //从作业表中读取信息
        try {
            //加载驱动
            Class.forName(driver);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        String sql = "SELECT * FROM homework WHERE id =" + id;
        homework h = new homework();
        try (Connection connection = DriverManager.getConnection(url,user,password)) {
            try (Statement statement = connection.createStatement()) {
                try (ResultSet resultSet = statement.executeQuery(sql)) {
                    //执行结果
                    System.out.println("链接成功");
                    while (resultSet.next()) {
                        h.setId(resultSet.getLong("id"));
                        h.setTitle(resultSet.getString("title"));
                        h.setContent(resultSet.getString("content"));
                        h.setTime(resultSet.getTimestamp("time"));
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return h;
    }

    public static void addHomework(String title,String content) {
       //在作业表中添加作业
        try {
            //加载驱动
            Class.forName(driver);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        String sql = "insert into homework(id,title,content,time) values(?,?,?,?)";
        try (Connection connection = DriverManager.getConnection(url,user,password)) {
            try ( PreparedStatement ps = connection.prepareStatement(sql)) {
                List<homework> list = allHomework();
                String id = String.valueOf(list.size()+1);
                ps.setString(1,id);
                ps.setString(2,title);
                ps.setString(3,content);
                Date date = new Date();
                ps.setTimestamp(4,new Timestamp(date.getTime()));
                ps.executeUpdate();
                }
            } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public static void addStudent(String id,String name) {
        //在作业表中添加作业
        try {
            //加载驱动
            Class.forName(driver);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        String sql = "insert into student(id,name,time) values(?,?,?)";
        try (Connection connection = DriverManager.getConnection(url,user,password)) {
            try ( PreparedStatement ps = connection.prepareStatement(sql)) {

                ps.setString(1,id);
                ps.setString(2,name);
                Date date = new Date();
                ps.setTimestamp(3,new Timestamp(date.getTime()));
                ps.executeUpdate();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public static void addStuHom(stuhom sh) {
        //在作业表中添加作业
        try {
            //加载驱动
            Class.forName(driver);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        String sql = "insert into s_h(id,s_id,h_id,h_title,h_content,s_content,time) values(?,?,?,?,?,?,?)";
        try (Connection connection = DriverManager.getConnection(url,user,password)) {
            try ( PreparedStatement ps = connection.prepareStatement(sql)) {
                List<stuhom> list = allSH();
                String id = String.valueOf(list.size()+1);
                ps.setString(1,id);
                ps.setLong(2,sh.getHId());
                ps.setLong(3,sh.getSId());
                ps.setString(4,sh.getTitle());
                ps.setString(5,sh.getHContent());
                ps.setString(6,sh.getSContent());
                Date date = new Date();
                ps.setTimestamp(7,new Timestamp(date.getTime()));
                ps.executeUpdate();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }




}
