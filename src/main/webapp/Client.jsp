<%--
  Created by IntelliJ IDEA.
  User: sunday
  Date: 01/12/18
  Time: 15:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h2>This is CLient page</h2>

${sessionScope.user.name}
${sessionScope.user.age}

<c:out value="Next user"></c:out>

<jsp:useBean id="NewUser" scope="session" class="com.javaee.domain.User"></jsp:useBean>
<jsp:setProperty name="NewUser" property="age" value="45"/>
<jsp:setProperty name="NewUser" property="name" value="Igor"/>

<c:out value="${NewUser.name}" />
</body>
</html>
