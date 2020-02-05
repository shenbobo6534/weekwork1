<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2020/2/5
  Time: 19:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>出拳猛如虎</title>
    <style>
        #tb1{
            height: 100px;
            width: 100px;
            background-color: greenyellow;
        }
    </style>
    <script src="${pageContext.request.contextPath}/js/jquery-3.3.1.js"></script>
    <script>
        function chuquan() {
            document.write("剪刀","石头","布")
        }
    </script>
</head>

<body>
    <div id="tb1">

    </div>
    <button onclick="chuquan()">随机出拳</button>
</body>
</html>
