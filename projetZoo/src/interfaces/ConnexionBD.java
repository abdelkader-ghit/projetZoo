package interfaces;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.swing.JOptionPane;
public class ConnexionBD {
	Connection conn = null;
	public static Connection connexionbd(){
		try {
		    Class.forName("com.mysql.jdbc.Driver");
		    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/gestionzoo","root","");
		    return conn;
		} catch (Exception e){
		   JOptionPane.showMessageDialog(null, e);
		}
		return null;

	}
	}
