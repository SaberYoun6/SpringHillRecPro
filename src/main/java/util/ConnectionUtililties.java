package util;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionUtililties {
	private ConnectionUtililties() {
		super();
		
	}
	public Connection getConnection() throws SQLException, IOException {
		
		DriverManager.registerDriver(new org.postgresql.Driver());
		
		FileInputStream fis = new FileInputStream("src/main/resources/connection.properties");
		Properties property = new Properties();
		property.load(fis);
		
		String url =(String) property.get("url");
		String user = (String) property.get("user");
		String password = (String) property.get("password");
		
		Connection connection = DriverManager.getConnection(url,user,password);
		
		return connection;
		

		
	}
}
