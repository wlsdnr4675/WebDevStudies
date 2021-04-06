<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%! //라이프 사이클
	public void jspInit(){ // 메모리에 올라갈때 수행 (첫번째 요청에 의해)
	System.out.println("jspInit()");
}
public void jspDestroy(){ //메모리에 올라갈때 (페이지가 갱신, 서버에 정책 ))
System.out.println("jspDestroy()");
}
%>

<% System.out.println("_jspService()");
//요청이 있을때 마다  %> 