<%--
  Created by IntelliJ IDEA.
  User: ykx
  Date: 2020/3/11
  Time: 21:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加学生</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/addstudent" method="post">
    <table align="center" width="960" border="1">
        <tr>
            <td>学生学号</td>
            <td><input type="text" name="id"></td>
        </tr>
        <tr>
            <td>学生姓名</td>
            <td><input type="text" name="name"></td>
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
