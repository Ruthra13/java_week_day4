<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="./asset/style.css" /> 
</head>
<body>
    <img src="./asset/Group 3.svg" alt="logo"> 
    <p id="p">This is a test to check if you are eligible to be a part of the unique team of Astronauts who are going to travel to
    space to perform many revolutionary researches. Complete the test and apply now to be a part of SpaceForce Enterprise.
    All The Best!</p>
     <div class="input">
    <form id="myform" action="${pageContext.request.contextPath}/eligible" method="post">
       
            <span class="labelClass">First name: </span><input type="text" name="name" required><br><br>
            <span class="labelClass">Mobile Number: </span><input type="text" name="Number" required><br><br>
            <span class="labelClass">Age: </span><input type="text" name="age" required><br><br>
            <span class="labelClass">Height: </span><input type="text" name="height" required><br><br>
            <span class="labelClass">Weight: </span><input type="text" name="weight" required><br><br>
            <span class="labelClass">Nationality: </span><input type="text" name="country" required>
            
       
    
    </form>
     </div>
<footer>
    <div>
        <input type="submit" value="Next" id="Submit" form="myform">
    </div>
</footer>
</html>