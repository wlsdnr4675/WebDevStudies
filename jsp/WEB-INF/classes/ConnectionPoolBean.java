package soo.db;

import java.sql.*;
import java.util.*;

public class ConnectionPoolBean {
	String url, usr, pwd;
	Hashtable<Connection, Boolean> h; // pool항
	int increment = 3;

	public ConnectionPoolBean() throws ClassNotFoundException, SQLException {
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException cnfe) {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}
		url = "jdbc:mysql://localhost:3306/mvc_test";
		usr = "root";
		pwd = "dkdlxl123";
		h = new Hashtable<Connection, Boolean>();
		for (int i = 0; i < 5; i++) {
			con = DriverManager.getConnection(url, usr, pwd);
			h.put(con, Boolean.FALSE);// 노는 놈
		}
		System.out.println("ConnectionPoolBean created ...");
	}

	public synchronized Connection getConnection() throws SQLException {
		Connection con = null;
		Boolean b = null;
		Enumeration<Connection> e = h.keys();
		while (e.hasMoreElements()) {
			con = e.nextElement();
			b = h.get(con);
			if (!b.booleanValue()) {
				h.put(con, Boolean.TRUE);// 일하는 놈
				return con;
			}
		}
		for (int i = 0; i < increment; i++) {
			h.put(DriverManager.getConnection(url, usr, pwd), Boolean.FALSE);
		}
		return getConnection();
	}

	public void returnConnection(Connection returnCon) throws SQLException {
		Connection con = null;
		Enumeration<Connection> e = h.keys();
		while (e.hasMoreElements()) {
			con = e.nextElement();
			if (con == returnCon) {
				h.put(con, Boolean.FALSE);
				break;
			}
		}
		keepConSu(5);
	}

	public void keepConSu(int su) throws SQLException {
		Connection con = null;
		Boolean b = null;
		int count = 0;
		Enumeration<Connection> e = h.keys();
		while (e.hasMoreElements()) {
			con = e.nextElement();
			b = h.get(con);
			if (!b.booleanValue()) {
				count++; // 노는 놈의 갯수
				if (count >= (su + 1)) {
					h.remove(con);
					con.close();
				}
			}
		}
	}

	public void closeAll() throws SQLException {
		Connection con = null;
		Enumeration<Connection> e = h.keys();
		while (e.hasMoreElements()) {
			con = e.nextElement();
			h.remove(con);
			con.close();
		}
	}
}
