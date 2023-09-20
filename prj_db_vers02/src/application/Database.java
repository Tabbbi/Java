package application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Database {
	private static String url;
    private static String user;
    private static String pass;
    private static Connection con;
    private static Statement stmt;
    
    public Database() {
    	url = "";
    	user = "";
    	pass = "";
    }
    
    public Database(String pHost, String pDbName, String pUser) {
    	url = "jdbc:mysql://" + pHost + "/" + pDbName;
    	user = pUser;
    	pass = "";
    }
    
    public Database(String pHost, String pDbName, String pUser, String pPass) {
    	url = "jdbc:mysql://" + pHost + "/" + pDbName;
    	user = pUser;
    	pass = pPass;
    }
    
    public static void connect() throws SQLException {
    	con = DriverManager.getConnection(url, user, pass);
	    stmt = con.createStatement();
    }
    
    public static ResultSet query(String pQuery) throws SQLException {
    	return stmt.executeQuery(pQuery);
    }
    
}
