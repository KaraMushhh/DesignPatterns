package esempio.pattern;

public class NullCustomer extends AbstractCustomer{

	@Override
	   public String getName() {
	      return "Not Available in Customer Database"; 
	   }

	   @Override
	   public boolean isNil() {
	      return true;  //serve per sostuire il metodo a null per quello restituisce true
	   }
}
