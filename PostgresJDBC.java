package com.tnsif.postgresql;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PostgresJDBC {
	public static void main(String[] args) {
		    String jdbcUrl = "jdbc:postgresql://localhost:5432/postgres";
	        String username = "postgres";
	        String password = "root";
	        try (Connection conn = DriverManager.getConnection(
	                "jdbc:postgresql://127.0.0.1:5432/postgres", "postgres", "root")) {
	            if (conn != null) {
	                System.out.println("Connected to the database!");
	            } else {
	                System.out.println("Failed to make connection!");
	            }
	        } catch (SQLException e) {
	            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	}
}
