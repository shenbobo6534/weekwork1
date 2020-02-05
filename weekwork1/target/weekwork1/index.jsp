<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<style>
    /*#tb1{*/
        /*width: 100px;*/
        /*height: 100px;*/
        /*!*background-color: black;*!*/
    /*}*/
</style>
<body>
<div id="d1">
    <form action="/backed/user/login" method="post">
        <div id="tb">
            <h1>游戏登录系统</h1>
            <div>
                <input id="tb1" type="text" placeholder="用户名" name="username">
            </div>
            <div>
                <input id="tb2" type="password" placeholder="密码" name="password">
            </div>
            <div>
                <input id="tb3" type="submit" value="登录">
            </div>
        </div>
    </form>
</div>
</body>
</html>
