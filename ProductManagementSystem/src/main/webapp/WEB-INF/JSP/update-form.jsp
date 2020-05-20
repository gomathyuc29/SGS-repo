<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<style>
table.center {
    margin-left:auto; 
    margin-right:auto;
  }</STYLE>
<body>
<div style="text-align:center;">
<h2>PRODUCT MANAGEMENT SYSTEM</h2><br><br><br>
</div>
<div style="text-align:center;">
<h3>UPDATE PRODUCT DETAILS</h3><br><br><br>
</div>
<div style="text-align:center;">
<form:form method="POST" modelAttribute="product" action="/addProduct/2" name="product">
     <table class="center">
 		<form:input type="hidden" path="pid" value="${product.pid}"/>
     
        <tr>
            <td>Product Name :</td>
            <td><form:input path="pname" value="${product.pname}"/></td>
        </tr>
        <tr>
            <td>Manufacturer Details</td>
            <td><form:input path="manuDetails" value="${product.manuDetails}"/></td>
        </tr>
        <tr>
            <td>Price :</td>
            <td><form:input path="price" value="${product.price}"/></td>
        </tr>
        <tr>
             <td colspan="2"><input type="submit" name="action" value="Submit" />
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