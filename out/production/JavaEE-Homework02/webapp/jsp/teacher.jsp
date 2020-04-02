<%--
  Created by IntelliJ IDEA.
  User: ykx
  Date: 2020/3/11
  Time: 14:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>老师界面</title>
</head>
<body>
<div style="width:100%" align="center" >
    <a>欢迎进入老师操作界面</a><br/>
    <a>请选择您的操作</a><br/>
    <ul>
        <li><a href="addHomework.jsp">添加作业</a><br/></li>
        <li><a href="addStudent.jsp">添加学生</a><br/></li>
        <li><a href="${pageContext.request.contextPath}/allsh">查看作业</a><br/></li>
        <li><a href="../index.jsp">返回</a><br/></li>
    </ul>
    <link>
</div>
</body>
</html>
