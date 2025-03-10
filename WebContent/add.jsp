<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="ca.sheridancollege.logic.*" %>
    <%@ page import="ca.sheridancollege.dummy.*" %>
    <%@ page import="ca.sheridancollege.beans.*" %>
    <%@ page import="ca.sheridancollege.dao.*" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
    body{
        margin:0px;
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
td{
padding:5px;
width:200px;}
form {
	background: #fff;
	padding: 4em 4em 2em;
	max-width: 60%;
	margin: auto;
	box-shadow: 0 0 1em #222;
	border-radius: 5px;
}

label {
	display: inline;
	font-size: 20px;
	margin: 3px;
	color: #333;
}
select {
height:50px;
	display: block;
	box-sizing: border-box;
	width:100%;
	outline: none;
	margin: 5px;
	background: #f5f5f5;
	border: 1px solid #e5e5e5;
	font-size: 1em;
	padding: .8em .5em;
	border-radius: 5px;
	
}
input[type="text"],input[type="number"] {
height:50px;

	box-sizing: border-box;
	width: 100%;
	outline: none;
	margin: 5px;
	margin-bottom:10px;
	background: #f5f5f5;
	border: 1px solid #e5e5e5;
	font-size: 1em;
	padding: .8em .5em;
	border-radius: 5px;
}


input[type="submit"] {
	background: orange;
	height:40px;
	box-shadow: 0 3px 0 0 #1D3C6A;
	border-radius: 5px;
	border: none;
	color: #fff;
	cursor: pointer;
	display: block;
	font-size: 20px;
	line-height: 1.6em;
	margin: 2em 0 0;
	outline: none;
	text-shadow: 0 1px #68B25B;
}
#content{
padding:20px;
}
#footer{
border-top: 4px solid white;

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
#generate:focus{
background:orange;
content: 'Generating...';
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
<% IdHandler id = new IdHandler();Dog d = new Dog();DAO d1 = new DAO();
String ide = String.valueOf(id.generateId());d.setId(ide);d1.check(d);%>
<div id="all">
    
<div id="header">
<a href="index.html"><h1 id="title">The Dog Show</h1></a>
</div>
<div id="content">
    <h1 align="center" style="color:white;font-family: cursive;"> Add A New Dog</h1>
    <form action="add" method="get">
    <table>
    
		<h2>Check the correct answer</h2>
		<tr>
		<td><label>Dog ID</label></td><td><input name="id" type="text" value="<%= d.getId()%>"readonly></td></tr>
		<tr><td><label>Dog Name</label></td><td><input name="name" type="text"  required></td></tr>
			<tr>	<td><label>Dog Breed</label></td><td><select name="breed" required>
				<option disabled selected>Choose here</option>
				<%for(int i=0;i< breeds.values().length;i++){ %>
				<option value="<%= breeds.toString(breeds.values()[i]) %>"><%=breeds.toString(breeds.values()[i])%></option>
				<%} %>
				</select></td></tr>
				<tr>	<td><label>Dog Group</label></td><td><select name="group" required>
				<option disabled selected>Choose here</option>
				<%for(int i=0;i< groups.values().length;i++){ %>
				<option value="<%= groups.toString(groups.values()[i]) %>"><%=groups.toString(groups.values()[i])%></option>
				<%} %>
				</select></td></tr>
				<tr>	<td><label>Dog Gender</label></td><td><select name="gender" required>
				<option disabled selected>Choose here</option>
				<option value="Male">Male</option>
			   <option value="Female">Female</option>
				</select></td></tr>
				<tr>	<td><label >Owner Name</label></td><td><input name="owner" type="text" required></td></tr>
				<tr>	<td><label >Speciality Dog</label><input name="type" type="radio" value="Speciality Dog" required></td><td><label >Class Dog</label><input name="type" type="radio" value="Class Dog" required></td></tr>
				<tr>	
				
				<tr>	<td><input type="submit" value="SUBMIT" ><br></td></tr>
				</table>
		</form>
</div>
<div id="footer">
      <a href="Generate"><button id="generate">Generate Dummy Records</button></a>
    <table id="menu">
    <tr><td>Home</td><td>Add A Dog</td><td>Search Dogs</td></tr></table>
</div>
</div>
</body>
</html>