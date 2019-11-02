package com.kia.board;

import java.sql.*;
import java.util.*;

public class BoardDao {
	
public static void main(String[] args) {
		try {
			getCon();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	private static Connection getCon() throws Exception{
		final String URL = "jdbc:mysql://127.0.0.1:3306/jsp?characterEncoding=UTF-8&serverTimezone=UTC";
		final String USER = "root";
		final String PW = "1234";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(URL, USER, PW);
		System.out.println("DB 접속 성공!!");
		return con;
	}
	
	private static void close(Connection con, PreparedStatement ps) {
		close(con, ps, null);
	}
	
	private static void close(Connection con, PreparedStatement ps, ResultSet rs) {
		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if (ps != null) {
			try {
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		if (con != null) {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	//글가져오기
	public static List<BoardVo> getBoardlist() {  //BoardVo(4개의 값을 저장시킬수 있는 그릇)를 여러개 담을수 있는 ArrayList
		List<BoardVo> list = new ArrayList();
		String query = " select i_board, title, regdatetime from t_board ";
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			con=getCon();
			ps = con.prepareStatement(query);
			rs = ps.executeQuery();
			while(rs.next()) {
				int i_board = rs.getInt("i_board");
				String title = rs.getString("title");
				
				String regdatetime = rs.getString("regdatetime");
				
				BoardVo vo = new BoardVo(i_board, title, "", regdatetime);
				list.add(vo);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(con, ps, rs);
		}
		return list;
	}
	
	/*
	 * public static int initboard(BoardVo vo) { int result = 0; String query = "";
	 * Connection con = null; PreparedStatement ps = null;
	 * 
	 * try { con = getCon(); ps = con.prepareStatement(query); result =
	 * ps.executeUpdate();
	 * 
	 * } catch (Exception e) { e.printStackTrace(); } finally { close(con, ps); }
	 * return result;
	 * 
	 * }
	 */
}
