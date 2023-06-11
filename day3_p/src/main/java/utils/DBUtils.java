package utils;
import java.sql.*;
public class DBUtils {
	public static Connection cn;
	//open connection
	//connection is a method in sql 
	public static 	Connection openConnection() throws SQLException{
		String dbURL="jdbc:mysql://localhost:3306/advjava?createDatabaseIfNotExist=true&useSSL=false&allowPublicKeyRetrieval=true";
		Connection cn=DriverManager.getConnection(dbURL,"root","root123");
		System.out.println("connection was established enjoy it");
		return cn;}
	//close connection
		public static void closeConnection() throws SQLException
		{
			if(cn!=null)
				cn.close();
			System.out.println("connection is closed");
		}
	
	
}
