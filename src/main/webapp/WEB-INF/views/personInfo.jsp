<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: samao
  Date: 12/13/15
  Time: 6:12 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Person Info</title>
</head>
<body>
<table border="solid">
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
