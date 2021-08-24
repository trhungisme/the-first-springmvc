<%--
  Created by IntelliJ IDEA.
  User: truon
  Date: 8/19/2021
  Time: 2:47 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Home</title>
</head>
<body>
<div>
    <h2>Đây là trang chủ</h2>
    <a href="./hello">Trang hello</a>
    <a href="./about">Trang hello</a>
    <a href="./create">Trang tao customer</a>
</div>
<div>
    <h3>Thong tin customer</h3>
    <h4>First name: ${customer.firstName}</h4>
    <h4>Last name: ${customer.lastName}</h4>
    <h4>Email: ${customer.email}</h4>
</div>
</body>
</html>
