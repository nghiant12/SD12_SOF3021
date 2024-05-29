<%@page language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="f" uri="jakarta.tags.functions" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>assignment-nhanvien</title>
</head>
<body>
<h2>QLNV</h2>
<form action="/nhan-vien/store" method="POST">
    <div>
        <label>Mã: </label>
        <input type="text" name="ma" value="${ data.ma }">
        <c:if test="${not empty errors['ma']}">
            <small style="color: red">${errors["ma"]}</small>
        </c:if>
    </div>
    <div>
        <label>Tên: </label>
        <input type="text" name="ten" value="${ data.ten }">
        <c:if test="${not empty errors['ten']}">
            <small style="color: red">${errors["ten"]}</small>
        </c:if>
    </div>
    <div>
        <label>Tên đăng nhập: </label>
        <input type="text" name="tenDangNhap" value="${ data.tenDangNhap }">
        <c:if test="${not empty errors['tenDangNhap']}">
            <small style="color: red">${errors["tenDangNhap"]}</small>
        </c:if>
    </div>
    <div>
        <label>Mật khẩu: </label>
        <input type="password" name="matKhau" value="${ data.matKhau }">
        <c:if test="${not empty errors['matKhau']}">
            <small style="color: red">${errors["matKhau"]}</small>
        </c:if>
    </div>
    <div>
        <label>Trạng thái: </label>
        <select name="trangThai">
            <option value="1" ${data.trangThai == 1 ? "selected":""}>Đang hoạt động</option>
            <option value="0" ${data.trangThai == 0 ? "selected":""}>Ngừng hoạt động</option>
        </select>
    </div>
    <div>
        <button>Lưu</button>
    </div>
</form>
</body>
</html>