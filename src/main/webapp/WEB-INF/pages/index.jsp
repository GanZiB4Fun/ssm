<%--声明当前页面使用的编码集--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

        <%--声明当前页面的三要素--%>
        <title>GanZiB视频下载组件</title>
        <meta name="keywords" content="个人网站关键字"/>
        <meta name="description" content="个人网站描述"/>
        <%--css/js--%>
        <%--css样式层--%>
        <style type="text/css">
            *{
                margin: 0;
                padding: 0;
            }
            body{
                background:url("http://szb-head.oss-cn-shanghai.aliyuncs.com/2016121314350121.jpg");
                background-size: cover;
                font-size: small;
            }
            .video{
                width: 450px;
                height: 150px;
                margin: 80px auto;
                padding: 50px;
                text-align: center;
            }
            .video .v_title{
                font-size: 24px;
                text-align: center;
                font-weight: 300;
                color: #FFF;
                line-height: 60px;
                border-radius: 14px 14px 14px 14px;
            }
            .video .v_search{
                width: 450px;
                height:100px;
                background: #FFF;
                border-radius:14px 14px 14px 14px ;
                padding:6px;
            }
            .video .v_search .v_text{
                width:300px;
                height: 30px;
                border: 4px solid #dfdfdf;
                border-radius:14px 14px 14px 14px ;
                padding-left: 10px;
                outline: none;
            }

            .video .v_search .v_btn{
                width: 90px;
                height:32px;
                border: none;
                background: #9eafc5;
                padding-left: 10px;
                border-radius:14px 14px 14px 14px ;
                outline: none;
                cursor: pointer;
                font-family: "Yuanti TC";
            }
            .video .v_search .v_btn:hover{
                background: #5b8ac5;
            }
            .video .v_search .v_desc{
                padding: 10px;
                font-family: sans-serif;
                font-size: 16px;
            }
            .user{
                padding: 40px;
                font-size: 20px;
                cursor: pointer;
            }
            .user .color{color:#3399CC; text-decoration:none;font-weight:bold;}/*链接设置*/
            .user .color:visited{color:#3399CC; text-decoration:none;font-weight:bold;}/*访问过的链接设置*/
            .user .color:hover{color:#CF0000; text-decoration:underline;font-weight:bold;}/*鼠标放上的链接设置*/
        </style>
</head>
<body>
    <%--登录--%>
    <div class="user">
        <a class="color" href="user/login">登录</a>&nbsp;&nbsp;
        <a class="color" href="user/register">注册</a>
    </div>
    <%--div--%>
    <div class="video">
        <p class="v_title"></p>
        <div class="v_search">
            <input type="text" class="v_text">
            <input type="button"  id="btn" class="v_btn" value="确定">
            <p class="v_desc">目前已支持<a href="#">新浪博客</a>、<a href="#">优酷网</a>
                、<a href="#">土豆网</a>、<>酷六网、搜狐视频、56网、爱奇艺、凤凰网、音悦台、乐视网
            等视频直播网站的视频播放页链接</p>
        </div>
        <video src="" controls="controls" >
            您的浏览器不支持video标签
        </video>
    </div>
</body>
</html>
