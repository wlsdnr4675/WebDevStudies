<%@ page contentType="text/html;charset=utf-8" import="java.sql.*"%>
<%!
	Connection con;
	PreparedStatement pstmt;
	String sql = "insert into ADDRESS(name,addr,rdate) values(?, ?, default)";
    public void jspInit(){ 
		try{
			Class.forName("com.mysql.jdbc.Driver");; 
			String url = "jdbc:mysql://localhost:3306/mvc_test"; //mysql
			con = DriverManager.getConnection(url, "root", "dkdlxl123"); //oracle 
			pstmt = con.prepareStatement(sql);
		}catch(ClassNotFoundException cf){
		}catch(SQLException se){
		}
    } 
	public void jspDestroy(){
		try{
			if(pstmt != null) pstmt.close();
			if(con != null) con.close();
		}catch(SQLException se){}
    } 
%>
<%
	request.setCharacterEncoding("utf-8");
    String name = request.getParameter("name");
	String addr = request.getParameter("addr");
	try{
		pstmt.setString(1, name);
		pstmt.setString(2, addr);
		int i = pstmt.executeUpdate();
		//if(i>0) System.out.println("insert success");
		//else System.out.println("insert fail");
		response.sendRedirect("list.jsp");
	}catch(SQLException se){
	}
%>