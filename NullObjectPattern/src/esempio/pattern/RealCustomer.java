package esempio.pattern;

public class RealCustomer extends AbstractCustomer{

	public RealCustomer(String name) { //costruttore , name sarebbe quello che ereditiamo da abstract costumer
	      this.name = name;		
	   }
	   
	   @Override
	   public String getName() {
	      return name;  //i due metodi atratti che abbiamo dichiarto su AbstractCustomer
	   }
	   
	   @Override
	   public boolean isNil() {
	      return false; //metodo se serve per capire se se l'oggeto o null, infatt restituisce false perchè lui è realcustomer
	   }
}
