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
<h2>QLKH</h2>
<form action="/khach-hang/update/${data.id}" method="POST">
    <div>
        <label>Mã: </label>
        <input type="text" name="maKH" value="${data.maKH}">
    </div>
    <br>
    <div>
        <label>Tên: </label>
        <input type="text" name="ten" value="${data.ten}">
    </div>
    <br>
    <div>
        <label>Sdt: </label>
        <input type="text" name="sdt" value="${data.sdt}">
    </div>
    <br>
    <div>
        <label>Trạng thái: </label>
        <select name="trangThai">
            <option value="1" ${data.trangThai == 1 ? "selected" : ""}>Đang hoạt động</option>
            <option value="0" ${data.trangThai == 0 ? "selected" : ""}>Ngừng hoạt động</option>
        </select>
    </div>
    <br>
    <div>
        <button>Lưu</button>
    </div>
</form>
</body>
</html>