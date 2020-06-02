<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="style.css">
<meta charset="ISO-8859-1">
<title>Weather Report</title>
</head>
<body>


<h2> Weather for ${area}</h2>
<table>
 <tr>
  <th>Day</th>
  <th>High<br>low</th>
  <th>Temp.</th>
  <th>Weather</th>
  <th></th>
 </tr>
 <tr>
  <td><c:forEach var="days" items="${days}"><br><c:out value="${days}" />
</c:forEach></td>
  <td><c:forEach var="highL" items="${highL}"><br><c:out value="${highL}" />
</c:forEach></td>
  <td><c:forEach var="temp" items="${temperature}"><br><c:out value="${temp}" />
</c:forEach></td>
  <td><c:forEach var="summary" items="${summary}"><br><c:out value="${summary}" /> 
</c:forEach></td>

 </tr>
</table>

<h3>Detailed Forcast</h3>
<table>
 <tr>
  <th></th>
 </tr>
 <tr>
  <td style="font-size:9px"><c:forEach var="days" items="${days}"><br><c:out value="${days}" />
</c:forEach></td>
 <td style="font-size:9px"><c:forEach  var="text" items="${text}"><br><c:out value="${text}" />
</c:forEach></td>

 </tr>
</table>

...





</body>
</html>