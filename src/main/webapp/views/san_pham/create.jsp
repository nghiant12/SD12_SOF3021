<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page language="java" pageEncoding="UTF-8" %>
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
<h2>QLSP</h2>
<form action="/san-pham/store" method="POST">
    <div>
        <label>Mã: </label>
        <input type="text" name="ma" value="${ data.ma }">
        <c:if test="${not empty errors['ma']}">
            <small style="color: red">${ errors["ma"] }</small>
        </c:if>
    </div>
    <br>
    <div>
        <label>Tên: </label>
        <input type="text" name="ten" value="${ data.ten }">
        <c:if test="${not empty errors['ten']}">
            <small style="color: red">${ errors["ten"] }</small>
        </c:if>
    </div>
    <br>
    <div>
        <label>Trạng thái: </label>
        <select name="trangThai">
            <option value="1">Đang hoạt động</option>
            <option value="0">Ngừng hoạt động</option>
        </select>
    </div>
    <br>
    <div>
        <button>Lưu</button>
    </div>
</form>
</body>
</html>