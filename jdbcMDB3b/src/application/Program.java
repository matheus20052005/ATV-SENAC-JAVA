package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import db.DB;

public class Program {

	public static void main(String[] args) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Connection conn = null;
		PreparedStatement ps = null;
		
		
		try {
			conn = DB.getConnection();
			
			ps = conn.prepareStatement(
					"INSERT INTO seller "
					+ "(Name, Email, Birthdate, BaseSalary, DepartmentId)"
					+ "VALUES "
					+ "(?, ?, ?, ?, ?)", 
					Statement.RETURN_GENERATED_KEYS);
			
			ps.setString(1, "Clemilda Silveira");
			ps.setString(2, "aanderson@gmail.com");
			ps.setDate(3, new java.sql.Date(sdf.parse("22/14/1998").getTime()));
			ps.setDouble(4, 6000);
			ps.setInt(5, 3);
			
			//ps.executeQuery();
			int rowsAffected = ps.executeUpdate();
			
			if (rowsAffected > 0) {
				ResultSet rs = ps.getGeneratedKeys();
				
				while (rs.next()) {
					int id = rs.getInt(1);
					System.out.println("Done! Id = " + id);
				}
				
			} else {
				System.out.println("No rown affected!");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}
		finally {
			DB.closeConnection();
			
			
			}

	}

}
