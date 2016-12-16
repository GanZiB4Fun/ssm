<%--声明当前页面使用的编码集--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html>
<head>
    <%--声明当前页面的三要素--%>
    <title>GanZiB视频下载组件</title>
    <meta name="keywords" content="个人网站关键字"/>
    <meta name="description" content="个人网站描述"/>
    <%--css/js--%>
    <%--css样式层--%>
    <link href="/css/index.css" rel="stylesheet"  type="text/css"/>
    <script type="text/javascript" src="/js/jquery.min.js" ></script>
    <link rel="SHORTCUT ICON" href="kuai.ico"/>
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
        <%--<video src="" controls="controls" >--%>
            <%--您的浏览器不支持video标签--%>
        <%--</video>--%>
    </div>
    
    <div class="joke">
        <p id="quest" class="j_desc">脑壳急转弯:${joke.quest}</p><br/>
        <input id="answer" type="button" value="查看答案" onclick="getAnswer('${joke.result}')"/>
    </div>
    <c:forEach items="${images}" var="img">
        <img class="img" src="${img.picUrl}"/>
    </c:forEach>
    
</body>
    <script type="text/javascript" >
        var flag = 0;
        function getAnswer(answer) {
            var str ='<p style="padding: 2%;">答案:'+answer+'</p><br/>';
            if (flag<1){
                $("#quest").append(str);
                $("#answer").remove();
                flag++;
            }
            
        }
    </script>
</html>
