package prj_db_vers01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DB_Test01 {

	public static void main(String[] args) {
		String url = "jdbc:mysql://109.71.253.24/schule";
	    String user = "dbuser";
	    String pass = "benutzer";

	    try {
		    Connection con = DriverManager.getConnection(url, user, pass);
		    Statement stm = con.createStatement();
		    ResultSet rs = stm.executeQuery("SELECT * FROM kunde;");
		    while(rs.next()){
		    	System.out.println(
		    			rs.getString(2) + ", " + 
		    			rs.getString(3));
		    }
	    } catch (SQLException e) {
	    	System.out.println(e.getMessage());
	    }
	}
}
