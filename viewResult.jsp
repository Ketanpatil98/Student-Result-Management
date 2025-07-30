<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <title>View Result</title>
  <link rel="stylesheet" href="css/style.css">
</head>
<body>
  <div class="container">
    <h2>View Student Result</h2>
    <form action="ViewResultServlet" method="post">
      <label>Enter Roll Number:</label>
      <input type="text" name="roll_no" required>
<br><br>
      <input type="submit" value="View Result">
    </form>
  </div>
</body>
</html>
