<%@page import=" com.cg.model.Resume"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>

<body>
 <% Resume resume =(Resume) request.getAttribute("Requestrequest");%>
<header>
<h1><%=resume.getFirstName()%>   <%=resume.getLastName() %>  </h1>
<h2>Capgemini Technology Solutions</h2>
<h3>Airoli,Navi Mumbai</h3>
<h4>Maharshtra 400023</h4>
<h4>Contact Number: <%= resume.getContact()%> </h4>
<h4>Email: <%= resume.getEmail()%></h4>


</header>
<h2 align="center"><b>Job Objectives</b></h2>
<hr>
<%=resume.getSummary() %><br>

<h3 align="center"><b>Personal Details</b></h2>
<hr>
<table>
<tr>
<td>
Date Of Birth:</td>
<td><%=resume.getDob()%>
</td>
</tr>

<tr>
<td>
Gender:</td>
<td><%=resume.getGender()%>
</td>
</tr>

<tr>
<td>
Address:</td>
<td><%=resume.getAddress()%>
</td>
</tr>

<tr>
<td>
Website:</td>
<td><%=resume.getWebsite()%>
</td>
</tr>
</table>

<h2 align="center"><b>Skills</b></h2>
<hr>
<%for(String skills: resume.getSkills()){ %>
<%=skills %>&nbsp&nbsp <%
}
%>
<br>

<h2 align="center"><b>Hobbies</b></h2>
<hr>

<%for(String hobbies: resume.getHobbies()){ %>
<%=hobbies %>&nbsp&nbsp <%
}
%><br>
</body>
</html>