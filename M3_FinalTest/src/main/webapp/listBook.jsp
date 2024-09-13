<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>listBook</title>
</head>
<h1 style="text-align: center" style="color: deepskyblue ">Danh sách sách</h1>

<div align="center">
    <table border="1" cellpadding="5" >
        <tr>
            <th>Mã Sách</th>
            <th>Tên sách</th>
            <th>Tác giả</th>
            <th>Mô tả</th>
            <th>Số lượng</th>
            <th></th>
        </tr>
        <c:forEach items="${bookList}" var="b">
            <tr>
                <td>${b.getBookID()}</td>
                <td>${b.getBookName()}</td>
                <td>${b.getAuthorName()}</td>
                <td>${b.getDes()}</td>
                <td>${b.getQuantity()}</td>
                <td><a href="borrow.jsp">Mượn</a></td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>