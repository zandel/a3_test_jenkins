<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table style="width:20%; text-align=right">
  
  
  
  <tr>
    <td>Input:</td>
    <td><%= request.getAttribute("registration") %></td> 
    <td></td>
  </tr>   
  <tr>
    <td>Result 1:</td>
    <td><%= request.getAttribute("result1") %></td> 
    <td></td>
  </tr>   
  <tr>
    <td>Result 2:</td>
    <td><%= request.getAttribute("result2") %></td> 
    <td></td>
  </tr>   
</table>
</body>
</html>
