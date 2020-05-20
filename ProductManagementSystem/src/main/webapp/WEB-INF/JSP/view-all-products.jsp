<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product List</title>
<STYLE>
table.center {
    margin-left:auto; 
    margin-right:auto;
  }</STYLE>
</head>
<body >
<div style="text-align:center;">
<h2>PRODUCT MANAGEMENT SYSTEM</h2><br><br><br>
</div>
<div style="text-align:center;">
<h3>VIEW PRODUCTS</h3><br><br><br>
</div>
<div style="text-align:center;">${message}</div><br><br>

   <table border="1"class="center">
       <tr>
       		<th>Pid</th>
           <th>Pname</th>
           <th>Manu Details</th>
           <th>Price</th>
           <th>Action</th>
       </tr>
       <c:forEach items="${prodList}" var="p">
       <tr>
       		<td>${p.pid}</td>
           <td>${p.pname}</td>
           <td>${p.manuDetails}</td>
           <td>${p.price}</td>
           
           <td>
              <form action="/search">
                <input type="submit" value="Update/Delete" style="background:none;border:0px;cursor: pointer;"/>
                <input type="hidden" name="pid" value="${p.pid}"/>
              </form>
           </td>
       </tr>
       </c:forEach>
 </table>
 <br>
 <br>
 
 <div style="text-align:center;">
<a href="/">Home</a><br><br><br>
</div>
 
</body>
</html>