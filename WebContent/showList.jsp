<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.*" %>
    <%@ page import="ca.sheridancollege.beans.*" %>
     <%@ page import="ca.sheridancollege.dao.*" %>
      <%@ page import="ca.sheridancollege.logic.*" %>
       <%@ page import="ca.sheridancollege.dummy.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
    body{
        margin:0px;
        color:white;
        padding:0px;
        background-image: url(images/back.jpg);
        background-size: contain;
    }
#all{
    height:max-content;
width:70%;
margin:auto;
background:black;
    border:3px solid white;

}
    #title{
        position:absolute;
        font-size:60px;
        font-family: impact;
        color:white;
        margin:40px;
        -webkit-text-stroke-width: 3px;
   -webkit-text-stroke-color: black;
        
    }
#header{
width:100%;
height:120px;
    border-bottom: 4px solid white;
background-image: url("images/header.jpg");
background-size:contain;
    background-position: right;
background-repeat:no-repeat;
}
#footer{
border-top: 4px solid white;

}
.container {
	  overflow: hidden;
	  width: 100%;
	  text-align:center;
	  margin: auto;
  display: table;
}

.container td, .container th {
	  padding:5px; 
}

.container tr:nth-child(odd) {
	  background-color: black;
}

.container tr:nth-child(even) {
	  background-color: #2C3446;
}

.container th {
	  background-color: #1F2739;
}


.container tr:hover {
   background-color: #464A52;
-webkit-box-shadow: 0 6px 6px -6px #0E1119;
	   -moz-box-shadow: 0 6px 6px -6px #0E1119;
	        box-shadow: 0 6px 6px -6px #0E1119;
}

.container td:hover {
  background-color: #FFF842;
  color: #403E10;
  font-weight: bold;
  
  box-shadow: #7F7C21 -1px 1px, #7F7C21 -2px 2px, #7F7C21 -3px 3px, #7F7C21 -4px 4px, #7F7C21 -5px 5px, #7F7C21 -6px 6px;
  
}


#generate{
width:200px;
font-size:20px;
background:red;
margin:20px;
padding:10px;
border-radius:20px;
border:3px solid white;
color:white;
}
#generate:hover{
color:red;
background:white;
border:3px solid red;
cursor:grab;
}
#menu{
display:block;
color:white;
float:right;
width:600px;
font-size:30px;
margin:40px;
}
#menu td{
width:200px;
}
#menu td:hover{
color:red;
cursor:grab;
}

</style>
</head>
<body>
<div id="all">
    
<div id="header">
<a href="index.jsp"><h1 id="title">The Dog Show</h1></a>
</div>
<div id="content">
    <h1 align="center" style="color:white;font-family: cursive;"> View All Dogs</h1>
    <table border="2" align="center"   class="container">
	<tr><th>Show List</th></tr>
	<%
	
	ArrayList<String> list= (ArrayList<String>)request.getAttribute("list");
		
	for (int i = 0; i < list.size(); i++) {
%>
	<td><%=list.get(i) %></td>
</tr>
<%	}
	%>
	</table><br><br>

</div>
<div id="footer">
     <a href="Generate"><button id="generate">Generate Dummy Records</button></a>
    <table id="menu">
    <tr><td>Home</td><td>Add A Dog</td><td>Search Dogs</td></tr></table>
</div>
</div>
</body>
</html>