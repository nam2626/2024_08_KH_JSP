<%@page import="vo.StudentVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		//getAttribute로 데이터 가져오면 Object로 리턴되기때문에 다시 형변환 해줘야함
		StudentVO vo = (StudentVO)request.getAttribute("vo");
	%>
	<p>학번 : <%=vo.getStudentNo() %></p>
	<p>이름 : <%=vo.getStudentName() %></p>
	<p>학과 : <%=vo.getMajorName() %></p>
	<p>평점 : <%=vo.getStudentScore() %></p>
</body>
</html>


