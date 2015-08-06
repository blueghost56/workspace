<%@ page language="java" contentType="text/html; charset=UTF-8"
    import="java.util.Date"
    pageEncoding="UTF-8"%>
<!doctype html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>insecTown</title>
<style type="text/css">
body{
}
.title-banner{
position:absolute;
 background-color:#2B60DE;
 top:0px;
 left:0px;
 width:100%;
 color:white;
 padding-left:16px;
}
.header-bar{
top:100px;
position:absolute;
 border-radius:5px;
 border:#43C6DB solid;
 margin-left:10px;
}
.tag{
margin-left:16px;

}
.type2{
left:200px;
}
.content{
}
</style>
<script type="text/javascript" src="../js/jquery-2.1.4.min.js"></script>
</head>
<body>
<div class="title-banner">
<h1><i>insecTown be with you</i></h1>
</div>
<jsp:include page="./template/header.jsp"></jsp:include>
<jsp:include page="./template/body.jsp"></jsp:include>
<div style="position: absolute">
<form id="form-1" action="upload" method="post" enctype="multipart/form-data">
 <lable for="myFile">上传文件</lable>
 <input type="file" name="myFile"/>
 <input type="submit" value="上传"/>
</form>
</div>
</body>
</html>