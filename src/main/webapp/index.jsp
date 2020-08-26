<%--
  Created by IntelliJ IDEA.
  User: LapTop
  Date: 8/26/2020
  Time: 5:10 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
<form method="post" action="/discount">
    <h3>Product Discount Calculator</h3>
    <label>Product Description</label>
    <input type="text" name="description">
    <label>List Price</label>
    <input type="text" name="price">
    <label>Discount Percent</label>
    <input type="text" name="percent">
    <input type="submit" value="Calculator">

</form>
</body>
</html>
