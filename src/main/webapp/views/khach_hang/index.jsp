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
<table>
    <thead>
    <tr>
        <th>ID</th>
        <th>Mã</th>
        <th>Tên</th>
        <th>Sdt</th>
        <th>Trạng thái</th>
        <th colspan="2">Thao tác</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${data}" var="kt">
        <tr>
            <td>${kt.id}</td>
            <td>${kt.maKH}</td>
            <td>${kt.ten}</td>
            <td>${kt.sdt}</td>
            <td>${kt.trangThai == 1 ? "Đang hoạt động" : " Ngừng hoạt động"}</td>
            <td>
                <a href="#">Update</a>
            </td>
            <td>
                <a href="delete/${ kt.id }">Delete</a>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>