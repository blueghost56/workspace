<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    %>
<!doctype htm>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="people" class="com.wayx.system.modle.People"></jsp:useBean>
</br>
<jsp:getProperty property="name" name="people"/>
<jsp:setProperty property="col" name="results" value="${i mod 4}"/>
<a href="javascript:window.history.go(-1)">go</a>
</body>
</html>