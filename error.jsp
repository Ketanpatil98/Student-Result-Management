<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <title>Error</title>
  <link rel="stylesheet" href="css/style.css">
</head>
<body>
  <div class="container">
    <h2 class="error">Error Occurred</h2>
    <p class="error">${error}</p>
    <form action="index.jsp">
      <input type="submit" value="Back to Home">
    </form>
  </div>
</body>
</html>
