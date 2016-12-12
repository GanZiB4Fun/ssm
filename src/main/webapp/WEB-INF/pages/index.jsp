<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>GanZiB</title>
    <style>
        a{
            border-width:9px;
            border-style:solid;
            border-color:rgb(120, 195, 0);
            border-radius:48px;
            border-top-left-radius:48px;
            border-top-right-radius:48px;
            border-bottom-left-radius:48px;
            border-bottom-right-radius:48px;
            background-color: rgb(120, 195, 0);
            font-family: "Yuanti SC";
            cursor: pointer;
        }

        .font{
            font-family: "Yuanti SC";
            font-size: small;
        }
    </style>
</head>
<body style="padding: 10%;background-color: beige">
    <div style="text-align: center;"><h1>草榴涉趣</h1></div>
    <h1 class="font">当前用户数: ${userNum}</h1>
    <h2 class="font">达盖尔旗帜</h2>
    <a onclick="alert('按错了！滚')"> 注册</a>
</body>
</html>
