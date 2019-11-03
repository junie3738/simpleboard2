/*
 * package com.kia.board;
 * 
 * import java.io.IOException; import javax.servlet.ServletException; import
 * javax.servlet.annotation.WebServlet; import javax.servlet.http.HttpServlet;
 * import javax.servlet.http.HttpServletRequest; import
 * javax.servlet.http.HttpServletResponse;
 * 
 * 
 * @WebServlet("/del") public class BoardDelServelt extends HttpServlet {
 * private static final long serialVersionUID = 1L;
 * 
 * 
 * 
 * protected void doGet(HttpServletRequest request, HttpServletResponse
 * response) throws ServletException, IOException { String str_board =
 * request.getParameter("i_board"); int i_board = Integer.parseInt(str_board);
 * 
 * int result = BoardDao.Dodelboard(i_board);
 * 
 * response.sendRedirect("list");
 * 
 * }
 * 
 * 
 * 
 * }
 */