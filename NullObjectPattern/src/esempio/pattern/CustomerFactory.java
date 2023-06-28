package esempio.pattern;

public class CustomerFactory {
	
	public static final String[] names = {"Rob", "Joe", "Julie"}; //creato array di stringhe e valori consentiti 

	   public static AbstractCustomer getCustomer(String name){
	   
	      for (int i = 0; i < names.length; i++) {
	         if (names[i].equalsIgnoreCase(name)){
	            return new RealCustomer(name); //se è presente inserisci l'utente 
	         }
	      }
	      return new NullCustomer(); //altrimenti ritorna un nuovo oggetto di tipo null e non una nullpointexception, 
	   }
}
