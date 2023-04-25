package app;

import classes.DatabaseConnection;

public class App {
	
	public static void main(String[] args) {
		
		DatabaseConnection connection = DatabaseConnection.getConnection();
		connection.connected();
		
	}

}
