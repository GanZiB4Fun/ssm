<%--声明当前页面使用的编码集--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html>
<head>
    <title>认证</title>
    <link href="../css/index.css" rel="stylesheet"  type="text/css"/>
    <script type="text/javascript" src="../js/jquery.min.js" ></script>
    <link rel="SHORTCUT ICON" href="kuai.ico"/>
</head>
<body>
    <div class="video">
        <form id="ff" action="${ctx}/user/getData" method="post">
            <div class="v_search">
                <label class="v_text">姓名：</label>
                <input id="name" name="name" type="text">
            </div>
            <div class="v_search">
                <label class="v_text">手机号：</label>
                <input id="phone" name="phone" type="text">
            </div>
            <div class="v_search">
                <label class="v_text">身份证：</label>
                <input id="identity" name="identity" type="text">
            </div>
            <p class="tip">请填写实名认证信息，以便领奖资料一经提交无法修改，请慎重填写！</p>
            <div class="btn-group">
                <button  type="reset">取消</button>
                <button id="submit" type="button" >提交</button>
            </div>
        </form>
    </div>

</body>
<script type="application/javascript">
    function isChinaName(name) {
        var pattern = /^[\u4E00-\u9FA5]{1,6}$/;
        return pattern.test(name);
    }

    // 验证手机号
    function isPhoneNo(phone) {
        var pattern = /^1[34578]\d{9}$/;
        return pattern.test(phone);
    }

    // 验证身份证
    function isCardNo(card) {
        var pattern = /(^\d{15}$)|(^\d{18}$)|(^\d{17}(\d|X|x)$)/;
        return pattern.test(card);
    }

    // 验证函数
    function formValidate() {
        var str = '';

        // 判断名称
        if($.trim($('#name').val()).length == 0) {
            str += '名称没有输入\n';
            $('#name').focus();
        } else {
            if(isChinaName($.trim($('#name').val())) == false) {
                str += '名称不合法\n';
                $('#name').focus();
            }
        }

        // 判断手机号码
        if ($.trim($('#phone').val()).length == 0) {
            str += '手机号没有输入\n';
            $('#phone').focus();
        } else {
            if(isPhoneNo($.trim($('#phone').val()) == false)) {
                str += '手机号码不正确\n';
                $('#phone').focus();
            }
        }

        // 验证身份证
        if($.trim($('#identity').val()).length == 0) {
            str += '身份证号码没有输入\n';
            $('#identity').focus();
        } else {
            if(isCardNo($.trim($('#identity').val())) == false) {
                str += '身份证号不正确；\n';
                $('#identity').focus();
            }
        }
        // 如果没有错误则提交
        if(str != '') {
            alert(str);
            return false;
        } else {
            $("#ff").submit();
        }
    }

    $('#submit').on('click', function() {
        formValidate();
    });
</script>
</html>
