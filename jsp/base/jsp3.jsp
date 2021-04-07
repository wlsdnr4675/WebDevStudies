<%@ page contentType="text/html;charset=utf-8"%>

<!DOCTYPE html>
<html>
	<head>
		<title>EL</title>
		<meta charset="utf-8">
	</head>
	<body style="text-align:center">

		<h2> EL </h2>
<%
     request.setAttribute("obj", new String("졸립죠?")); //at Controller 
	 session.setAttribute("user", new String("홍길동")); //at Controller 
	 session.setAttribute("obj", new String("괜찮아요")); //at Controller 
%>
        <% 
		     String result = (String)request.getAttribute("obj");
			 //out.println(result);  --> java 코드
		%>
        Scripting Elements 사용!!: <%=result%> <br/>

        EL사용결과1: ${sessionScope.obj} <br/>
		EL사용결과2: ${user}
	</body>
</html>
