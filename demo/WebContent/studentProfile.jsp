<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%--<jsp:useBean id="student" class ="com.niit.models.Student" scope="request"/> --%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Profile</title>
</head>
<body>
<center><u><h1>Login Successfull !!! Welcome :: ${student.UId}</</h1></u></center>
<a href ="index.jsp">Logout</a>
<br>
<center><u><h2>Student Profile Form</h2></u>
< table style = "border:2px blue solid;">
<tbody>
<tr><td>First Name : </td><td>${student.fName}</td></tr>
<tr><td>Last Name : </td><td>${student.lName}</td></tr>

<tr><td>Date of Birth : </td><td>${student.dob}</td></tr>
<tr><td>Address : </td><td>${student.address}</td></tr>
<tr><td>Email Id : </td><td>${student.email}</td></tr>
<tr><td>Mobile Number : </td><td>${student.mobileNo}</td></tr>
</tbody>
</center>
</body>
</html>