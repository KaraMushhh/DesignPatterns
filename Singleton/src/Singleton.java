class DBConnection{
	private static DBConnection instance =null; //creo una varibale di tipo privato di tipo DBConnection
	
	private DBConnection() {}; // costruttore dell'oggetto in questo caso vuoto
	
	public static DBConnection getInstance() { //deve restituire un oggeto getinstance
		if (instance == null)                                        
		instance = new DBConnection(); // creo l'oggeto di tipo DBConnection
		return instance; //ritorno oggetto
	}
	
}
public class Singleton {

	public static void main(String[] args) {
		DBConnection db = DBConnection.getInstance(); //essendo il costruttore di tipo private posso creare solamente attraverso getInstance()
		DBConnection db2 = DBConnection.getInstance();
		if(db==db2) System.out.println("sono uguali");
		else System.out.println("sono diversi");
	}

}
