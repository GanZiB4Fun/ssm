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
            <input type="text" class="v_text" id="keyword" onkeyup="getMoreContents()">
            <input type="button"  id="btn" class="v_btn" value="确定">
            <%--搜索关联内容展示区域--%>
            <div id="popDiv" style="padding-left: 10%">
                <table id="content_table" bgcolor="#FFFAFA" border="0" cellspacing="0"
                 cellpadding="0">
                    <tbody id="content_table_body" style="padding-left: 11px">
                    <%--动态数据展示区域--%>

                    </tbody>
                </table>
            </div>
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

        var xmlHttp;

        //获取用户输入内容的关联信息的函数
        function getMoreContents() {
        // 获取用户输入内容
            var content = $("#keyword").val();
            if(content==""){
                return;
            }
//       给服务器发送用户输入内容，采用ajax异步发送数据
//            需要一个对象：XmlHttpu对象
            xmlHttp = createXmlHttp();
            //给服务器发送数据
            var url = "/search?keyword="+encodeURIComponent(content);
            //表示JavaScript脚本会在send()方法之后会继续执行，不会等待来自服务器的响应
            xmlHttp.open("GET",url,true);
            //XMLHttp绑定回调方法，会在xmlHttp状态改变的时候被调用
            //xmlHttp的状态0~4，我们关心4:4表示complete完成
            //当完成之后再调用回调方法才有意义
            xmlHttp.onreadystatechange = callback();
            console.info(xmlHttp);
            xmlHttp.send(null);

        }

        //回调函数
        function callback() {

            if(xmlHttp.readyState==4){
                //200代表服务器响应成功
                //404代表资源未找到，500代表服务器内部错误
                console.info(xmlHttp);
                if(xmlHttp.status==200){
                    //交互成功 获得响应数据，是文本格式
                    var result = xmlHttp.responseText;
                    //解析获得的数据
                    var json = eval("("+result+")");
                    //获得数据之后，把这些数据动态展示到输入框下方


                }
            }

        }

        function createXmlHttp() {
            var xmlhttp;
            if(window.XMLHttpRequest){
                xmlhttp = new XMLHttpRequest();
            }
            //兼容性
            if(window.ActiveXObject){
                xmlhttp = new ActiveXObject("Microsoft.XMLHTTP");
                if(!xmlhttp){
                    xmlhttp = new ActiveXObject("Msxml2.XMLHTTP");
                }
            }
            return xmlhttp;
        }

        //设置关联数据的展示
        function setContent(contents) {
            //获得关联数据的长度，以此确定生成多少<tr></tr>
            var size = contents.length;
            for (var i;i<size;i++){
                var nextNode = contents[i];
                var tr = document.createElement("tr")
                var td = document.createElement("td")
                td.setAttribute("border","0");
                td.setAttribute("bgcolor","#FFFAFA");
                td.onmouseover=function () {
                    this.className="mouseOver";
                }
                td.onmouseout=function () {
                    this.className="mouseOut";
                }

                td.onclick=function () {
                    //选择关联数据时，关联数据自动设置为输入框的数据
                }
                var text = document.createTextNode(nextNode);
                td.append(text);
                tr.append(td);
                document.getElementById("content_table_body").appendChild(tr);
            }
        }

    </script>
</html>
