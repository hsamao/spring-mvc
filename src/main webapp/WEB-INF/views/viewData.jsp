<%--
  Created by IntelliJ IDEA.
  User: samao
  Date: 12/13/15
  Time: 3:20 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<html>
<head>
    <title>View Data</title>
</head>
<body>


<div class="container">
    <h1> Person Data</h1>

</div>

<table>
    <tr>
        <td><c:out value="${person.id}"/></td>
    </tr>
    <tr>
        <td><c:out value="${person.firstName}"/></td>
    </tr>
    <tr>
        <td><c:out value="${person.lastName}"/></td>
    </tr>
    <tr>
        <td><c:out value="${person.grade}"/></td>
    </tr>
</table>




</body>
</html>
