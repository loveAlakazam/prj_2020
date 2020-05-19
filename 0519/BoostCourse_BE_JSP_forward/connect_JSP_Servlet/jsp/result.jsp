<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>result jsp</title>
</head>
<body>

<%--
	int v1= (int)request.getAttribute("v1");
	LogicServlet클래스에서 값 v1을 request객체에게  "v1"이라는 이름으로 칭하면서 v1을 맡김
	맡긴 값 v1을 request.getAttribute("v1") 을 통해서 받아와서 jsp에 출력한다. 
 --%>

<%
	
	int v1= (int)request.getAttribute("v1"); //"v1"이라고 맡긴 이름의 값을 되찾아서 jsp에 출력
	int v2= (int)request.getAttribute("v2"); //"v2"라고 맡긴 이름의 값을 되찾아서 jsp에 출력
	int result=(int)request.getAttribute("result");
%>


<%--v1, v2, result를 result.jsp에 출력한다 --%>
v1: <%= v1 %><br>
v2: <%= v2 %><br>

v1+v2: <%=v1 %> + <%=v2 %> = <%=result %><br>
</body>
</html>