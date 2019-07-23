package training.jdbc.connections;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class GetConnection {
	static Connection connection;
	public ResultSet rs1,rs2,rs3;
	public PreparedStatement ps, ps1, ps12;
	public static Connection getMysqlConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver"); //static code in the driver class executes
			connection = DriverManager.getConnection("jdbc:mysql://localhost/saidb","root","mysql");
			return connection;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
	
	public static Connection getOracleConnection() {
		return null;
	}
}
