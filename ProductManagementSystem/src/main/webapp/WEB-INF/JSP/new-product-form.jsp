<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ADD PRODUCT</title>
</head>
<STYLE>
table.center {
    margin-left:auto; 
    margin-right:auto;
  }</STYLE>
<body>
<div style="text-align:center;">
<h2>PRODUCT MANAGEMENT SYSTEM</h2><br><br><br>
</div>
<div style="text-align:center;">
<h3>ADD PRODUCT</h3><br><br><br>
</div>
<div style="text-align:center;">
<form:form method="POST" modelAttribute="product" action="/addProduct/1" name="product">
     <table class="center">
 
        <tr>
            <td><form:hidden path="pid"/></td>
        </tr>
        <tr>
            <td>Product Name :</td>
            <td><form:input path="pname" id="pname" /></td>
        </tr>
        <tr>
            <td>Manufacturer Details</td>
            <td><form:input path="manuDetails" id="manuDetails"/></td>
        </tr>
        <tr>
            <td>Price :</td>
            <td><form:input path="price" id="price"/></td>
        </tr>
        <tr>
             <td colspan="2"><input type="submit" value="ADD" />
         </td>
    </tr>
</table>
</form:form>
 <br>
 <br>
 
 <div style="text-align:center;">
<a href="/">Home</a><br><br><br>
</div>
</div>
</body>
</html>