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
	public static Connection getConnection() throws SQLException, IOException {
		
		DriverManager.registerDriver(new org.postgresql.Driver());
		
		FileInputStream fis = new FileInputStream("src/main/resources/connection.properties");
		Properties property = new Properties();
		property.load(fis);
		
		String urls = (String) property.get("db_url");//(String) System.getenv("POSTDB_URL");
		String user = (String) property.get("db_user");//System.getenv("POSTDB_USER");
		String password = (String) property.get("db_pass");//System.getenv("POSTDB_PASS");
		
		Connection connection = DriverManager.getConnection(urls,user,password);
		
		return connection;
		

		
	}
}
