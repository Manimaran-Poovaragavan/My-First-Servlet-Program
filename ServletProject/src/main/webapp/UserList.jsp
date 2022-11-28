<%@ page import="java.util.List" %>
<%@ page import="com.servlet.dto.User" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Users List Page</title>
</head>
<body>
     <h1>The users informations are</h1>
     
     <div>
      
        <table border="1">
        <tr>
           <td>First name</td>
           <td> Father name</td>
           <td>DOB</td>
           <td>Mobile no</td>
           <td>Email</td>
           <td>Qualification</td>
           </tr>
           
           <%
             
             List<User> userList =(List<User>)request.getAttribute("users");
             for(User userobj : userList){
            	 
           %>
                <tr>
                <td><%= userobj.getFirstname() %></td>
                <td><%= userobj.getFathername() %></td>
                <td><%= userobj.getDob()%></td>
                <td><%= userobj.getMobileno() %></td>
                <td><%= userobj.getEmail() %></td>
                <td><%= userobj.getQualification() %> </td>
                </tr>
           <%
           
             }
             
             %>
        </table>
     </div>
</body>
</html>