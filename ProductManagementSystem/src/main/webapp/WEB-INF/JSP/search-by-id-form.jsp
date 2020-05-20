<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
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
<h3>VIEW PRODUCT BY ID</h3><br><br><br>
</div>
   <table class="center">
       <tr>
           <th>Enter Product Id:</th>
       </tr>
       <tr>
           <td>
              <form action="/search">
              	<input type="text" name="pid" id="pid"/><br><br>
                <input type="submit" value="Search" >
              </form>
           </td>
       </tr>
 </table>
 <br>
 <br>
 
 <div style="text-align:center;">
<a href="/">Home</a><br><br><br>
</div>
 
</body>
</html>