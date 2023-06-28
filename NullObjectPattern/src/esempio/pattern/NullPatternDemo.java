package esempio.pattern;

public class NullPatternDemo {
	public static void main(String[] args) {

	      AbstractCustomer customer1 = CustomerFactory.getCustomer("Rob");
	      AbstractCustomer customer2 = CustomerFactory.getCustomer("Bob"); //vengono creati 4 riferimenti a questi 4 oggetti, rob, joe, julie si trovano nella lista
	      AbstractCustomer customer3 = CustomerFactory.getCustomer("Julie"); //quindi dopo verranno stampati solo i nomi che sono presenti nella lista
	      AbstractCustomer customer4 = CustomerFactory.getCustomer("Laura"); //mentre per quanto rigurda gli altri nomi non verrà lanciata una nullpointexception ma un oggetto 
	      // con scritto "not avaiable in customer databse"
	      System.out.println("Customers");
	      System.out.println(customer1.getName());
	      System.out.println(customer2.getName());
	      System.out.println(customer2.isNil()); //oggetto di riferimento per sostuire il null
	      System.out.println(customer3.getName());
	      System.out.println(customer4.getName());
	   }
}
