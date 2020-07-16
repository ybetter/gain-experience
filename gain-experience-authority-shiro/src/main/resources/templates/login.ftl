<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>MarkerHub 登录</title>
</head>
<body>
    <h1>用户登录</h1>
    <h3>欢迎关注公众号：MarkerHub</h3>
    <form method="post" action="/doLogin">
        userName: <input name="userName" type="text">
        password: <input name="password" type="text">
        <input type="submit" name="提交">
    </form>

    <div style="color: red;">${errorMess}</div>
</body>
</html>