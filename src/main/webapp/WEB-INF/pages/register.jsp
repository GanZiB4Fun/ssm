<%--
  Created by IntelliJ IDEA.
  User: GanZiB
  Date: 16/12/13
  Time: 下午3:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="/js/jquery.min.js" ></script>
    <link rel="SHORTCUT ICON" href="kuai.ico"/>
</head>
<body>
<div id="ff"></div>
</body>
<script type="application/javascript">
    var str = '${html}';
    $("#ff").append(str);
</script>
</html>
