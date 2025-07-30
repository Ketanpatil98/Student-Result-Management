<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%
    String name = request.getAttribute("name") + "";
    String roll = request.getAttribute("roll_no") + "";
    int english = (int) request.getAttribute("english");
    int maths = (int) request.getAttribute("maths");
    int science = (int) request.getAttribute("science");
    int Marathi = (int) request.getAttribute("Marathi");
    int Hindi = (int) request.getAttribute("Hindi");
    int History = (int) request.getAttribute("History");
    int Geography = (int) request.getAttribute("Geography");
%>
<!DOCTYPE html>
<html>
<head>
  <title>Result</title>
  <link rel="stylesheet" href="css/style.css">
</head>
<body>
  <div class="container">
    <h2>Result</h2>
    <div class="result-box">
      <p><strong>Name:</strong> <%= name %></p>
      <p><strong>Roll No:</strong> <%= roll %></p>
      <p><strong>English:</strong> <%= english %></p>
      <p><strong>Maths:</strong> <%= maths %></p>
      <p><strong>Science:</strong> <%= science %></p>
      <p><strong>Marathi:</strong> <%= Marathi %></p>
      <p><strong>Hindi:</strong> <%= Hindi %></p>
      <p><strong>History:</strong> <%= History %></p>
      <p><strong>Geography:</strong> <%= Geography %></p>
      
      
      
   
	
	
    </div>
  </div>
</body>
</html>
