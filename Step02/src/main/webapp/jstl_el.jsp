<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>el 태그 테스트</h2>
	<p>el 태그는 pageScope : 현재 JSP 페이지에 있는 객체,<br> 
		requestScope : 현재 request 객체에 접근, <br> 
		sessionScope : 현재 session 객체에 접근, <br> 
		applicationScope : 어플리케이션 전체에서 공유되는 객체 
	</p>
	<p>request 영역에 저장된 내용은 requestScope를 사용해서 뽑음</p>
	<p>나이 : ${requestScope.age }</p>
</body>
</html>






