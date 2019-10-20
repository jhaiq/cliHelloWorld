// index.jsp
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<html>
<body>
<h2>Hello World!</h2>
<%--@elvariable id="user" type="com.ssm.model.User"--%>
<sf:form method="post" modelAttribute="user" action="/toJson">
    用户名:<sf:input path="username"/>
    密码:<sf:password path="password"/>
    <input type="submit" value="提交">
</sf:form>

<%--@elvariable id="country" type="com.ssm.model.Country"--%>
<sf:form method="post" modelAttribute="country" action="/getCountry">
    国家名:<sf:input path="name"/>
    <input type="submit" value="提交">
</sf:form>

</body>
</html>