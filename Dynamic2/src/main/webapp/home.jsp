<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="postdata" method="post">
<label>Input Id :</label>
<input type="text" name="Id"><br>
<label>Input Name :</label>
<input type="text" name="name"><br>
<label>Input Department :</label>
<input type="text" name="department"><br>
<label>Input Salary :</label>
<input type="text" name="salary"><br><br>
<input type="submit" value="submit">
</form>

<form action="deletedata" method="post">
<label>Input Id:</label>
<input type="text" name="id"><br>
<input type="submit" value="submit">
</form>

<form action="putdata" method="post">
<label>Input Id :</label>
<input type="text" name="Id"><br>
<label>Input Name :</label>
<input type="text" name="name"><br>
<label>Input Department :</label>
<input type="text" name="department"><br>
<label>Input Salary :</label>
<input type="text" name="salary"><br><br>
<input type="submit" value="submit">
</form>

</body>
</html>