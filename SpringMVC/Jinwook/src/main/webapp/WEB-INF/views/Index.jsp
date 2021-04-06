<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>sp01 Index</title>
</head>
<body style="text-align:center">
	<h1>Sp01 Index</h1>
	<p>
	<a href = "/test">M01</a>
	<a href = "/test/base1">M02</a>
	<a href = "/test/base2">M03</a>
	<a href = "/test/base3">M04</a>
	<a href = "/test/form">form</a>
	</p>
	
	<p>
	<a href="/test/param1?name=홍길동&age=20">파라미터</a>
	<a href="/test/param2?name=슬기&age=24">파라미터2</a>
	</p>
	<p>
	<!-- [] => %5B %5D -->
		<a href="/test/param6?list%5B0%5d.name=슬기&list%5B0%5d.age=24&list%5B1%5d.name=soonsin&list%5B1%5d.age=20">M10</a>
		<a href="/test/param7?name=슬기&age=24&page=3">M11</a>
	</p>
	
	<p>
		<a href="/test/json1">JSON1</a>
		<a href="/test/json2">JSON2</a>
		<a href="/test/txt">m14</a>
	</p>
</body>
</html>