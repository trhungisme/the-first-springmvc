<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: truon
  Date: 8/20/2021
  Time: 10:08 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Tao customer moi</title>
</head>
<body>
    <h3>Create new customer</h3>
<%--    <form:form th:action="@{/The_first_springmvc_war/create-validate}" method="post" th:object="${customer}">--%>
<%--        <p>First name</p>--%>
<%--        <form:input type="text" path="firstName" th:feild="*{firstName}"/>--%>
<%--        <p>Last name</p>--%>
<%--        <form:input type="text" path="lastName" th:feild="*{lastName}"/>--%>
<%--        <p>Email</p>--%>
<%--        <form:input type="email" path="email" th:feild="*{email}"/>--%>
<%--        <br />--%>
<%--        <button type="submit">Submit</button>--%>
<%--    </form:form>--%>
    <form:form action="/The_first_springmvc_war/create-validate" method="post" modelAttribute="customer" >
        <p>First name</p>
        <form:input type="text" path="firstName" />
        <form:errors path="firstName"/>
        <p>Last name</p>
        <form:input type="text" path="lastName" />
        <form:errors path="lastName"/>
        <p>Email</p>
        <form:input type="email" path="email" />
        <form:errors path="email"/>
        <br />
        <button type="submit">Submit</button>
    </form:form>
</body>
</html>
