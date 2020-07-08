package com.qa.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Runner {

	// JDBC driver name and database URL
	static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
//	    refers to my GCP instance
//	    static final String DB_URL = "jdbc:mysql://35.234.143.115/sakila";
//	    Local host on my machine
	static final String DB_URL = "jdbc:mysql://localhost:3306/ipproject2?serverTimezone=UTC";

////	    static final String DB_URL = "jdbc:mysql://localhost:3306/sakila";
	//
//	    // Database credentials
	static final String USER = "root";
	static final String PASS = "oh19sj66";

	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		try {
			// STEP 2: Register JDBC driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			// STEP 3: Open a connection
			System.out.println("Connecting to database...");
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
			stmt = conn.createStatement();

//			String sql1;
//			sql1 = "INSERT INTO customers(`First Name`, `Last Name`, `Email`, `CustomerID`, `Phone`) VALUES ('Jack', 'Sparrow', 'jacksparrow@qa.com', 6, '07582686658')";
//			stmt.executeUpdate(sql1);

//			String sql2;
//			sql2 = "DELETE FROM customers WHERE `CustomerID` = 5";
//			stmt.executeUpdate(sql2);

//			String sql2;
//			sql2 = "UPDATE customers SET `First Name` = 'Ollie' WHERE `CustomerID` = 4";
//			stmt.executeUpdate(sql2);

//			String sql2;
//			sql2 = "SELECT FROM customers WHERE `CustomerID` = 4";
//			stmt.executeQuery(sql2);
//			return String(sql2);

			// STEP 4: Execute a query
			System.out.println("Creating statement...");

			String sql;
			sql = "SELECT * FROM customers";
			ResultSet rs = stmt.executeQuery(sql);

			// STEP 5: Extract data from result set
			while (rs.next()) {
				// Retrieve by column name
				int id = rs.getInt("CustomerID");
				String first = rs.getString("First Name");
				String last = rs.getString("Last Name");

				// Display values
				System.out.println("Fetching information!");
				System.out.print("ID: " + id);
				System.out.print(", First: " + first);
				System.out.println(", Last: " + last);
			}

			// STEP 6: Clean-up environment
			rs.close();
			stmt.close();
			conn.close();
		} catch (SQLException se) {
			// Handle errors for JDBC
			se.printStackTrace();
		} catch (Exception e) {
			// Handle errors for Class.forName
			e.printStackTrace();
		} finally {
//	         finally block used to close resources
			try {
				if (stmt != null)
					stmt.close();
			} catch (SQLException se2) {
			} // nothing we can do
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException se) {
				se.printStackTrace();
			} // end finally try
		} // end try
		System.out.println("Goodbye!");
	}// end main

//	public void create(Customers customers) {
//		try(Connection conn = DriverManager.getConnection(JDBC_DRIVER, USER, PASS);
//				Statement statement = conn.createStatement() {
//					
//					statement.executeUpdate("INSERT INTO customers(First Name, Last Name) VALUES('" +
//				            customers.getFirstName() + "','" + customers.getSurname() + "')");
//		} catch (SQLException e) {
//			Logger(e.getStackTrace());		
//					
//		}

//	}

	private void Logger(StackTraceElement[] stackTrace) {
		// TODO Auto-generated method stub

	}
}
// end FirstExample
