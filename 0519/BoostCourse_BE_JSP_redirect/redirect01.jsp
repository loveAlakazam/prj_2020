<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
<%-- 
	response��ü: ������ ���
 	redirect01.jsp-> redirect02.jsp �� ������.
 	�׷��� localhost:8080/redirect01.jsp �ϸ� -> redirect02.jsp�������� ���´�.
 --%>
<%
	response.sendRedirect("redirect02.jsp");
%>