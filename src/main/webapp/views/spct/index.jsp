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
<form action="/spct/index" method="get">
    <label>Sản phẩm</label>
    <select name="spId">
        <c:forEach items="${ data }" var="sp">
            <option value="${ sp.id }">${ sp.ten }</option>
        </c:forEach>
    </select>
    <button type="submit">Lọc</button>
</form>
<table>
    <thead>
    <tr>
        <th>ID</th>
        <th>Mã</th>
        <th>Màu sắc</th>
        <th>Kích thước</th>
        <th>Số lượng</th>
        <th>Đơn giá</th>
        <th>Trạng thái</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${ dataSPCT }" var="spct">
        <tr>
            <td>${spct.id}</td>
            <td>${spct.ma}</td>
            <td>${spct.mau}</td>
            <td>${spct.kichThuoc}</td>
            <td>${spct.soLuong}</td>
            <td>${spct.donGia}</td>
            <td>${spct.trangThai == 1 ? "Đang hoạt động" : "Ngừng hoạt động"}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>