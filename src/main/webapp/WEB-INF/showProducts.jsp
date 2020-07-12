<%@ taglib prefix="c" uri="http://java.sun.com/jstl/xml" %>
<%--
  Created by IntelliJ IDEA.
  User: Przemysaw Surma
  Date: 12.07.2020
  Time: 13:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>products list</title>
</head>
<body>
<form>
    <label>
        id:
        <input name="id" placeholder="id" type="text">
        <input type="submit">
    </label>
</form>

<table>
    <tr>
        <th>ID</th>
        <th>NAME</th>
    </tr>
    <jsp:useBean id="products" scope="request" type="java.util.List"/>
    <c:forEach var="product" select="${products}">
        <tr>
            <td>${product.id}</td>
            <td>${product.name}</td>
        </tr>
    </c:forEach>

</table>

<p>Get your products <a href="/showProducts">here</a></p>
<p>add Product here <a href="/addProduct">here</a></p>

</body>
</html>
