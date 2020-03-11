<%--
  Created by IntelliJ IDEA.
  User: ykx
  Date: 2020/3/11
  Time: 20:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加作业</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/addhomework" method="post">
<table align="center" width="960" border="1">
    <tr>
        <td>作业标题</td>
        <td><input type="text" name="title"></td>
    </tr>
    <tr>
        <td>作业内容</td>
        <td><textarea name="content" rows="10"></textarea></td>
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
