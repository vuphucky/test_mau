<%--
  Created by IntelliJ IDEA.
  User: BESTCODE
  Date: 9/12/2024
  Time: 5:25 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="product-servlet?action=create" method="post">
  <input type="text" name="productName" placeholder="ten sp">
  <br>
  <input type="number" name="price" placeholder="gia" >
  <br>
  <input type="number" name="quantity" placeholder="so luong">
  <br>
  <input type="text" name="color" placeholder="mau sac">
  <br>
  <input type="text" name="category" placeholder="the loai">
  <br>
  <input type="submit" value="themmoi">
</form>
</body>
</html>
