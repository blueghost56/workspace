<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>    
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>insecTown-login</title>
<style type="text/css">
body{
text-align:center;
}
 div{
   width:100%;
   height:100%;
   z-index:10;
   border:2px solid;
border-radius:25px;
   background-color: rgb(100,200,10);
   box-shadow: 10px 10px 5px #888888;
 }
</style>
</head>
<body>
<jsp:useBean id="people" class="com.wayx.system.modle.People" scope="session">
 <jsp:setProperty name="people" property="name" value="jk"/>
</jsp:useBean>
<div id="login_form">
	<form id="form-1" action="./User_login.action">
	 <label for="userName">用户名：</label>
	 <input id="userName" type="text"/><br/>
	 <label for="password">密码：</label>
	 <input id="password" type="password"/><br/>
	 <input type="submit"/>
	</form>
</div>
</body>
</html>