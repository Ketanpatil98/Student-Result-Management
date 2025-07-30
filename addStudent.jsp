<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <title>Add Student Result</title>
  <link rel="stylesheet" href="css/style.css">
</head>
<body>
  <div class="container">
    <h2>Add Student Result</h2>
    <form action="AddStudentServlet" method="post">
  <label>Name:</label>
  <input type="text" name="name" required><br><br>

  <label>Roll No:</label>
  <input type="text" name="roll_no" required><br><br>

  <label>English:</label>
  <input type="number" name="english" required><br><br>

  <label>Maths:</label>
  <input type="number" name="maths" required><br><br>

  <label>Science:</label>
  <input type="number" name="science" required><br><br>
  
   <label>Marathi:</label>
  <input type="number" name="Marathi" required><br><br>
  
   <label>Hindi:</label>
  <input type="number" name="Hindi" required><br><br>
  
   <label>History:</label>
  <input type="number" name="History" required><br><br>
  
   <label>Geography:</label>
  <input type="number" name="Geography" required><br><br>

  <input type="submit" value="Submit Result">
</form>

  </div>
</body>
</html>
