<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
<%-- 
	response객체: 응답을 담당
 	redirect01.jsp-> redirect02.jsp 를 보낸다.
 	그래서 localhost:8080/redirect01.jsp 하면 -> redirect02.jsp페이지가 나온다.
 --%>
<%
	response.sendRedirect("redirect02.jsp");
%>