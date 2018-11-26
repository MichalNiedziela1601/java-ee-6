<%--
  Created by IntelliJ IDEA.
  User: sunday
  Date: 26.11.2018
  Time: 20:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Show hash</title>
</head>
<body>
<p>Result of hash: <%= request.getAttribute("md5hash") %></p>
<a href="index.jsp">Main Page</a>

<p>${header.host}</p>
</body>
</html>
