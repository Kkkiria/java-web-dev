<%--
  Created by IntelliJ IDEA.
  User: 联想
  Date: 2019/9/27
  Time: 22:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>首页</title>
</head>
<body>
<h2>首页</h2>
<%=request.getAttribute("username")%>
<%=request.getAttribute("password")%>
<h3>欢迎您：${pageContext.request.getAttribute("username")}</h3>
<h3>您的密码是：${pageContext.request.getAttribute("password")}</h3>
<h3>这里是response跳转的用户名：
    <%=session.getAttribute("username")%>
    <a href="login.html" target="_blank">点击返回登陆</a></h3>
</body>
</html>
