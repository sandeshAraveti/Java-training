<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="com.hcl.jdbc.DaoConnection"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
Connection con=DaoConnection.getConnection();
String cmd="select * from Department";
PreparedStatement pst=con.prepareStatement(cmd);
ResultSet rs=pst.executeQuery();
while(rs.next()){
	out.println("Department No "+rs.getInt("deptno")+ "<br/>");
	out.println("Enter Department name "+rs.getString("dname")+ "<br/>");
	out.println("Location "+rs.getString("loc")+ "<br/>");
	out.println(" Enter City "+rs.getString("city")+ "<br/>");
	out.println(" Enter Head"+rs.getString("head")+ "<br/><hr/>");
}


%>

</body>
</html>