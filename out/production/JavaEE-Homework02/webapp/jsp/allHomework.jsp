<%@ page import="com.java.code.model.homework" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.sql.*" %>
<%@ page import="com.java.code.jdbc.shjdbc" %><%--
  Created by IntelliJ IDEA.
  User: ykx
  Date: 2020/3/11
  Time: 15:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>作业列表</title>
</head>
<body>
<form method="get" action="${pageContext.request.contextPath}/submit">
<table align="center" width="960" border="1">
    <tr>
        <td>作业编号</td>
        <td>作业标题</td>
        <td>作业内容</td>
        <td>提交作业</td>
    </tr>
    <%
        List<homework> list = (List<homework>)request.getAttribute("list");

        if(null == list || list.size() <= 0){
            out.print("None data.");
        }else {
            for (homework h : list){
    %>
    <tr>
        <td><%=h.getId()%></td>
        <td><%=h.getTitle()%></td>
        <td><%=h.getContent()%></td>
        <td><input type="button"  value="提交作业" onclick="window.location.href='submit?id=<%=h.getId()%>'"  > </td>
    </tr>
    <%
            }
        }
    %>

</table>
</form>
</body>

</html>
