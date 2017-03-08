package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class DatabaseConexion {
	protected Connection con = null;
	final String url= "jdbc:mysql://192.168.1.61:3306/";
	final String empresa="enterprise";
	final String driver="com.mysql.jdbc.Driver";
	final String username="josu";
	final String password="admin";
	
	public DatabaseConexion(){
		try {

			Class.forName(driver);
		} catch(ClassNotFoundException e){
			e.printStackTrace();
			return;
		}
		try{
			con=DriverManager.getConnection(url+empresa,username,password);
		}catch (SQLException e) {
			JOptionPane.showMessageDialog(null, e);
		}
	}
	public Connection getConexion(){
		return con;
	}
	public void desconectarBBDD(){
		con=null;
		if(con==null){
			System.out.println("Se ha desconectado de la base de datos.");
		}
		
	}

	
}
