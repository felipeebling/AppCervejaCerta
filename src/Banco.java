import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Banco {
	
	
private Banco() {}
		
		public static Connection getConexao() {
	        try {
	            return DriverManager.getConnection("jdbc:mysql://localhost/cerveja", "root", "");
	        } catch (SQLException e) {
	            throw new RuntimeException(e);
	        }
	    }
	}


