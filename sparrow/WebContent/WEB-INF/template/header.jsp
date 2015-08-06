<%@ page language="java" contentType="text/html; charset=UTF-8"
    import="java.util.Date"
    pageEncoding="UTF-8"%>
<%!
String[] imgs={
		"../imags/mantodea.jpg",
		"../imags/hymenopus-coronatus.jpg",
		"../imags/phyllocrania-paradoxa.jpg"
};
%>
<% for(int i=0;i<imgs.length;i++){ %>
<div class="header-bar" style="left:<%=i*200%>px;">
 <a href="#" class="tag">Mantodea</a><br/>
 <p style="text-align: center">
 <img  class="content" alt="" src="<%=imgs[i]%>" width="150" height="250"/></p>
</div>
<%} %>
