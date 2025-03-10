<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="ca.sheridancollege.beans.*" %>
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
<a href="index.html"><h1 id="title">The Dog Show</h1></a>
</div>
<div id="content">
    <h1 align="center" style="color:white;font-family: cursive;"> Welcome To The Annual Dog Show</h1>
    <img src="images/show.jpg" style="width:60%;margin-left:20%; border:2px solid white;">
<p>s</p>
</div>
<div id="footer">
    <a href="Generate"><button id="generate">Generate Dummy Records</button></a>
    <table id="menu">
    <tr><td>Home</td><td>Add A Dog</td><td>Search Dogs</td><td><a href="GetDogs">Veiw All Dogs</a></td></tr></table>
</div>
</div>
</body>
</html>