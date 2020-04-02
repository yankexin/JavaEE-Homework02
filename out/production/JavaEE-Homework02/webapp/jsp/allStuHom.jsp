<%@ page import="com.java.code.model.stuhom" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: ykx
  Date: 2020/3/11
  Time: 21:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>所有学生提交作业</title>
</head>
<body>
<table align="center" width="960" border="1">
<tr>
    <td>作业编号</td>
    <td>作业标题</td>
    <td>作业内容</td>
    <td>学生学号</td>
    <td>学生作业</td>
</tr>
<%
    List<stuhom> list = (List<stuhom>)request.getAttribute("list");

    if(null == list || list.size() <= 0){
        out.print("None data.");
    }else {
        for (stuhom sh : list){
%>
<tr>
    <td><%=sh.getHId()%></td>
    <td><%=sh.getTitle()%></td>
    <td><%=sh.getHContent()%></td>
    <td><%=sh.getSId()%></td>
    <td><%=sh.getSContent()%></td>
</tr>
<%
        }
    }
%>

</table>
</body>
</html>
