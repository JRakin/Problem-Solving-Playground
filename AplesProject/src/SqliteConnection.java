import java.sql.*;

import javax.swing.JOptionPane;
public class SqliteConnection {

	public static Connection dbConnector()
	{
		try {
			Class.forName("org.sqlite.JDBC");
			Connection con=DriverManager.getConnection("jdbc:sqlite:DB//mydatabase.sqlite");
			return con;
		}catch(Exception e)
		{
			return null;
		}
	}
}
