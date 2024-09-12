<%--
  Created by IntelliJ IDEA.
  User: BESTCODE
  Date: 9/12/2024
  Time: 4:21 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>list</title>
</head>
<body>
<p>list</p>
<br>

<table>
    <tr>
        <th>STT</th>
        <th>ten</th>
        <th>gia</th>
        <th>so luong</th>
        <th>mau sac</th>
        <th>the loai</th>
        <th>thao tac</th>
    </tr>
<c:forEach items="${ProductList}" var="s">
    <tr>
        <td>${s.getProductID()}</td>
        <td>${s.getProductName()}</td>
        <td>${s.getPrice()}</td>
        <td>${s.getQuantity()}</td>
        <td>${s.getColorID()}</td>
        <td>${s.getCategoryID()}</td>
        <td><a href="product-servlet?action=delete&id=${s.getProductID()}">xoa</a>||||<a href="">sua</a></td>
    </tr>
</c:forEach>
</table>
</body>
</html>
