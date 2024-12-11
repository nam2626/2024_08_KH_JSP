<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	.file_drop_area{
		width:200px;
		height: 200px;
		border : 2px dashed #e9e9e9;
		background-image: url('img/file.png');
		background-repeat: no-repeat;
		background-position: center;
	}
	#file{
		display:none;
	}
</style>
</head>
<body>
	<form action="./fileUpload.do" enctype="multipart/form-data" method="post">
		<div class="file_drop_area"></div>
		<input type="file" name="file" id="file"> 
		<button>전송</button>
	</form>
	<hr>
	<div class="file_list_view"></div>
</body>
</html>