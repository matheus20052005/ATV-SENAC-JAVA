package application;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import db.DB;
import db.DbException;

public class Program {

	public static void main(String[] args) {
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;

		conn = DB.getConnection();
		try {
			st = conn.createStatement();
			rs = st.executeQuery("SELECT * FROM department");

			while (rs.next()) {
				System.out.println(rs.getInt("Id") + " - " + rs.getString("Name"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
			// throw new DbException(e.getMessage());
		}

		finally {
			//rs.close();
			//st.close();
		
			DB.closeStatement(rs);
		    DB.closeStatement(st);
		}

	}

}
