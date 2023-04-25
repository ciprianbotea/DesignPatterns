package classes;

public class DatabaseConnection {
	
	private static Integer port = 8080;
	
	private static DatabaseConnection connection = new DatabaseConnection(port);
	
	private DatabaseConnection(int port) {
		DatabaseConnection.port = port;
	}
	
	public static DatabaseConnection getConnection() {
		return connection;
	}
	
	public void connected() {
		System.out.println("Connected! Running on port " + port + ".");
	}

}
