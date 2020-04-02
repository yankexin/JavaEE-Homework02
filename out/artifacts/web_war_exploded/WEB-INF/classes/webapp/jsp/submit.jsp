<%@ page import="com.java.code.model.homework" %><%--
  Created by IntelliJ IDEA.
  User: ykx
  Date: 2020/3/11
  Time: 15:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>作业提交</title>
</head>
<body>
<%
    homework homework = (homework) request.getAttribute("homework");
%>
<form action="${pageContext.request.contextPath}/submit?hid=<%=homework.getId()%>&title=<%=homework.getTitle()%>&hcontent=<%=homework.getContent()%>" method="post">
<table align="center" width="960" border="1">
    <tr>
        <td>作业编号</td>
        <td><%=homework.getId()%></td>
    </tr>
    <tr>
    <td>作业标题</td>
        <td><%=homework.getTitle()%></td>
    </tr>
    <tr>
        <td>作业内容</td>
        <td><%=homework.getContent()%></td>
    </tr>
    <tr>
        <td>学生学号</td>
        <td><input type="text" name="sid"></td>
    </tr>
    <tr>
        <td>提交内容</td>
        <td><textarea name="scontent" rows="10"></textarea></td>
    </tr>
    <tr align="center">
        <td colspan="2">
            <input type="submit" value="提交">&nbsp;&nbsp;&nbsp;
            <input type="reset" value="取消">
        </td>
    </tr>
</table>
</form>
</body>
</html>
