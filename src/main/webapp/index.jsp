<%--
  Created by IntelliJ IDEA.
  User: dhnam
  Date: 8/19/2021
  Time: 7:37 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>App Product Discount Calculator</title>
  <link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
<h2>APP Product Discount Calculator</h2>
<form method="post" action="discount">
  <label>Product Description: </label><br/>
  <input type="text" name="description" value=""/><br/>
  <label>List Price: </label><br/>
  <input type="text" name="price" value=""/><br/>
  <label>Discount Percent: </label><br/>
  <input type="text" name="percent" value=""/><br/>
  <input type = "submit" id = "submit" value = "Calculate Discount"/>
</form>
</body>
</html>
