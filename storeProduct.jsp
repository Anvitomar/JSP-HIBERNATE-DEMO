<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Product Management System</h2>
Add Product


<form action="ProductStoreController" method="post">
Enter Product-Id<input type="text" name="Id"><br>
Enter Product Name<input type="text" name="pname"><br>
Enter product price<input type="text" name="price">

<input type="submit" name="click" value="Submit">



</form>
</body>
</html>