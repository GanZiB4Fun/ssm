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
<%@ taglib prefix="v-on" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html lang="zh">
<head>
    <meta charset="UTF-8">
    <title>Vue.js简单实用测试</title>
    <meta name="keywords" content="个人网站关键字"/>
    <meta name="description" content="个人网站描述"/>
    <%--css/js--%>
    <%--css样式层--%>
    <script type="text/javascript" src="/js/jquery.min.js" ></script>
    <link rel="SHORTCUT ICON" href="kuai.ico"/>
</head>
<body>
    <div id="app" style="font-size: x-large">
    {{ message }}
    </div>

    <div id="app-2">
        <span v-bind:title="message">
            将鼠标悬浮在该段文字上几秒钟 看看变化
        </span>
    </div>

    <div id="app-3">
        <p v-if="seen">显示成功</p>
    </div>

    <div id="app-4">
        <ol>
            <li v-for="todo in todos">
                {{todo.text}}
            </li>
        </ol>
    </div>

    <div id="app-5">
        <p>{{message}}</p>
        <button v-on:click="reverseMessage"> 反转文字</button>
    </div>

    <div id="app-6">
        <p>{{message}}</p>
        <input v-model="message">
    </div>

    <div id="app-7">
        <ol>
            <!-- Now we provide each todo-item with the todo object    -->
            <!-- it's representing, so that its content can be dynamic -->
            <todo-item v-for="item in groceryList" v-bind:todo="item"></todo-item>
        </ol>
    </div>

    <script  src="/js/vue/vue.js"></script>
    <script type="application/javascript">
        var app = new Vue({
            el: '#app',
            data: {
            message: '有点困!!!!先眯一下'
            }
        });

        var app2 = new Vue({
            el: '#app-2',
            data: {
                message: '您在' + new Date()+"访问该页面"
            }
        });

        var app3 = new Vue({
            el: "#app-3",
            data:{
                seen:true
            }
        });

        var app4 = new Vue({
            el : "#app-4",
            data : {
                todos : [
                    {text : '学习JavaScript'},
                    {text : '学习Vue'},
                    {text : '搭建一些好的东西'}
                ]
            }
        });

        var app5 = new Vue({
            el : "#app-5",
            data : {
                message:"hello Vue.js!"
            },
            methods : {
                reverseMessage : function () {
                    this.message = this.message.split('').reverse().join('')
                }
            }

        });

        var app6 = new Vue({
            el : "#app-6",
            data : {
                message : "Hello World!"
            }
        });

        Vue.component('todo-item',{
            props : ['todo'],
            template : '<li>{{todo.text}}</li>'
        });

        var app7 = new Vue({
            el : "#app-7",
            data : {
                groceryList : [
                    { text: 'Vegetables' },
                    { text: 'Cheese' },
                    { text: 'Whatever else humans are supposed to eat' }
                ]
            }
        });

    </script>
</body>

</html>
