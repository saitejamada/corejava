package com.employee_application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class EmployeeApplication {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
//1). Loading or Registering the Jdbc Driver
Class.forName("oracle.jdbc.driver.OracleDriver");
//2). Creating the Connection Object
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:oracle","c##scott2","tiger");

//Step3 Create Statement Object
Statement stmt=con.createStatement();

//Step 4 execute the query
ResultSet rs=stmt.executeQuery("select * from emp1");

while(rs.next())
{
System.out.println(""+rs.getInt(1));
System.out.println(""+rs.getString(2));
}
con.close();
}
}
