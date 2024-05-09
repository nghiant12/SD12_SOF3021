<%@page language="java" pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>
<h2>Login</h2>
<form action="/login" method="POST">
    <div>
        <label>Email: </label>
        <input type="text" name="email">
    </div>
    <br>
    <div>
        <label>Pwd: </label>
        <input type="password" name="password">
    </div>
    <br>
    <div>
        <button>Login</button>
    </div>
</form>
</body>
</html>