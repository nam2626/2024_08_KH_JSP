<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
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
	<p>request 영역에 저장된 StudentVO 객체를 뽑음</p>
	<!-- 실제로는 필드로 직접 접근이 아니라 get메서드를 호출한것  -->
	<p>${requestScope.vo.studentNo } / ${requestScope.vo.studentName } 
			/ ${requestScope.vo.majorName } / ${requestScope.vo.getStudentScore() }</p>
	
	<!-- if문, test="조건식", 단 else, else if가 없음 -->
	<c:if test="${requestScope.age < 20 }">
		<p>미성년자 입니다.</p>	
	</c:if>
	<c:if test="${requestScope.age >= 20 }">
		<p>성인 입니다.</p>	
	</c:if>
	<!-- choose 여러개 조건문 -->
	<c:choose>
		<c:when test="${requestScope.age >= 20 && requestScope.age < 30 }">
			<p>20대 입니다</p>
		</c:when>
		<c:when test="${requestScope.age >= 30 && requestScope.age < 40 }">
			<p>30대 입니다</p>
		</c:when>
		<c:otherwise>
			<p>40대 이상이거나 미성년자 입니다.</p>
		</c:otherwise>
	</c:choose>
</body>
</html>






