<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2020/2/6
  Time: 13:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>斑斓界</title>
    <style>
        #tb1{
            width: 200px;
            height: 200px;
            border: 1px black solid;
        }
    </style>
    <script src="${pageContext.request.contextPath}/js/jquery-3.3.1.js"></script>
    <script>
        var s = confirm("斑斓世界");
        function blue() {
            var x = document.getElementById("tb1")
            x.style.backgroundColor="blue";
            x.innerHTML="蓝色背景";
            x.style.fontWeight="normal";
        }
        function green() {
            var x = document.getElementById("tb1")
            x.style.backgroundColor="green";
            x.innerHTML="绿色背景";
            x.style.fontWeight="bold";
        }
        function change() {
            document.getElementById('tb1').innerHTML="";
            // document.getElementById("tb1").removeAttribute("style");
            var dv =document.getElementById("tb1");
            var t1 = document.getElementById("tb2");
            var t = t1.value;
            if (t == "b") {
                dv.style.backgroundColor="blue";
            }
            if (t == "g"){
                dv.style.backgroundColor="green";
            }
        }
    </script>
</head>
<body>
<h1>请选择背景颜色</h1>
<%--1.按钮--%>
    <div>
        <button onclick="blue()">蓝色</button>
        <button onclick="green()">绿色</button>
    </div>
<%--2.颜色变换框--%>
    <div id="tb1">

    </div>
<br>
<%--3.文字输入框--%>
    <div>
        输入颜色首字母：
        <input type="text" id="tb2">
        <button onclick="change()">点击按钮改变颜色</button>
    </div>

</body>
</html>
