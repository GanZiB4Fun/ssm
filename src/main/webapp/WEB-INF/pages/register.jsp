<%--
  Created by IntelliJ IDEA.
  ser: GanZiB
  Date: 16/12/13
  Time: 下午3:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div>
    <form action="/user/saveUser" method="post">
        姓名: <input id="user_name" name="user_name" type="text"/><br/>
        昵称: <input id="nick_name" name="nick_name" type="text"/><br/>
        密码: <input id="password" name="password" type="text"/><br/>
        <input type="submit">
    </form>
</div>
</body>
</html>
