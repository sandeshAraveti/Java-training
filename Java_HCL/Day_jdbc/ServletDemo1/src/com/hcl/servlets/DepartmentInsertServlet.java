package com.hcl.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DepartmentInsertServlet
 */
@WebServlet("/DepartmentInsertServlet")
public class DepartmentInsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DepartmentInsertServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String cmd="INSERT INTO Department VALUES(?,?,?,?,?)";
		Connection con=DaoConnection.getConnection();
		PrintWriter out=response.getWriter();
		try {
			PreparedStatement pst=con.prepareStatement(cmd);
			pst.setInt(1, Integer.parseInt(request.getParameter("Deptno")));
			pst.setString(2, request.getParameter("Dname"));
			pst.setString(3, request.getParameter("City"));
			pst.setString(4, request.getParameter("Loc"));
			pst.setString(5, request.getParameter("Head"));
			pst.executeUpdate();
			out.println("*** Record Inserted***");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
